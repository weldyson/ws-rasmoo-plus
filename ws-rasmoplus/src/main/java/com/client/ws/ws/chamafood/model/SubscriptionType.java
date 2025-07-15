package com.client.ws.ws.chamafood.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Table (name = "subscriptions_type")
@Entity


public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")

    private Long id;
    private String name;

    @Column (name = "access_month")
    private  Long accessMonth;

    private BigDecimal price;
    @Column (name = "product_key")
    private String productKey;


    public SubscriptionType() {
    }

    public SubscriptionType(Long id, String productKey, BigDecimal price, Long accessMonth, String name) {
        this.id = id;
        this.productKey = productKey;
        this.price = price;
        this.accessMonth = accessMonth;
        this.name = name;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getAccessMonth() {
        return accessMonth;
    }

    public void setAccessMonth(Long accessMonth) {
        this.accessMonth = accessMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

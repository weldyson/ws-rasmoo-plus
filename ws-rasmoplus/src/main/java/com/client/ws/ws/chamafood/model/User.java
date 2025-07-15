package com.client.ws.ws.chamafood.model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "users_id")

    private Long id;
    private String name;
    private String email;
    private String cpf;

    @Column(name = "dt_subscription")
    private LocalDate dtSubscription = LocalDate.now();

    @Column(name = "dt_expiration")
    private LocalDate dtExpiration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subscriptions_type_id")
    private SubscriptionType subscriptionType;



    public User(SubscriptionType subscriptionType, UserType userType, LocalDate dtExpiration, LocalDate dtSubscription, String cpf, String email, String name, Long id) {
        this.subscriptionType = subscriptionType;
        this.userType = userType;
        this.dtExpiration = dtExpiration;
        this.dtSubscription = dtSubscription;
        this.cpf = cpf;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public User() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public LocalDate getDtExpiration() {
        return dtExpiration;
    }

    public void setDtExpiration(LocalDate dtExpiration) {
        this.dtExpiration = dtExpiration;
    }

    public LocalDate getDtSubscription() {
        return dtSubscription;
    }

    public void setDtSubscription(LocalDate dtSubscription) {
        this.dtSubscription = dtSubscription;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

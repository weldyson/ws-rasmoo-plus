package com.client.ws.rasmooplus.service;

import com.client.ws.rasmooplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(String id);

    SubscriptionType create(SubscriptionType subscriptionType);
    SubscriptionType update(SubscriptionType subscriptionType);

    void delete(Long id);



}

package com.client.ws.ws.chamafood.repository;

import com.client.ws.ws.chamafood.model.SubscriptionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType,Long> {
}
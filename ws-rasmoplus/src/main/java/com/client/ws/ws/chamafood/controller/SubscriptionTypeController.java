package com.client.ws.ws.chamafood.controller;

import com.client.ws.ws.chamafood.model.SubscriptionType;
import com.client.ws.ws.chamafood.repository.SubscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    @Autowired
    private SubscriptionTypeRepository subscriptionTypeRepository;

    @GetMapping()
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeRepository.findAll());
    }
}
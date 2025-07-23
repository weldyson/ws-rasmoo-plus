package com.client.ws.ws.chamafood.repository;


import com.client.ws.ws.chamafood.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
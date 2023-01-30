package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Citizen;


public interface UserRepository extends JpaRepository<Citizen, Integer> {

}

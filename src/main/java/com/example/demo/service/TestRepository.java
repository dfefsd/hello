package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Join;

public interface TestRepository extends JpaRepository<Join, Long> {

}

package com.example.question01.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.question01.entity.Product;

public interface Productrepo extends JpaRepository<Product, String> {

}

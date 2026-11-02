package com.teks.example.repository;

import com.teks.example.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Integer> {

}

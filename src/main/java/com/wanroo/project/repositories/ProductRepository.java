package com.wanroo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanroo.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

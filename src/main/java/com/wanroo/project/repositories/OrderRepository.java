package com.wanroo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanroo.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

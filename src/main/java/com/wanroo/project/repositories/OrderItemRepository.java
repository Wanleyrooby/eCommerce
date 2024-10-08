package com.wanroo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanroo.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}

package com.sneakerz_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sneakerz_store.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

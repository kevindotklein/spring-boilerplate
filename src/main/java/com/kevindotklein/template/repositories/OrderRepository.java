package com.kevindotklein.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevindotklein.template.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

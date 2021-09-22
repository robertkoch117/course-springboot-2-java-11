package com.coursejavaudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaudemy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

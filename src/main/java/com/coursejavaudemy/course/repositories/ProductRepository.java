package com.coursejavaudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaudemy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

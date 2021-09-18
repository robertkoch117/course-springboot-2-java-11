package com.coursejavaudemy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejavaudemy.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

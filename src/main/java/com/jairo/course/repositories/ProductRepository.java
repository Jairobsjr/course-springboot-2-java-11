package com.jairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}

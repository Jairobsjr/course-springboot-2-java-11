package com.jairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}

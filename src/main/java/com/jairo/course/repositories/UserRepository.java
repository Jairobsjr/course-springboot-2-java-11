package com.jairo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}

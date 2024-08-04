package com.example.security_demo_h403;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
}

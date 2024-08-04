package com.example.security_demo_h403;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>{
	List<Role> findByUsername(String username);
}

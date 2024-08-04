package com.example.security_demo_h403;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;
	
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    public void createUser(String username, String rawPassword, String roleName) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(rawPassword)); // Encode password before saving
        userRepository.save(user);
        
        Role role = new Role();
        role.setRole(roleName);
        role.setUser(user);
        roleRepository.save(role);
    }
}

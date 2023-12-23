package com.mintyn.app.repositories;

import com.mintyn.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUserNameOrEmail(String username, String email);

	Boolean existsByUserName(String username);

	Boolean existsByEmail(String email);
}
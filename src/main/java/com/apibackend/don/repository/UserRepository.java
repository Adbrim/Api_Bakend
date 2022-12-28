package com.apibackend.don.repository;

import com.apibackend.don.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}


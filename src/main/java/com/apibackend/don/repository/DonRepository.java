package com.apibackend.don.repository;

import com.apibackend.don.model.Don;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonRepository extends JpaRepository<Don, Long> {
}

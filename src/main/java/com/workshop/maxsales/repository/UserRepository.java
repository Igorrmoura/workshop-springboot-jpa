package com.workshop.maxsales.repository;

import com.workshop.maxsales.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

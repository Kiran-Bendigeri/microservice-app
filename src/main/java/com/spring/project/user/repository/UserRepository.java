package com.spring.project.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.user.entity.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

    Optional<UserDetails> findByUsername(String username);

}
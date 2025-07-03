package com.spring.project.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.project.user.dto.UserDetailsDto;
import com.spring.project.user.entity.UserDetails;
import com.spring.project.user.repository.UserRepository;
import com.spring.project.user.request.UserRegistrationRequest;
import com.spring.project.user.service.UserRegistrationServiceContract;

@Service
public class UserRegistrationService implements UserRegistrationServiceContract {

    private UserRepository repository;

    public UserRegistrationService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<UserDetailsDto> save(UserRegistrationRequest registrationRequest) {
        Optional<UserDetails> userDetailsEntity = repository.findByUsername(registrationRequest.getUsername());
        userDetailsEntity.orElseThrow(RuntimeException::new);
        return null;
    }

    @Override
    public Optional<UserDetailsDto> update(UserDetailsDto detailsDto) {
        return null;
    }

    @Override
    public Optional<List<UserDetailsDto>> getAllUsers() {
        return null;
    }

}

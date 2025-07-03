package com.spring.project.user.service;

import java.util.List;
import java.util.Optional;

import com.spring.project.user.dto.UserDetailsDto;
import com.spring.project.user.request.UserRegistrationRequest;

public interface UserRegistrationServiceContract {

    Optional<UserDetailsDto> save(UserRegistrationRequest registrationRequest);

    Optional<UserDetailsDto> update(UserDetailsDto detailsDto);

    Optional<List<UserDetailsDto>> getAllUsers();

}

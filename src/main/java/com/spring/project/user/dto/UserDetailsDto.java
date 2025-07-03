package com.spring.project.user.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.spring.project.user.constants.Role;

public record UserDetailsDto(Long userId, String username, String emailId, LocalDateTime createdDate, Role role)
        implements Serializable {

}

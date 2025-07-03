package com.spring.project.user.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.record.RecordModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.project.user.dto.UserDetailsDto;
import com.spring.project.user.entity.UserDetails;

@Configuration
public class UserDetailsConvertion {

    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.registerModule(new RecordModule());

        modelMapper.typeMap(UserDetails.class, UserDetailsDto.class).setConverter(userDetails -> {
            UserDetails udetails = userDetails.getSource();
            return new UserDetailsDto(udetails.getUserId(), udetails.getUsername(), udetails.getEmailId(),
                    udetails.getCreatedDate(), udetails.getUserRole());
        });

        modelMapper.typeMap(UserDetailsDto.class, UserDetails.class).setConverter(uDto -> {
            UserDetailsDto userDto = uDto.getSource();
            return UserDetails.builder().userId(userDto.userId()).username(userDto.username())
                    .emailId(userDto.emailId())
                    .createdDate(userDto.createdDate()).userRole(userDto.role()).build();
        });

        return modelMapper;
    }
}

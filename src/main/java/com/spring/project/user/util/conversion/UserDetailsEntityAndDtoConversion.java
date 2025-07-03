package com.spring.project.user.util.conversion;

import org.modelmapper.ModelMapper;

import com.spring.project.user.dto.UserDetailsDto;
import com.spring.project.user.entity.UserDetails;

public class UserDetailsEntityAndDtoConversion {

    private ModelMapper modelMapper;

    public UserDetailsEntityAndDtoConversion(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserDetailsDto covertToDto(UserDetails userDetails) {
        return modelMapper.map(userDetails, UserDetailsDto.class);
    }

    public UserDetails convertToEntity(UserDetailsDto userDetailsDto) {
        return modelMapper.map(userDetailsDto, UserDetails.class);
    }

}

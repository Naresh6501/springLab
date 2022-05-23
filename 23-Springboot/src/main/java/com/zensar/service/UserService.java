package com.zensar.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zensar.dto.*;
import com.zensar.model.*;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

package com.kavidu.jobs.job.service.impl;

import com.kavidu.job.domain.UserRole;
import com.kavidu.job.domain.UserStatus;
import com.kavidu.jobs.job.mapper.UserMapper;
import com.kavidu.jobs.job.modal.User;
import com.kavidu.jobs.job.payload.AuthResponse;
import com.kavidu.jobs.job.payload.LoginRequest;
import com.kavidu.jobs.job.payload.SignupRequest;
import com.kavidu.jobs.job.repository.UserRepository;
import com.kavidu.jobs.job.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {


    private final UserRepository userRepository;

    @Override
    public AuthResponse signup(SignupRequest req) throws Exception {

        // check the user email is already exist
        if(userRepository.existsByEmail(req.getEmail())) {
            throw new  Exception("you provide email is already exists");
        }

        if(req.getRole()== UserRole.ROLE_ADMIN){
            throw new  Exception("cannot self register as admin");
        }

        User user = User.builder()
                .fullName(req.getFullName())
                .email(req.getEmail())
                .password(req.getPassword())
                .role(req.getRole())
                .phone(req.getPhone())
                .status(UserStatus.ACTIVE)
                .lastLogin(LocalDateTime.now())
                .build();


        User savedUser = userRepository.save(user);

        AuthResponse res = new AuthResponse();
        res.setTitle("welcome"+savedUser.getFullName());
        res.setMessage("register successfully");
        res.setJwt("jwt");
        res.setUser(UserMapper.toDTO(savedUser));








        return res;
    }

    @Override
    public AuthResponse login(LoginRequest req) {
        return null;
    }
}

package com.kavidu.jobs.job.service;

import com.kavidu.jobs.job.payload.AuthResponse;
import com.kavidu.jobs.job.payload.LoginRequest;
import com.kavidu.jobs.job.payload.SignupRequest;

public interface AuthService {

      AuthResponse signup(SignupRequest req) throws Exception;
      AuthResponse login(LoginRequest req);
}

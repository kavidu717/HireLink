package com.kavidu.job.dto.response;

import com.kavidu.job.domain.UserRole;
import com.kavidu.job.domain.UserStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserResponse {

      private Long id;
      private String fullName;
      private String email;
      private String phone;
      private String profileimage;
      private UserRole role;
      private UserStatus status;

      private LocalDateTime lastLogin;
      private LocalDateTime createdAt;

}

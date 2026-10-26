package com.kavidu.jobs.job.payload;

import com.kavidu.job.domain.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SignupRequest {

      @NotBlank(message = "full name is required")
      private String fullName;

      @Email(message = "email should be valid")
      @NotBlank(message = "email is required")
      private String email;

      @NotBlank(message = "password is required")
      private String password;


      private String phone;

      @NotNull(message = "role is required")
      private UserRole role;
}

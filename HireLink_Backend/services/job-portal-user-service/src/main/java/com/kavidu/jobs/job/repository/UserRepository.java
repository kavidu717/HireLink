package com.kavidu.jobs.job.repository;

import com.kavidu.jobs.job.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    boolean existsByEmail(String email);

}

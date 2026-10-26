package com.kavidu.jobs.job.controller;

import com.kavidu.job.domain.UserRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String HomeController(){
        return "this is hirelink user service" + UserRole.ROLE_JOB_SEEKER
                ;
    }
}

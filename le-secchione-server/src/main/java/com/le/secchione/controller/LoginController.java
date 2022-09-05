package com.le.secchione.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.le.secchione.domain.User;
import com.le.secchione.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("/getUserDetails")
    public User getUsers(@RequestBody User user ) throws InterruptedException, ExecutionException{
        return loginService.getUserDetails(user.getUsername());
    }

}

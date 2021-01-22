package com.cg.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.login.apiresponses.ApiResponse;
import com.cg.login.apiresponses.LogoutResponse;
import com.cg.login.model.Login;
import com.cg.login.service.LoginService;

@RestController
@RequestMapping("/users")
public class LoginController {

    @Autowired
    private LoginService loginService;
   // @GetMapping("users/allUsers")
    @GetMapping("/all")
    public String mainPage() {
    	return "Main Page";
    }
    @PostMapping("users/login")
    public ApiResponse login(@RequestBody Login loginDto){
        return loginService.login(loginDto);
    }
    
    @GetMapping("users/customer")
    public String customerPage() {
    	return "Customer Page";
    }
    
    @GetMapping("users/admin")
    public String adminPage() {
    	return "Admin Page";
    }
    
    @GetMapping("users/manager")
    public String managerPage() {
    	return "Manager Page";
    }
    
    @PostMapping("users/logout")
    public LogoutResponse logout() throws InterruptedException
    {
    	return loginService.logout();
    }
    
    @GetMapping("/loggedout")
    public String exit() {
    	return "You have been logged out";
    }
}


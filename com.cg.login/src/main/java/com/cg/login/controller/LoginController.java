package com.cg.login.controller;

import java.util.List;

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
//@RequestMapping("/users")
public class LoginController {

    @Autowired
    private LoginService loginService;
   // @GetMapping("users/allUsers")
    @GetMapping("/home")
    public String mainPage() {
    	return "Main Page";
    }
    
    @GetMapping("/users")
    public List<Login> getAllUsers() {
    	return loginService.getAllUsers();
    }
    
    @PostMapping("/loginModule")
    public ApiResponse login(@RequestBody Login loginDto){
        return loginService.login(loginDto);
    }
    
    @GetMapping("/customer")
    public String customerPage() {
    	return "Customer Page";
    }
    
    @GetMapping("/admin")
    public String adminPage() {
    	return "Admin Page";
    }
    
    @GetMapping("/manager")
    public String managerPage() {
    	return "Manager Page";
    }
    
    @PostMapping("/logout")
    public LogoutResponse logout() throws InterruptedException
    {
    	return loginService.logout();
    }
    
    @GetMapping("/loggedout")
    public String exit() {
    	return "You have been logged out";
    }
}


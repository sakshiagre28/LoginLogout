package com.cg.login.util;

import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;

@Service
public class JwtUtil {
	private String SECRET_KEY = "secret";
	
	public String extractUserName(String token)
	{
		return null;	}

}

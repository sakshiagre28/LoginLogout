package com.cg.login;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.cg.login.model.Login;
import com.cg.login.repository.LoginRepository;

@SpringBootTest
class LoginServiceTest {
	
	@Autowired
	LoginRepository repository;
	
	@Test
	@Transactional
	public void testCorrectUsernamePassword() throws Exception
	{
		Login user = new Login();
		user.setUsername("user");
		user.setPassword("user");
		//user.setRole("");
		Login finalUser = repository.findByUsername(user.getUsername());
		assertEquals(user.getPassword(), finalUser.getPassword());
	}
	
	@Test
	@Transactional
	public void testInvalidUsername() throws Exception
	{
		Login user = new Login();
		user.setUsername("invalidUsername");
		user.setPassword("invalidPassword");
		Login finalUser = repository.findByUsername(user.getUsername());
		assertEquals(null, finalUser);
	}
	
	@Test
	@Transactional
	public void testValidUsernameInvalidPassword() throws Exception
	{
		Login user = new Login();
		user.setUsername("user");
		user.setPassword("invalidPassword");
		Login finalUser = repository.findByUsername(user.getUsername());
		assertFalse(user.getPassword() == finalUser.getPassword());
	}

}

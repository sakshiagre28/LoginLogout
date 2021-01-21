package com.cg.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.login.model.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

    Login findByUsername(String username);

}

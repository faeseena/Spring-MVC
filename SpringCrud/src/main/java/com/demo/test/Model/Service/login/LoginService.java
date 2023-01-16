package com.demo.test.Model.Service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.DTO.login.LoginDTO;
import com.demo.test.Model.login.LoginDAO;
@Service
public class LoginService
{ 
	@Autowired
	private LoginDAO dao;
public LoginService()
{
	 System.out.println(this.getClass().getSimpleName()+"Created");
}
public studentDTO userLoginService(LoginDTO dto)
{
	System.out.println("User login Servive started");	
    studentDTO fromdb=dao.userLoginDAO(dto);
	System.out.println("User login Service Ended");
	return fromdb;
}
}

package com.demo.test.Model.update;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.DTO.login.LoginDTO;
import com.demo.test.Model.login.LoginDAO;

public class updateService 
{
@Autowired
private LoginDAO dao;
public updateService()
{
 System.out.println(this.getClass().getSimpleName()+"Created");
}
public studentDTO userupdateService(LoginDTO dto)
{
System.out.println("User login Servive started");	
studentDTO fromdb=dao.userLoginDAO(dto);
System.out.println("User login Service Ended");
return fromdb;
}
}
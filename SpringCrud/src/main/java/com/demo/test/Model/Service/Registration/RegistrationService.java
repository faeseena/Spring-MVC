package com.demo.test.Model.Service.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.Model.DAO.RegistrationDAO;

@Service
public class RegistrationService
{
	@Autowired
	public RegistrationDAO dao;
public RegistrationService() 
{
	 System.out.println(this.getClass().getSimpleName()+"Created");	
}
public void userRegistrationService(studentDTO sdto)
{
	System.out.println("user registration service started");
	
	dao.userRegistrationDAO(sdto);
	System.out.println("user registration service Ended");
}
}

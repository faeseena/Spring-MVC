package com.demo.test.Model.login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.DTO.login.LoginDTO;
@Repository
public class LoginDAO 
{
	@Autowired
	private SessionFactory fact;
	
public LoginDAO()
{
	 System.out.println(this.getClass().getSimpleName()+"Created");
}
public studentDTO userLoginDAO(LoginDTO dto)
{
System.out.println("User login DAO started");	

Session session=fact.openSession();
Query qry=session.createQuery("from studentDTO dto where dto.email='"+dto.getEmail()+"' and dto.pwd='"+dto.getPwd() +"'");
studentDTO fromdb=(studentDTO) qry.uniqueResult();

System.out.println("User login DAO Ended");
return fromdb;
}
}

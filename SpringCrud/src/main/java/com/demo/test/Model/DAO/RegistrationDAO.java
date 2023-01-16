package com.demo.test.Model.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.studentDTO;


@Repository
public class RegistrationDAO 
{
@Autowired	
private SessionFactory fact;
public RegistrationDAO()
{
	 System.out.println(this.getClass().getSimpleName()+"Created");	
}
public void userRegistrationDAO(studentDTO sdto)
{
	System.out.println("user registration DAO started");
     
	Session session=fact.openSession();
	Transaction tx=session.beginTransaction();
	session.save(sdto);
	tx.commit();
	
	System.out.println("user registration DAO Ended");
}
}

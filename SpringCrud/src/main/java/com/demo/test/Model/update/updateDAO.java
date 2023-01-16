package com.demo.test.Model.update;

import java.sql.PreparedStatement;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.DTO.login.LoginDTO;

public class updateDAO 
{
	@Autowired
	private SessionFactory fact;
	public updateDAO()
{
	 System.out.println(this.getClass().getSimpleName()+"Created");
}
public studentDTO userupdateDAO(LoginDTO dto)
{
System.out.println("User login DAO started");	

Session session=fact.openSession();
Query qry=session.createQuery("update studentDTO  set dto.email='"+dto.getEmail()+"' and dto.pwd='"+dto.getPwd() +"'");
PreparedStatement stmt=con.prepareStatement("update emp_table set name='"+e.getName()+"',password='"+e.getPwd()+"',email='"+e.getEmail()+"',country='"+e.getCtry()+"' where id='"+e.getId()+"'");
studentDTO fromdb=(studentDTO) qry.uniqueResult();

System.out.println("User login DAO Ended");
return fromdb;
}
}

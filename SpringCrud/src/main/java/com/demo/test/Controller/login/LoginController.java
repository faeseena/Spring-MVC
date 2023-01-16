package com.demo.test.Controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registration.studentDTO;
import com.demo.test.DTO.login.LoginDTO;
import com.demo.test.Model.Service.login.LoginService;
@Controller
public class LoginController
{
	@Autowired
	private LoginService service;
	
	HttpSession session;
public LoginController() 
{
	 System.out.println(this.getClass().getSimpleName()+"Created");
}
@RequestMapping(value = "/Login.do", method = RequestMethod.POST)
public ModelAndView userLoginController(LoginDTO dto,HttpServletRequest req)
{
	System.out.println("User login Controller started");	
    studentDTO fromdb=service.userLoginService(dto);
    if(fromdb!=null)
    {
         session=req.getSession();
         session.setAttribute("student", fromdb);
    	return new ModelAndView("/Home.jsp","name",fromdb.getSname());
    }
    else
    {
    	return new ModelAndView("/login.jsp");
    }
}
}


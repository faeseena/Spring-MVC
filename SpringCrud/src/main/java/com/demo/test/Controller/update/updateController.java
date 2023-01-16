package com.demo.test.Controller.update;

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
public class updateController
{
	@Autowired
	private LoginService service;
	
	HttpSession session;
public updateController() 
{
	System.out.println("update controler class created");
}

@RequestMapping(value = "/update.do", method = RequestMethod.POST)
public ModelAndView userupdateController(LoginDTO dto,HttpServletRequest req)
{
	System.out.println("User update Controller started");	
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
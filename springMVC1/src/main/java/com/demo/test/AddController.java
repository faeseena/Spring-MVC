package com.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{ 
	
	public AddController()
	{
		System.out.println("add object created");
	}
   @RequestMapping("/add") 
   public ModelAndView add()
   {
	   System.out.println("Iam in add controller");
	   return new ModelAndView("display.jsp");
   }
}

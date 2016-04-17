package com.sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HomeController {

	String message = "Welcome to Spring MVC!";
	 
	@RequestMapping("/")
	//public ModelAndView showMessage(
		//	@RequestParam(value = "name", required = false, defaultValue = "World") String name)
	public ModelAndView m1()
	{
		System.out.println("in controller");
 
		ModelAndView mv = new ModelAndView("home");
		//mv.addObject("message", message);
		//mv.addObject("name", name);
		return mv;

}
@RequestMapping("/index")
public ModelAndView m2()
{
	System.out.println("in controller");
	 
	ModelAndView mv = new ModelAndView("index");
	//mv.addObject("message", message);
	//mv.addObject("name", name);
	return mv;
}
@RequestMapping("/login")
public ModelAndView m3()
{
	System.out.println("in controller");
	 
	ModelAndView mv = new ModelAndView("login");
	//mv.addObject("message", message);
	//mv.addObject("name", name);
	return mv;
}
@RequestMapping("/About")
public ModelAndView m4()
{
	System.out.println("in controller");
	 
	ModelAndView mv = new ModelAndView("About");
	//mv.addObject("message", message);
	//mv.addObject("name", name);
	return mv;
}

@RequestMapping("/content")
public ModelAndView m5(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
{
	ModelAndView mv=new ModelAndView("content");
	return mv;
	
}
}


}

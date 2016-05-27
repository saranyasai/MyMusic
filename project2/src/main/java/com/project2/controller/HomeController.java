package com.project2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	 @RequestMapping("/login")
	    public String login(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout",
	            required = false) String logout, Model model) {
	        if (error!=null) {
	            model.addAttribute("error", "Invalid username and password");
	        }

	         if(logout!=null) {
	            model.addAttribute("msg", "You have been logged out successfully.");
	        }

	      
	        return "login";
	    }
	 @RequestMapping(value = "/user", method = RequestMethod.GET)
		public ModelAndView userPage() {

			ModelAndView model = new ModelAndView();
			//model.addObject("title", "Spring Security Custom Login Form");
			//model.addObject("message", "This is protected page!");
			model.setViewName("success");

			return model;

		}
/*	 @RequestMapping(value="/admin",method=RequestMethod.GET)
	 public ModelAndView adminPage()
	 {
		 ModelAndView model= new ModelAndView();
		 model.setViewName("admin");
		 return model;
		 
	 }*/
	 @RequestMapping(value="/success",method=RequestMethod.GET)
	 public ModelAndView adminuserPage()
	 {
		 ModelAndView model= new ModelAndView();
		 model.setViewName("admin");
		 return model;
		 
	 }
	 
}

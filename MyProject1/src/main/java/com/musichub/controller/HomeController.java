package com.musichub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.musichub.dao.UserService;
import com.musichub.model.User3;

//import com.musichub.dao.UserService;
//import com.musichub.model.User2;
//import com.musichub.model.User3;
@Controller
public class HomeController {
	@Autowired
private UserService us;
	public HomeController(UserService us) {
		// TODO Auto-generated constructor stub
		this.us=us;
	}
	
public HomeController() {
		//super();
	}

@RequestMapping("/")
public String home()
{
	return "home";
}

@RequestMapping("/index")
public String index()
{
	
return "index";
}

@ModelAttribute("user1")
public User3 create()
{
System.out.println("inside modelattribute");
return new User3();
}
@RequestMapping(value="/Register",method=RequestMethod.POST)
public String Register(@ModelAttribute("user1") User3 user)
{
	
us.save1(user);
//System.out.println(user.getName());
return "Register";
}



}

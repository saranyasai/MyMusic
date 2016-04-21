package com.sample.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.AbstractController;


import com.google.gson.Gson;
//import com.day3.Dao.UserDao;
//import com.day3.model.User;
import com.sample.Dao.ProductDao;
import com.sample.Dao.ProductService;
import com.sample.model.Product;
import com.sample.model.User;



@Controller
public class HomeController {

	String message = "Welcome to Spring MVC!";
	private ProductService ps;	 
	@Autowired
	public HomeController(ProductService ps) {
		// TODO Auto-generated constructor stub
		this.ps=ps;
	}

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


@ModelAttribute("user")
public User create()
{
System.out.println("inside modelattribute");
return new User();
}
@RequestMapping(value="/register",method=RequestMethod.POST)
public String doRegister(@ModelAttribute("user") User user)
{
//userService.save(user);
//System.out.println(user.getName());
ps.insert(user);
return "Register";
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

/*@RequestMapping("/content")
public ModelAndView m5(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
{
	ModelAndView mv=new ModelAndView("content");
	return mv;
	
}*/
@RequestMapping("/content")
public String m11()
{
	return "content";
}


@RequestMapping("/content1")
public @ResponseBody String disp(ModelMap model)  
{
//ProductDao ud=new ProductDao();
	//ud.setData();
	//ArrayList<Product>li=ud.getData();

	//ModelAndView mv=new ModelAndView("content");
	//mv.addObject("listUsers",li);
	//return mv;
//	arg0.setAttribute("ss",mv);
//	return ;
	//ProductDao ud=new ProductDao();
//	ud.setData();
	//ArrayList<Product>li=ud.getData();
//	List<Product>products=ps.getAllProducts();
java.util.List<Product> products=ps.getAllProducts();
	 Gson gson = new Gson();
	 String json=gson.toJson(products);
	// ud.setData();
 // json = gson.toJson(ud.getData());
return json;

}

@RequestMapping("/moreinfo")
public ModelAndView addtocart(HttpServletRequest request,HttpServletResponse response)
{
	//ModelAndView mv;
	String data=request.getParameter("id");
	ProductDao ud=new ProductDao();
	//ud.setData();
	//ArrayList<Product>li=ud.getData();
//	for(Product li1:li)
	//{
	//	li1.getId();
	//if(li1.getId().equals(data))
	//{
	//	ModelAndView mv1=new ModelAndView("moreinfo");
	//	li1.getName();
	//	li1.getCost();
	//	li1.getDesc();
	//	mv1.addObject("ss",li1);
		//request.setAttribute("ss",li);
	//	return mv1;
	//}
	
			
	//return mv;
//}
	return new ModelAndView("Check");

}
@RequestMapping("/AddToCart")
public ModelAndView addtoCart()
{
	return new ModelAndView("AddToCart");
}
}



package com.musichub.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.musichub.dao.UserService;
import com.musichub.model.Product3;
import com.musichub.model.ProductInfo;
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

@RequestMapping("/login")
public String login(@RequestParam (value="error", required = false) String error,
                    @RequestParam (value="logout", required = false) String logout, Model model
                    ) {
System.out.println("in login");
    if(error != null) {
        model.addAttribute("error", "Invalid username and password!");
    }

    if(logout!= null) {
        model.addAttribute("logout", "You have been logged out successfully.");
    }

    return "login";
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



/*@RequestMapping(value ="/logged")
public ModelAndView login(@ModelAttribute("user1") User3 user,@RequestParam(value = "error", required = false) String error,
@RequestParam(value = "logout", required = false) String logout)

//public String login(@ModelAttribute("user1")User3 user,HttpServletRequest req,HttpServletResponse res)
{
	//String name=req.getParameter("name");
	//String password=req.getParameter("password");
System.out.println("in login");
 ModelAndView model = new ModelAndView();
 if (error != null) {
	model.addObject("error", "Invalid username and password!");
  }

  if (logout != null) {
	model.addObject("msg", "You've been logged out successfully.");
  }
  model.setViewName("Logged");
  //model.addObject("logout");ged
return model;
}

@RequestMapping(value="/Logged")
public String logged(@ModelAttribute("user1")User3 user)
{
return "Logged";	
}*/
/*@RequestMapping("/content")
public ModelAndView m5(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
{
	ModelAndView mv=new ModelAndView("content");
	return mv;
	
}*/



@RequestMapping("/admin")
public String adminPage() {
    return "admin";
}
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
java.util.List<Product3> products=us.getAllProducts();
	 Gson gson = new Gson();
	 String json=gson.toJson(products);
	// ud.setData();
 // json = gson.toJson(ud.getData());
return json;

}
@ModelAttribute("product")
public ProductInfo create1()
{
System.out.println("inside modelattribute");
return new ProductInfo();
}

@RequestMapping("/Admin")
public String AddToCart()
{
return "AddProduct";	
}


@RequestMapping(value="/AddProduct",method=RequestMethod.POST)
//@RequestMapping(value="/multipleSave", method=RequestMethod.POST )
public @ResponseBody String addcart(@ModelAttribute("product") ProductInfo pinfo)
{
	System.out.println("in add");
	MultipartFile file=pinfo.getPfile();
	String fileName="";
	if(!file.isEmpty())
	{
		try
		{
			fileName=file.getOriginalFilename();
			byte[]bytes=file.getBytes();
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File("D:/workspace1/MyProject1/src/main/webapp/resources/images/"+fileName)));
					bos.write(bytes);
			bos.close();
			//return "Success";
		}
		catch(Exception e)
		{
			System.out.println(e);
			return "sorry";
			
		}
	}
	else
	{
		return "file empty";
		
	}
return "Success";
}}


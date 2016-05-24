package com.musichub.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.musichub.dao.ProdImpl;
import com.musichub.dao.ProdService;
import com.musichub.dao.UserService;
import com.musichub.model.Product3;
import com.musichub.model.ProductInfo;
import com.musichub.model.User3;
import com.musichub.validator.ProductValidation;

//import com.musichub.dao.UserService;
//import com.musichub.model.User2;
//import com.musichub.model.User3;
@Controller
public class HomeController {
	@Autowired
private UserService us;
	@Autowired
private ProductValidation prodvalidator;
	@Autowired
	private ProdService ps;
	@Autowired
	private ProdImpl pi;
	public HomeController(UserService us) {
		// TODO Auto-generated constructor stub
		this.us=us;
	}
	
public HomeController() {
		//super();
//	this.prodvalidator=prodvalidator;
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
                    @RequestParam (value="logout", required = false) String logout, Model model,HttpServletRequest req
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
String data;
@RequestMapping("/content")
public String m11(HttpServletRequest req)
{
	String data=req.getParameter("dd");
	System.out.println(data);

	return "content";
}


@RequestMapping("/content1")
public @ResponseBody String disp(ModelMap model,HttpServletRequest req)  
{
	

	java.util.List<ProductInfo> products=ps.selectAll();
	 Gson gson = new Gson();
	 String json=gson.toJson(products);

return json;
	/*ModelAndView mv = null;
	String data=req.getParameter("id");
	//ProdImpl piu=new ProdImpl();
	//piu.selectAll();
	List<ProductInfo>li=pi.selectAll();
for(ProductInfo li1:li)
	{
	//	li1.getId();
	if(li1.getPname().equals(data))
	{
	mv=new ModelAndView("moreinfo");
		li1.getPdesc();
		li1.getPprice();
		li1.getPmanu();
		mv.addObject("ss",li1);
	//request.setAttribute("ss",li);
		//return mv1;
	}
	
			
	//return mv;
}
	//return new ModelAndView("Check");
return mv;
*/
}

@ModelAttribute("product")
public ProductInfo create1()
{
System.out.println("inside modelattribute");
return new ProductInfo();
}

@RequestMapping("/Admin1")
public String AddToCart()
{
return "AddProduct";	
}
@RequestMapping(value="/AddProduct",method=RequestMethod.POST)
//@RequestMapping(value="/multipleSave", method=RequestMethod.POST )
public String addcart(@ModelAttribute("product")@Valid ProductInfo pinfo,BindingResult result)
{
	System.out.println("in add");
	MultipartFile file=pinfo.getPfile();
	String fileName="";
	prodvalidator.validate(pinfo, result);
	if(result.hasErrors())
	{
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
		return "fileempty";
		
	}
		//System.out.println("in valid"+result);
	
		return "AddProduct";
	}
	ps.prodSave(pinfo);
return "Success";
}
@RequestMapping("Success")
public @ResponseBody String Success(ModelMap model)
{
	java.util.List<ProductInfo> products=ps.selectAll();
	 Gson gson = new Gson();
	 String json=gson.toJson(products);

return json;	
}
@RequestMapping("AllProduct")
public String AllProduct()
{
	return "Success";
}

@RequestMapping("Edit")
public ModelAndView Edit(ProductInfo pinfo,HttpServletRequest req,HttpServletResponse res)
{
	String name=req.getParameter("id");
	ps.prodUpdate(pinfo);
	System.out.println("done");
	ModelAndView mv=new ModelAndView("done");
	return mv;
}

@RequestMapping("Delete")
public String Delete(ProductInfo pinfo)
{
	//ps.prodUpdate(pinfo);
	System.out.println("in delete");
	try
	{
	ps.prodDelete(pinfo);
	}
	catch(Exception e)
	{
		System.out.println("Error"+e);
		
	}
	
	
	return "deleted";
}

@RequestMapping("/moreinfo")
public ModelAndView addtocart(HttpServletRequest request,HttpServletResponse response)
{
	ModelAndView mv = null;
	String data=request.getParameter("id");
	//ProdImpl piu=new ProdImpl();
	//piu.selectAll();
	List<ProductInfo>li=pi.selectAll();
for(ProductInfo li1:li)
	{
	//	li1.getId();
	if(li1.getPname().equals(data))
	{
	mv=new ModelAndView("moreinfo");
		li1.getPdesc();
		li1.getPprice();
		li1.getPmanu();
		mv.addObject("ss",li1);
	//request.setAttribute("ss",li);
		//return mv1;
	}
	
			
	//return mv;
}
	//return new ModelAndView("Check");
return mv;

}

@RequestMapping("/About")
public String About()
{
return "Aboutus";	
}

}




package com.project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project2.model.UserDetail;

import com.project2.service.UserDetailService;


@Controller
@RequestMapping("/admin")
public class AdminController {
	 @Autowired
	    private UserDetailService usersDetailService;
	 @RequestMapping
	 public String admin()
	 {
		 return "admin";
		 
	 }
	    @RequestMapping("/user")
	    public String userManagement(Model model) {

	        List<UserDetail> usersDetailList = usersDetailService.getAllUsers();
	        model.addAttribute("usersDetailList", usersDetailList);

	        return "userManagement";
	    }
}

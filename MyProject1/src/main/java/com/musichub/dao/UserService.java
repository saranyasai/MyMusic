package com.musichub.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.model.Product3;
import com.musichub.model.User3;

//import com.musichub.model.User2;
@Service
@Transactional
public class UserService {
	@Autowired
	private UserImpl up;
	public void save1(User3 u) {
		up.save1(u);
	}
/*	public void check(User3 u)
	{
		up.check(u);
		
	}*/
	public List<Product3> getAllProducts()
	{
		return up.getAllProducts();
	}
	public com.musichub.controller.User3 getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

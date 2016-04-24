package com.musichub.dao;

import java.util.List;

import com.musichub.model.Product3;
import com.musichub.model.User3;

//import com.musichub.model.User2;

public interface UserInter {
	public void save1(User3 u);
//	public boolean check(User3 u);
	public List<Product3> getAllProducts();

}

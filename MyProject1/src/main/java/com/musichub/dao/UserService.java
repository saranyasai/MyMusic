package com.musichub.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}

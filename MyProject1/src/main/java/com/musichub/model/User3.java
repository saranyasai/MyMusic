package com.musichub.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User3 {
	
private String username;
private String password,num;
@Id
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}


}

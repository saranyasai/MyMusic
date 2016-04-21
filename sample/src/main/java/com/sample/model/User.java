package com.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private String name;
private String password,number;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}



}

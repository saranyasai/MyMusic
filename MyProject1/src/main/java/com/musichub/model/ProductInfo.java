package com.musichub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
//import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class ProductInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	@NotEmpty(message="check")

public String pname;
	
private int pprice;
	@NotEmpty(message="check")
private String pdesc;
	private String pmanu;

private transient MultipartFile pfile;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}



public int getPprice() {
	return pprice;
}

public void setPprice(int pprice) {
	this.pprice = pprice;
}

public String getPdesc() {
	return pdesc;
}

public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}

public String getPmanu() {
	return pmanu;
}

public void setPmanu(String pmanu) {
	this.pmanu = pmanu;
}

public MultipartFile getPfile() {
	return pfile;
}

public void setPfile(MultipartFile pfile) {
	this.pfile = pfile;
}


}

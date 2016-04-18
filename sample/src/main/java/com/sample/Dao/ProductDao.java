package com.sample.Dao;

import java.util.ArrayList;


import com.sample.model.Product;

public class ProductDao {
	ArrayList<Product>li=new ArrayList<Product>();
	public void setData()
	{
		Product u=new Product();
		u.setId("1");
		u.setName("saran");
		u.setDesc("simple");
		u.setCost("1000");

		Product u1=new Product();
		u1.setId("2");
		u1.setName("shaju");
		u1.setDesc("simple");
		u1.setCost("2000");
		li.add(u1);
li.add(u);		
	}
	
public ArrayList<Product> getData()
{
	return li;
}

}

package com.sample.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.model.Product;
import com.sample.model.User;
@Repository
public class ProductDao implements ProductInter {
List<Product>p;
public ProductDao()
{
p=new ArrayList<Product>();	
}
@Autowired
private SessionFactory sf;
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Session s=sf.getCurrentSession();
		org.hibernate.Query q=s.createQuery("from Product");
		p=q.list();
		
		return p;
	}
	
	public void insert(User u)
	{
		Session s=sf.openSession();
		s.save(u);
		s.flush();
		s.close();
		
	}
	public void update(User u)
	{
		Session s=sf.getCurrentSession();
		s.update(u);
		s.flush();
		
	}
	public void delete(User u)
	{
		Session s=sf.getCurrentSession();
		s.delete(u);
		s.flush();
	}
	
/*	ArrayList<Product>li=new ArrayList<Product>();
	public void setData()
	{
		Product u=new Product();
		u.setId("1");
		u.setName("guitar");
		u.setDesc("simple");
		u.setCost("1000");

		Product u1=new Product();
		u1.setId("2");
		u1.setName("veena");
		u1.setDesc("simple");
		u1.setCost("2000");
		
li.add(u);
li.add(u1);
	}
	
public ArrayList<Product> getData()
{
	return li;
}
*/
}

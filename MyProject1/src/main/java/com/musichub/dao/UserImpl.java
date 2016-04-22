package com.musichub.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.musichub.model.User2;
import com.musichub.model.User3;

@Repository
public class UserImpl implements UserInter {

	//public class UserImpl implements UserInter {
		  @Autowired
	      private SessionFactory sessionFactory;
	     /* public List<Product> getAllProducts()
	      {
	                     Session s=sf.getCurrentSession();
	                     org.hibernate.Query q=s.createQuery("select p1 from Product p1");
	                     p=q.list();
	                     return p;
	      }*/

		public void save1(User3 u) {
			// TODO Auto-generated method stub
			System.out.println("In save");
			Session s=sessionFactory.getCurrentSession();
			System.out.println("After current");
			s.save(u);
			
			s.flush();
		}
		
		

}

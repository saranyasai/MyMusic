package com.musichub.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musichub.model.Product3;
//import com.musichub.model.User2;
import com.musichub.model.User3;

@Repository
public class UserImpl implements UserInter {
	List<Product3>p;

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
		  public UserImpl()
		  {
			  
			  p=new ArrayList<Product3>();	

		  }
		  public List<Product3> getAllProducts() {
				// TODO Auto-generated method stub
				Session s=sessionFactory.getCurrentSession();
				org.hibernate.Query q=s.createQuery("from Product3");
				p=q.list();
				
				return p;
			}
			
		public void save1(User3 u) {
			// TODO Auto-generated method stub
			System.out.println("In save");
			Session s=sessionFactory.getCurrentSession();
			System.out.println("After current");
			s.save(u);
			
			s.flush();
		}
		/*public boolean check(User3 u) {
			// TODO Auto-generated method stub
			Session s=sessionFactory.getCurrentSession();
			//Transaction t=s.beginTransaction();
			Criteria c=s.createCriteria(User3.class);
			c.add(Restrictions.eq("name",u.getName())
			
			//t.commit();
			if()
			{
				return true;
			}
			System.out.println("c");
			return false;
		}
		
		
*/
}

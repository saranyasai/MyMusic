package com.musichub.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.musichub.model.Product3;
import com.musichub.model.ProductInfo;

public class ProdImpl implements ProdInter {
	//	List<Product3>p;
List<ProductInfo>p;
	@Autowired
    private SessionFactory sessionFactory;
 public ProdImpl() {
		// TODO Auto-generated constructor stub
		p=new ArrayList<ProductInfo>();
	}
	@Override
	public void prodSave(ProductInfo pinfo) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		s.save(pinfo);
		s.flush();
	}
	@Override
	public List<ProductInfo> selectAll() {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		org.hibernate.Query q=s.createQuery("from ProductInfo");
		//Criteria c=s.createCriteria(Restrictions.eq("pname", pname));
	//	Criteria c=s.createCriteria(ProductInfo.class);
		//if()
		p=q.list();
		
		return p;
		//return null;
	}
	@Override
	public void prodUpdate(ProductInfo pinfo) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		
		s.update(pinfo);
		s.flush();
		/*final static String UPDATE = "UPDATE ProductInfo SET   prodname = ? WHERE id =";
		private static void hibernateNativeQueryUpdate(SessionFactory factory) {
		  
		Session session = factory.getCurrentSession();
		session = factory.openSession();
		session.beginTransaction();
		SQLQuery sqlQuery = session.createSQLQuery(UPDATE);
		int result = sqlQuery.executeUpdate();
		System.out.println(result);
		session.getTransaction().commit();
		  */
		}
	
	@Override
	public void prodDelete(ProductInfo pinfo) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		s.delete(pinfo);
		s.flush();
	}

}

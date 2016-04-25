package com.musichub.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.model.Product3;
import com.musichub.model.ProductInfo;

@Service
@Transactional
public class ProdService {
@Autowired
private ProdImpl pi;
public void prodSave(ProductInfo pinfo)
{
pi.prodSave(pinfo);	
}
public List<ProductInfo> selectAll()
{
	return pi.selectAll();
}
public void prodUpdate(ProductInfo pinfo)
{
	
pi.prodUpdate(pinfo);	
}
public void prodDelete(ProductInfo pinfo)
{
pi.prodDelete(pinfo);	
}
}

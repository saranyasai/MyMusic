package com.sample.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sample.model.*;
@Transactional
@Service
public class ProductService {
@Autowired
private ProductDao pd;
public List<Product> getAllProducts()
{
	return pd.getAllProducts();
}
public void insert(User u)
{
pd.insert(u);	
}
}

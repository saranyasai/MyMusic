package com.sample.Dao;

import java.util.List;

import com.sample.model.Product;
import com.sample.model.User;

public interface ProductInter {
public List<Product> getAllProducts();
public void insert(User u);
public void update(User u);
public void delete(User u);
}

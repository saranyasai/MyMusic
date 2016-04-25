package com.musichub.dao;

import java.util.List;


import com.musichub.model.ProductInfo;

public interface ProdInter {
public void prodSave(ProductInfo pinfo);
public List<ProductInfo> selectAll();
public void prodUpdate(ProductInfo pinfo);
public void prodDelete(ProductInfo pinfo);
}

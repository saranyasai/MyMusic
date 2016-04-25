package com.musichub.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.musichub.model.ProductInfo;

public class ProductValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
	///	return false;
		return ProductInfo.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub
		ProductInfo inf=(ProductInfo)arg0;
	}

}

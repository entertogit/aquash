package com.aquash.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquash.platform.entity.Product;
import com.aquash.platform.model.ProductModel;
import com.aquash.platform.repository.ProductRepository;
import com.aquash.platform.service.ProductSerice;

@Service
public class ProductSericeImpl implements ProductSerice {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public String addProduct(ProductModel productModel) {
		
		Product product = new Product();
		
		product.setProductName(productModel.getProductName());
		product.setCategoryId(1001L);
		product.setPrice(productModel.getPrice());
		product.setCityId(101L);
		product.setStateId(201L);
		product.setOffer(productModel.getOffer());
		product.setProductStatus(1);
		
		productRepository.save(product);
		
		return "Product added successfully";
	}

}

package com.aquash.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquash.platform.model.ProductModel;
import com.aquash.platform.service.ProductSerice;

@RestController
@RequestMapping("/aquash")
public class ProductController {
	
	@Autowired
	ProductSerice productSerice;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody ProductModel productModel) {
		
		System.out.println("checking values product name . . "+productModel.getProductName());
		System.out.println("checking values product city. . "+productModel.getCity());
		
		return productSerice.addProduct(productModel);
		
	}

}

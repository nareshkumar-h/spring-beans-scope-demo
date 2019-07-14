package com.naresh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.naresh.ProductService;
import com.naresh.ShoppingCart;

@Configuration
public class BeanConfig {

	@Bean
	@Scope("prototype")
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}
	
	@Bean
	@Scope("singleton") // default scope:singleton
	public ProductService productService() {
		return new ProductService();
	}
}

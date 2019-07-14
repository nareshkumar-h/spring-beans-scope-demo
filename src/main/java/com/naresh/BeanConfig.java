package com.naresh;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BeanConfig {

	/*@Bean
	@Scope("prototype")
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}
	
	@Bean
	@Scope("singleton") // default scope:singleton
	public ProductService productService() {
		return new ProductService();
	}*/
}

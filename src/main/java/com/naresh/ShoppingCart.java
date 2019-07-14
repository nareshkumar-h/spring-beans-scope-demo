package com.naresh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class ShoppingCart {

	private List<String> items = new ArrayList<String>();

	public void addItem(String item) {
		this.items.add(item);
	}

	public List<String> getItems() {
		return items;
	}
	
	
}

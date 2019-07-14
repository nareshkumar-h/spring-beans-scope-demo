import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.ProductService;
import com.naresh.ShoppingCart;
import com.naresh.config.BeanConfig;

public class TestShoppingCart {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

		ShoppingCart cart1 = context.getBean("shoppingCart", ShoppingCart.class);
		cart1.addItem("Mac");
		cart1.addItem("Lenova");
		System.out.println("Shopping cart 1 contains " + cart1.getItems());

		ShoppingCart cart2 = context.getBean("shoppingCart", ShoppingCart.class);
		cart2.addItem("Dell");
		System.out.println("Shopping cart 2 contains " + cart2.getItems());
	}
}

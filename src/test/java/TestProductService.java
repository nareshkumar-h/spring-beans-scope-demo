import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.ProductService;
import com.naresh.ShoppingCart;
import com.naresh.config.BeanConfig;

public class TestProductService {

	public static void main(String[] args) {
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(BeanConfig.class);

		 ProductService productService1 = context.getBean("productService", ProductService.class);
		 ProductService productService2 = context.getBean("productService", ProductService.class);
		 // In Singleton scope, only one object will be created
		 System.out.println("Object1 : " + productService1);
		 System.out.println("Object2 : " + productService2);
	}
}

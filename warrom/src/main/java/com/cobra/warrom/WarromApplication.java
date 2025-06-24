package com.cobra.warrom;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarromApplication {

	public static void main(String[] args) {
		ApplicationContext ioc=  SpringApplication.run(WarromApplication.class, args);

		Product p= ioc.getBean(Product.class);
		p.setPid(1);
		p.setPname("Book");

		System.out.println(p);

		Order o=ioc.getBean(Order.class);
		o.setOid(1);
		o.setOname("order 1");
		System.out.println(o );

		Product m= new Product();
		System.out.println(m.hashCode());  // Hashcode
	}

}

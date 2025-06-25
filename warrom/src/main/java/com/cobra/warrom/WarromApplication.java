package com.cobra.warrom;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarromApplication {

	public static void main(String[] args) {
		ApplicationContext ioc=  SpringApplication.run(WarromApplication.class, args);

		Product pr= ioc.getBean(Product.class);
		pr.setPid(123);
		pr.setPname("Book");

		Order ord= ioc.getBean(Order.class);
		ord.setOid(123);
		ord.setStatus("Delivered");
		ord.setProd(pr);  //Order Required a product so the product pr is assigned

		System.out.println(ord);
	}

}

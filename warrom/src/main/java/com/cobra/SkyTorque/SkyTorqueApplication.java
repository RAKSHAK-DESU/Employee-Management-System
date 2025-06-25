package com.cobra.SkyTorque;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkyTorqueApplication {

	public static void main(String[] args) {
		ApplicationContext ioc=  SpringApplication.run(SkyTorqueApplication.class, args);

		Discount d = new DiscountImpl();

		Discount d1 = new PrimeDiscount();

		Product p = ioc.getBean(Product.class);
		p.setPid(123);
		p.setPname("Book");

		Order o = ioc.getBean(Order.class);
		o.setOid(345);
		o.setStatus("Shipped");



		o.getDiscount().calculateDiscount();
		System.out.println(o);

	}

}

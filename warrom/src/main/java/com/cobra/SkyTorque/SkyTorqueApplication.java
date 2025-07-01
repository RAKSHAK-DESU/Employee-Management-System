package com.cobra.SkyTorque;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkyTorqueApplication {

	public static void main(String[] args) {
		ApplicationContext ioc=  SpringApplication.run(SkyTorqueApplication.class, args);
 
	}

}

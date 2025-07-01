package com.cobra.SkyTorque.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class WebMvcConfig {
    @Bean //while scanning this config class and when someone autowire this InternalResourceViewResolver  apply this config
    public InternalResourceViewResolver initResolver(){
       InternalResourceViewResolver ir= new InternalResourceViewResolver();
       ir.setPrefix("/");       //Location where we keep physical views
       ir.setSuffix(".html");
       return  ir;
    }

}

package com.graphiti;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Application extends SpringBootServletInitializer{	
	
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
//            	registry.addMapping("/asset/*").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
//            	registry.addMapping("/asset/*/flowdetails").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
//            	registry.addMapping("/asset/checkUserAccessibility/*").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
//            	registry.addMapping("/asset/checkAdminAccess/*").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
//            	registry.addMapping("/asset/permissions").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
            	registry.addMapping("/ext/**").allowedMethods("GET","POST","DELETE","PUT").allowedOrigins("*");
            }
        };
    }
}

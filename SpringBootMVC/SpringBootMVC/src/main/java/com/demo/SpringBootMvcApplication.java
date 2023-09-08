package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootMvcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootMvcApplication.class, args);
		/*for(String nm:ctx.getBeanDefinitionNames()) {
			System.out.println(nm);
		}*/
	}

}

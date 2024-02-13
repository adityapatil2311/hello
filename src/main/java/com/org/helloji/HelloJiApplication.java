package com.org.helloji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})
//@ComponentScan(basePackages = "hello-ji")
public class HelloJiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloJiApplication.class, args);
	}

}

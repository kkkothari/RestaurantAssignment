package com.wynk.wynk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wynk.controller","com.wynk", "com.wynk.business", "com.wynk.dao"})
public class WynkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WynkApplication.class, args);
	}

}

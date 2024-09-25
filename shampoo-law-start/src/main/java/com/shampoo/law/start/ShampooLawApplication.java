package com.shampoo.law.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.shampoo.law"})
public class ShampooLawApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShampooLawApplication.class, args);
	}
}

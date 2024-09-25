package com.shampoo.law.controller;

import com.shampoo.law.controller.conifg.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
public class ShampooLawApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShampooLawApplication.class, args);
	}
}

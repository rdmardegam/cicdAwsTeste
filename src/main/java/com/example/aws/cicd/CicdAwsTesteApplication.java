package com.example.aws.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdAwsTesteApplication {

	@Value("${spring.application.name}")
	private static String appName;
	
	public static void main(String[] args) {
		System.out.println("AQUIIIIII");
		System.out.println("name" + appName);
		
		SpringApplication.run(CicdAwsTesteApplication.class, args);
		
		
	}

}

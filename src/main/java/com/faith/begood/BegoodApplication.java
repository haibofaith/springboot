package com.faith.begood;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class BegoodApplication implements ApplicationRunner,CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(BegoodApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BegoodApplication.class, args);
	}


//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.info("Hello World -----info");
		logger.debug("Hello World-----debug");
		logger.error("Hello World-----error");
//		System.out.println("Hello World from Application Runner");
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hello world from Command Line Runner");
	}
}


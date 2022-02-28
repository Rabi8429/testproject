package com.example.aopbeforeadviceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@ComponentScan(basePackages= "com.example")
//@ComponentScan(basePackageClasses=com.example.aopbeforeadviceexample.controller.EmployeeController.class)
@SpringBootApplication
@EnableAutoConfiguration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopBeforeAdviceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopBeforeAdviceExampleApplication.class, args);
	}

}

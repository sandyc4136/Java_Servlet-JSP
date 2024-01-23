package com.cdac.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.HelloWorld;
import com.cdac.component.Welcome;

public class App {

	public static void main(String[] args) {
		//Loading Spring's IoC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a bean
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello("Majrul"));
		//Why are we using Spring?
		//When we can create an object like this: HelloWorld hw = new HelloWorld();
		//answer to this question is pending as of now
		
		Welcome w = (Welcome) ctx.getBean("welcome");
		w.greet();
		
	}
}

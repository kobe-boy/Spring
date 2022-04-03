package com.spring.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(Student.class);
		//初始化
		applicationContext.refresh();

		System.out.println(applicationContext.getBean(Student.class));
	}
}

package com.tcs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Student;
import com.tcs.beans.Test;

public class TestClient {
	public static void main(String[] args) {
		// start the spring container : container instantiate & initialize the bean
		// objects.
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("*****************");
		/**
		 * Test t=(Test)context.getBean("test");
		 */
		// or

		Test t1 = context.getBean("test", Test.class);
		// if we would call this method multiple times, it will not create the new
		// object every time. Instead make the class singleton.
		Test t = context.getBean("test", Test.class);
    
		System.out.println(t1.equals(t));
		System.out.println(t1==t);
		t.testWish();

		Student s = (Student) context.getBean("student");
		s.studentInfo();
	}
}

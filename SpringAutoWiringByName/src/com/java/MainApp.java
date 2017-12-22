package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String []args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		System.out.println(te.getName());
		te.getSpellChecker().checkSpelling();
	}
}

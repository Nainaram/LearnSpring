package com.ram.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.model.JavaTrainer;
import com.ram.spring.model.SqlTrainer;
import com.ram.spring.model.WebTrainer;

public class Main {

	public static void main(String[] args) {
		// this is the bean factory where the objects are stored and can used by calling
		// the cpx ref and particular bean we want that object.
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("beans.xml");
		Trainer jt = (JavaTrainer) cpx.getBean("javaTrainer");
		Trainer st = (SqlTrainer) cpx.getBean("sqlTrainer");
		Trainer wt = (WebTrainer) cpx.getBean("webTrainer");

		// in this code even the datavalues are passed by the factory itself.
		System.out.println(jt.giveTask());
		System.out.println(st.giveTask());
		System.out.println(wt.giveTask());

	}
}

//		Trainer jt1 = (JavaTrainer) cpx.getBean("jt");
//		Trainer jt2 = (JavaTrainer) cpx.getBean("jt");
//		Trainer jt3 = (JavaTrainer) cpx.getBean("jt");

//		System.out.println(jt);
//		System.out.println(jt1);
//		System.out.println(jt2);
//		System.out.println(jt3);
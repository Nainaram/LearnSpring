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
		Trainer jt = (JavaTrainer) cpx.getBean("jt");
		Trainer st = (SqlTrainer)cpx.getBean("st"); 
		Trainer wt = (WebTrainer)cpx.getBean("wt");
		  
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
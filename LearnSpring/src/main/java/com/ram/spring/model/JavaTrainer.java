package com.ram.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.practicetime.JavaPracticeTime;

@Component
public class JavaTrainer implements Trainer {
	// in this code you have not only passed the values to object from the beans.xml
	// even you have passed directly object created
	// in the beans.xml have passed to program
	private JavaPracticeTime jpt;
	private String name;
	private String message;

	@Autowired
	public JavaTrainer( @Qualifier("jpt") JavaPracticeTime jpt, @Value("kshitij") String name,@Value("practice the problem everyday") String message) {
		super();
		this.jpt = jpt;
		this.name = name;
		this.message = message;
	}



	public JavaPracticeTime getJpt() {
		return jpt;
	}

	

	public String getName() {
		return name;
	}

	

	public String getMessage() {
		return message;
	}

	

	@Override
	public String giveTask() {

		return name + " says " + message + " " + jpt.getTime();

	}

}

package com.ram.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.practicetime.SqlPracticeTime;

@Component
public class SqlTrainer implements Trainer {
	// in this code you have not only passed the values to object from the beans.xml
	// even you have passed directly object created
	// in the beans.xml have passed to program
	private SqlPracticeTime spt;
	private String name;
	private String message;

	public SqlPracticeTime getSpt() {
		return spt;
	}

	
	public String getName() {
		return name;
	}


	public String getMessage() {
		return message;
	}

	
	@Autowired
	public SqlTrainer(@Qualifier("spt") SqlPracticeTime spt,  @Value("blessina") String name, @Value("practices complex queries everyday") String message) {
		super();
		this.spt = spt;
		this.name = name;
		this.message = message;
	}


	@Override
	public String giveTask() {

		return name + " says " + message + " " + spt.getTime();

	}

}

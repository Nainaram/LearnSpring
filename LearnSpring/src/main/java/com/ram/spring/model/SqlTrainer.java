package com.ram.spring.model;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.practicetime.SqlPracticeTime;

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

	public void setSpt(SqlPracticeTime spt) {
		this.spt = spt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String giveTask() {

		return name + " says " + message + " " + spt.getTime();

	}

}

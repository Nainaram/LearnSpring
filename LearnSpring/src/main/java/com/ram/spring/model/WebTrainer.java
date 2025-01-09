package com.ram.spring.model;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.practicetime.WebPracticeTime;

public class WebTrainer implements Trainer {
	// in this code you have not only passed the values to object from the beans.xml
	// even you have passed directly object created
	// in the beans.xml have passed to program
	private WebPracticeTime wpt;
	private String name;
	private String message;

	public WebPracticeTime getWpt() {
		return wpt;
	}

	public void setWpt(WebPracticeTime wpt) {
		this.wpt = wpt;
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

		return name + " says " + message + " " + wpt.getTime();

	}

}

package com.ram.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ram.spring.Interfaces.Trainer;
import com.ram.spring.practicetime.WebPracticeTime;

@Component
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

	

	public String getName() {
		return name;
	}

	
	public String getMessage() {
		return message;
	}

	@Autowired
	public WebTrainer(@Qualifier("wpt") WebPracticeTime wpt, @Value("blessina") String name, @Value("design web pages everyday") String message) {
		super();
		this.wpt = wpt;
		this.name = name;
		this.message = message;
	}



	@Override
	public String giveTask() {

		return name + " says " + message + " " + wpt.getTime();

	}

}

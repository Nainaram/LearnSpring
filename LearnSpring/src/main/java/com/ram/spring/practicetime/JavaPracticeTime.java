package com.ram.spring.practicetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jpt")
public class JavaPracticeTime {

	private String time;

	public String getTime() {
		return time;
	}
	@Autowired
	public JavaPracticeTime(@Value("2 houres") String time) {
		super();
		this.time = time;
	}
	
	
}

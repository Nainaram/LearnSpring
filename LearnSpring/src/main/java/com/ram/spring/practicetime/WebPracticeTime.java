package com.ram.spring.practicetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wpt")
public class WebPracticeTime {

	private String time;

	public String getTime() {
		return time;
	}

	@Autowired
	public WebPracticeTime(@Value("1.5 hours") String time) {
		super();
		this.time = time;
	}

	
}

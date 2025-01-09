package com.ram.spring.model;

import com.ram.spring.Interfaces.Trainer;

public class WebTrainer implements Trainer {
	
	private String name = "Blessina";
	@Override
	public String giveTask() {
		
		return name +" says build responsive pages every day.";
		
	}

}	

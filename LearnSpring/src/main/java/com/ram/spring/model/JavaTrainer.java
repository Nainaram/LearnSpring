package com.ram.spring.model;

import com.ram.spring.Interfaces.Trainer;

public class JavaTrainer implements Trainer {
	
		private String name ="Kshitij";
	@Override
	public String giveTask() {
		
		return name +" says solve problems complex problems every day.";
		
	}

		
}

package com.ram.spring.model;

import com.ram.spring.Interfaces.Trainer;

public class SqlTrainer  implements Trainer{
	
	private String name ;
	@Override
	public String giveTask() {
		
			return name +" mam says practise complex queries everyday.";
	}

		
}

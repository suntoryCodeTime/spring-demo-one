package com.suntorycodetime.springdemo.impl;

import java.util.Random;

import com.suntorycodetime.springdemo.FortuneService;

public class HappyFortuneService implements FortuneService {
	private String[] fortunes = new String[3];
	private Random rand;
	
	public HappyFortuneService() {
		fortunes[0] = "Today is your lucky day!!!";
		fortunes[1] = "You will learn something new today!";
		fortunes[2] = "If at first you don't succed, delete your repo and reclone.";
		
		rand = new Random();
	}

	@Override
	public String getFortune() {
		return fortunes[rand.nextInt(3)];
	}
	
}

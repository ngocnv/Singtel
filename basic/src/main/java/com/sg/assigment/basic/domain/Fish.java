package com.sg.assigment.basic.domain;

public class Fish extends Animal implements Swimming {

	@Override
	public void walk() {
		throw new RuntimeException("Fish don't walk!");
	}
	
	public void sing() {
		throw new RuntimeException("Fish don't sing!");
	}
}

package com.sg.assigment.basic.domain;

public class Fish extends Animal {

	@Override
	public void walk() {
		throw new RuntimeException("Fish don't walk!");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void sing() {
		throw new RuntimeException("Fish don't sing!");
	}
}

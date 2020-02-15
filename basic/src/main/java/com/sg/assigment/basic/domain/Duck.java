package com.sg.assigment.basic.domain;

public class Duck extends Bird implements Thing {

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}
	
	public void swim() {
		System.out.println("I am swimming");
	}

	@Override
	public void say() {
		this.sing();
	}
	
}

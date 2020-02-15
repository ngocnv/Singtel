package com.sg.assigment.basic.domain;

public class Dog extends Animal implements Thing {

	@Override
	public void say() {
		System.out.println("Woof, woof");
	}
}

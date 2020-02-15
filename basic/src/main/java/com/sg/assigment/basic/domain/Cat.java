package com.sg.assigment.basic.domain;

public class Cat extends Animal implements Thing {

	@Override
	public void say() {
		System.out.println("Meow");
	}

}

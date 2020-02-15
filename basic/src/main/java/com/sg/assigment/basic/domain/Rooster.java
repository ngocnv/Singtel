package com.sg.assigment.basic.domain;

public class Rooster extends Chicken implements Crow,Thing {
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

	@Override
	public void say() {
		sing();
	}
	
}

package com.sg.assigment.basic.domain;

public class Bird extends Animal {
	
	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("I am singing");
	}

	@Override
	public void doStatistics() {
		countFly ++;
		countWalk ++;
		countSing ++;
	}
}

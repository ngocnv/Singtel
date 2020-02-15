package com.sg.assigment.basic.domain;


public class Chicken extends Bird {

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}

	@Override
	public void fly() {
		throw new RuntimeException("Chickend can not fly");
	}

	@Override
	public void doStatistics() {
		countWalk ++;
		countSing ++;
	}
}

package com.sg.assigment.basic.domain;

public abstract class Animal {
	
	public static int countFly = 0;
	public static int countWalk =0;
	public static int countSing =0;
	public static int countSwim =0;
	
	public Animal() {
		doStatistics();
	}
	
	public void walk() {
		System.out.println("I am walking");
	}
	
	public abstract void doStatistics();
}

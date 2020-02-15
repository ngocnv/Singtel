package com.sg.assigment.basic.domain;

public interface Swimming {
	public  default void swim() {
		System.out.println("I am swimming");
	}
}

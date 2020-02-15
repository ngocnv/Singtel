package com.sg.assigment.basic.domain;

public interface Crow {
	public default void crow() {
		System.out.println("Cock-a-doodle-doo");
	}
}

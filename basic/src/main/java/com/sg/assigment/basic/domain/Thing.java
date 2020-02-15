package com.sg.assigment.basic.domain;

public interface Thing {
	default public void say() {
		System.out.println("Silient!!!");
	} ;
}

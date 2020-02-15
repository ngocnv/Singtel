package com.sg.assigment.basic.domain;

public class Dolphins extends Animal implements Swimming  {

	@Override
	public void doStatistics() {
		countSing ++;
		countSwim ++;
	}
}

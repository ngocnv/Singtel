package com.sg.assigment.basic.domain;

import com.sg.assigment.basic.enums.Color;
import com.sg.assigment.basic.enums.Size;

public class Shark extends Fish {
	private Size size = Size.LARGE;
	private Color color = Color.BLUE;
	
	public Size getSize() {
		return size;
	}
	
	public Color getColor() {
		return color;
	}

	public void eat(Fish fish) {
		System.out.println("Shark eat fish");
	}

	@Override
	public void doStatistics() {
		countSwim ++;
	}
	
	
}

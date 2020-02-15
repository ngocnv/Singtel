package com.sg.assigment.basic.domain;

import com.sg.assigment.basic.enums.Color;
import com.sg.assigment.basic.enums.Size;

public class Clownfish extends Fish {
	private Size size = Size.SMALL;
	private Color color = Color.ORANGE;
	
	public void makeJoke() {
		System.out.println("Smile !");
	}

	public Size getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}
	
}

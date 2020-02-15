package com.sg.assigment.basic;

import com.sg.assigment.basic.domain.Animal;
import com.sg.assigment.basic.domain.Bird;
import com.sg.assigment.basic.domain.Butterfly;
import com.sg.assigment.basic.domain.Cat;
import com.sg.assigment.basic.domain.Chicken;
import com.sg.assigment.basic.domain.Clownfish;
import com.sg.assigment.basic.domain.Dog;
import com.sg.assigment.basic.domain.Dolphins;
import com.sg.assigment.basic.domain.Duck;
import com.sg.assigment.basic.domain.Fish;
import com.sg.assigment.basic.domain.Parrot;
import com.sg.assigment.basic.domain.Rooster;
import com.sg.assigment.basic.domain.Shark;

public class AnimalCounter {
	
	
	private static Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot(), new Fish(),
			new Shark(), new Clownfish(), new Dolphins(), new Dog(), new Butterfly(), new Cat() };
	
	
	public static void main(String[] args) {
		System.out.println("Count fly: " + Animal.countFly);
		System.out.println("Count walk: " + Animal.countWalk);
		System.out.println("Count sing: " + Animal.countSing);
		System.out.println("Count swim: " + Animal.countSwim);
		
	}
	
}

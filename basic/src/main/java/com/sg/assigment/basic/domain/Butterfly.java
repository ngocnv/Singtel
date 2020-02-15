package com.sg.assigment.basic.domain;

import java.util.HashMap;
import java.util.Map;

public class Butterfly extends Animal {

	private static String FLY = "can fly";
	private static String MAKESOUND = "can make sound";
	private static String WALK= "can work";
	private Map<String,Boolean> context;
	
	public Butterfly() {
		context = new HashMap<String, Boolean>();
		context.put(FLY,true);
		context.put(MAKESOUND,false);
		context.put(WALK,true);
	}

	public Map<String, Boolean> getContext() {
		return context;
	}

	public void setContext(Map<String, Boolean> context) {
		this.context = context;
	}

}

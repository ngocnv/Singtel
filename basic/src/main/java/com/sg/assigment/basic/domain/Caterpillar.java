package com.sg.assigment.basic.domain;

import java.util.HashMap;
import java.util.Map;

public class Caterpillar extends Animal {
	public static String FLY = "can fly";
	public static String MAKESOUND = "can make sound";
	public static String WALK= "can work";
	
	private Map<String,Boolean> context = null;
	
	public Caterpillar() {
		context  = new HashMap<String, Boolean>();
		context.put(FLY,false);
		context.put(MAKESOUND,false);
		context.put(WALK,true);
	}
	
	public Butterfly transform() {
		Butterfly butterfly = new Butterfly();
		butterfly.setContext(context);
		context.put(FLY,true);
		context.put(MAKESOUND,false);
		context.put(WALK,true);
		return butterfly;
	}

	public Map<String, Boolean> getContext() {
		return context;
	}

	public void setContext(Map<String, Boolean> context) {
		this.context = context;
	}

	@Override
	public void doStatistics() {
		countWalk ++;
	}
	
}

package com.sg.assigment.basic.domain;

public class Parrot extends Bird  {
	private Thing thingLiveWith;
	
	public Thing getThingLiveWith() {
		return thingLiveWith;
	}

	public void setThingLiveWith(Thing thingLiveWith) {
		this.thingLiveWith = thingLiveWith;
	}

	@Override
	public void sing() {
		if(thingLiveWith == null) {
			throw new RuntimeException("animal lived with is required");
		}
		thingLiveWith.say();
	}

}

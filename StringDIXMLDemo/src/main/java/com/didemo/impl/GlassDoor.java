package com.didemo.impl;

import com.didemo.interfaces.Door;

public class GlassDoor implements Door {
	
	@Override
	public void openDoor() {
		System.out.println("glass door opened");	
	}

}

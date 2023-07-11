package com.didemo.impl;

import com.didemo.interfaces.Door;

public class MetalDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("metal door opened");	
	}
}

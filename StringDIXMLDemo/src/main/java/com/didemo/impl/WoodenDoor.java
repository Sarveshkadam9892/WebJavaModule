package com.didemo.impl;

import com.didemo.interfaces.Door;

public class WoodenDoor implements Door {
	
	@Override
	public void openDoor() {
		System.out.println("wooden door opened");
		
	}

}

package com.didemo.entity;

import com.didemo.impl.MetalDoor;
import com.didemo.interfaces.Door;

public class Car {

	private Door door;
	
	


	public Car(Door door)  // Constructor dependency injection
	{
		this.door = door;
	}

	public Car() { 
	}

	public void setDoor(Door door)  // Setter dependency injection
	{
		this.door = door;
	}

	public void unlock() {
		door.openDoor();
	}
}

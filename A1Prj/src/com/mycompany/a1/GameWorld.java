package com.mycompany.a1;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("unused")

public class GameWorld {
	GameObject go = new GameObject();
	ArrayList<GameObject> gameObject = new ArrayList<GameObject>();
	
	private SpaceStation spaceStation;
	// Need to figure out random
	
	public void init() {
		
	}

	public void eliminate() {
		// TODO Auto-generated method stub
		
	}
	
	public void addSpaceStation() {
		spaceStation = new SpaceStation();
		spaceStation.setLocation(Random.doubles(0.0, 1024), y); // <-- Insert the random #'s here
		System.out.println("Added new space station" + "ID: " + spaceStation.getID());
	}
}

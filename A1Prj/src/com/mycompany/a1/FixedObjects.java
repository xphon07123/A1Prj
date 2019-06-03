package com.mycompany.a1;

import java.util.ArrayList;

@SuppressWarnings("unused")

public class FixedObjects extends GameObject{
	
	private static int ID;
	
	public int setID() {
		return ID++;
	}
	
	public int getID() {
		return ID;
	}
	
}

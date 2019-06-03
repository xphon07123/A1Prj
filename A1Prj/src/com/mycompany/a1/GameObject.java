package com.mycompany.a1;

import com.codename1.ui.geom.Point2D;
import com.codename1.charts.util.ColorUtil;

@SuppressWarnings("unused")
public class GameObject {
	
	private double locationX;
	private double locationY;
	private int color;
	private Point2D point2D;
	
	public GameObject(double x, double y) {
		setLocation(random )
	}

	public void setColor(int r, int g, int b) {
		color = ColorUtil.rgb(r, g, b);
	}
	
	public void getColor(int color) {
		System.out.println("[" + ColorUtil.red(color) + ", " + ColorUtil.green(color) + ", " + ColorUtil.blue(color) + "]");
	}
	
	public void setLocation(double x, double y) {
		point2D.setX(x);
		point2D.setY(y);
	}
	
	public void getLocation(Point2D myLocation) {
		System.out.println("Loc: " + "(" + myLocation.getX() + ", " + myLocation.getY() + ")");
	}
}

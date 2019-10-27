package structure.bridge.version2.impl;

import structure.bridge.version2.interfaces.Drawer;

public class SmallCircleDrawer implements Drawer {
	
	public static final double radiusMultiplier = 0.25;
	
	@Override
	public void drawCircle(int x, int y, int radius) {
		System.out.println("Small circle center = " + x + "," + y + " radius = " + radius*radiusMultiplier);
	}
	
}

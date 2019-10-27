package structure.bridge.version2;

import structure.bridge.version2.impl.Circle;
import structure.bridge.version2.impl.LargeCircleDrawer;
import structure.bridge.version2.impl.SmallCircleDrawer;

public class Application {

	public static void main (String [] args){
		Shape [] shapes = {
				new Circle(5,10,10, new LargeCircleDrawer()),
				new Circle(20,30,100, new SmallCircleDrawer())};
		
		for (Shape next : shapes){
			next.draw();
		}
	}
	
}
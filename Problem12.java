import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT  = 300;
	private static final double DOOR_WIDTH  = 40;
	private static final double DOOR_HEIGHT  = 60;
	public void run() {
		drawMidLine();
		drawHouse();
	}
	
	private void drawHouse() {
		drawWall();
		//drawRoof();
		//drawDoor();
		//drawWindows();
	}
	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		int y = (int) (getHeight() - HOUSE_HEIGHT);
		add(wall, x, y);
	}
	private void drawMidLine() {
		double x1 = 0;
		double y1 = getHeight()/2;
		double x2 = getWidth();
		double y2 = y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add(Line);
	}
}

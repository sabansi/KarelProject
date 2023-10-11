import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT  = 300;
	private static final double DOOR_WIDTH  = 40;
	private static final double DOOR_HEIGHT  = 100;
	private static final double ROOF_HEIGHT  = 100;
	private static final double WINDOWS_WIDTH = 20;
	private static final double WINDOWS_HEIGHT  = 20;
	public void run() {
		drawHouse();
	}
	
	private void drawHouse() {
		drawWall();
		drawRoof();
		drawDoor();
		drawWindows();
	}
	private void drawWall() {
		GRect wall = new GRect(HOUSE_WIDTH, HOUSE_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		int y = (int) (getHeight() - HOUSE_HEIGHT);
		add(wall, x, y);
	}
	private void drawRoof() {
		double x1 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2);
		double y1 = (int) (getHeight() - HOUSE_HEIGHT);
		double x2 = x1 + HOUSE_WIDTH / 2;
		double y2 = y1 - ROOF_HEIGHT;
		
		for(int i = 0; i < 2; i ++) {
			if(i == 0) {
				
			}
			else {
				x1 = x2;
				y1 = y2;
				x2 = x1 + HOUSE_WIDTH / 2;
				y2 = y1 + ROOF_HEIGHT;
			}
			GLine leftRoof = new GLine(x1, y1, x2, y2);
			add(leftRoof); 
		}
	}
	
	private void drawDoor() {
		GRect wall = new GRect(DOOR_WIDTH, DOOR_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 2 * DOOR_WIDTH);
		int y = (int) (getHeight() - DOOR_HEIGHT);
		add(wall, x, y);
	}
	
	private void drawWindows() {
		GRect wall = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 2 * DOOR_WIDTH);
		int y = (int) (getHeight() - DOOR_HEIGHT - 150);
		add(wall, x, y);
	}
}

import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram {
	private static final double HOUSE_WIDTH = 200;
	private static final double HOUSE_HEIGHT  = 300;
	private static final double DOOR_WIDTH  = 50;
	private static final double DOOR_HEIGHT  = 100;
	private static final double ROOF_HEIGHT  = 100;
	private static final double WINDOWS_WIDTH = 40;
	private static final double WINDOWS_HEIGHT  = 40;
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
		wall.setFilled(true);
		wall.setColor(Color.GRAY);
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
		GRect door = new GRect(DOOR_WIDTH, DOOR_HEIGHT);
		int x = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + DOOR_WIDTH * 1.5);
		int y = (int) (getHeight() - DOOR_HEIGHT);
		door.setFilled(true);
		door.setColor(Color.BROWN);
		add(door, x, y);
	}
	
	private void drawWindows() {
		GRect window1 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x1 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 20);
		int y1 = (int) (getHeight() - DOOR_HEIGHT - 125);
		window1.setFilled(true);
		window1.setColor(Color.BLACK);
		add(window1, x1, y1);
		
		GRect window2 = new GRect(WINDOWS_WIDTH, WINDOWS_HEIGHT);
		int x2 = (int) (getWidth() / 2 - HOUSE_WIDTH / 2 + 40 + DOOR_WIDTH * 2);
		int y2 = (int) (getHeight() - DOOR_HEIGHT - 125);
		window2.setFilled(true);
		window2.setColor(Color.BLACK);
		add(window2, x2, y2);
	}
}

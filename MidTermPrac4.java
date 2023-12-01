import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class MidTermPrac4 extends GraphicsProgram{

	private GRect firstBlack = null;
	private GRect secondBlack = null;
	
	
	public void run() {
		draw();
		addMouseListeners();
	}

	private void draw() {
		double length = Math.min(getWidth(), getHeight()) / 8;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				GRect cell = new GRect(length, length);
				double x = i * length;
				double y = j * length;
				cell.setFilled(true);
				cell.setFillColor(Color.WHITE);
				add(cell, x, y);
			}
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		GObject current = getElementAt(e.getX(), e.getY());
		GRect currRect = (GRect) current;
		if(currRect == null) {
			return;
		}
		if(currRect.getFillColor() == Color.WHITE) {
			currRect.setFillColor(Color.BLACK);
			if(firstBlack == null) {
				firstBlack = currRect;
			}
			if(secondBlack == null) {
				secondBlack = currRect;
			}
			else {
				firstBlack.setFillColor(Color.WHITE);
				firstBlack = secondBlack;
				secondBlack = currRect;
			}
		}
		else {
			currRect.setFillColor(Color.WHITE);
		}
	}
}

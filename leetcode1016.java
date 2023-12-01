
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
	private static final int BOX_SIZE = 80;
	private GRect square;
	public void run() {
		draw();
	}

	private void draw() {
		double x1 = getWidth() / 2 - BOX_SIZE / 2;
		double y1 = getHeight() / 2 - BOX_SIZE / 2;
		square = new GRect(x1, y1, BOX_SIZE, BOX_SIZE);
		add(square);
	}
}
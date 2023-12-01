
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
	private static final int BOX_SIZE = 80;
	private GRect square;
	private GLabel text;
	private String score;
	public void run() {
		draw();
	}

	private void draw() {
		double x1 = getWidth() / 2 - BOX_SIZE / 2;
		double y1 = getHeight() / 2 - BOX_SIZE / 2;
		square = new GRect(x1, y1, BOX_SIZE, BOX_SIZE);
		add(square);
		text = new GLabel(score, getWidth() / 2 - text.getAscent() / 2, getHeight() / 2 - text.getHeight() / 2);
		add(text);
		
	}
}
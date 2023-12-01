
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
	private final static int CIRCLE_D = 40;
	private final static int CIRCLE_NUM = 25;
	private final static int DELAY = 2000;
	private int count = CIRCLE_NUM;
	private GOval oval1 = null;
	private GOval oval2 = null;

	public void run() {
		// init
		addMouseListeners();
		RandomGenerator rgen = new RandomGenerator();
		for (int i = 0; i < CIRCLE_NUM; i++) {
			Color color = rgen.nextColor();
			int x1 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y1 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			GOval oval1 = new GOval(x1, y1, CIRCLE_D, CIRCLE_D);
			add(oval1);
			oval1.setFilled(true);
			oval1.setColor(color);
			int x2 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y2 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			GOval oval2 = new GOval(x2, y2, CIRCLE_D, CIRCLE_D);
			add(oval2);
			oval2.setFilled(true);
			oval2.setColor(color);
		}
		// game
		while (true) {
			if (count == 0)
				break;
			Color color = rgen.nextColor();
			int x1 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y1 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			GOval oval1 = new GOval(x1, y1, CIRCLE_D, CIRCLE_D);
			add(oval1);
			oval1.setFilled(true);
			oval1.setColor(color);
			int x2 = rgen.nextInt(0, getWidth() - CIRCLE_D);
			int y2 = rgen.nextInt(0, getHeight() - CIRCLE_D);
			GOval oval2 = new GOval(x2, y2, CIRCLE_D, CIRCLE_D);
			add(oval2);
			oval2.setFilled(true);
			oval2.setColor(color);
			count++;
			pause(DELAY);
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (oval1 == null && oval2 == null)
			return;
		else {
			if (oval1 == null) {
				oval1 = (GOval) getElementAt(e.getX(), e.getY());
			} else if (oval2 == null) {
				oval2 = (GOval) getElementAt(e.getX(), e.getY());
			} else {
				oval1 = oval2;
				oval2 = (GOval) getElementAt(e.getX(), e.getY());
			}
			if (oval1 != null && oval2 != null) {
				if (oval1.getColor() == oval2.getColor() && !oval1.equals(oval2)) {
					remove(oval1);
					remove(oval2);
					count--;
				}
			}
		}
	}
}
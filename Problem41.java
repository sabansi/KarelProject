import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.*;

public class Problem41 extends GraphicsProgram {
	private static final int RADIUS = 20;

	public void run() {
		addMouseListeners();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		GOval brush = new GOval(2 * RADIUS, 2 * RADIUS);
		brush.setFilled(true);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(brush, x, y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		addBrush();
	}

	private void addBrush() {
		GOval brush = new GOval(2 * RADIUS, 2 * RADIUS);
		brush.setFilled(true);
		int x = e.getX() - RADIUS;
		int y = e.getY() - RADIUS;
		add(brush, x, y);
	}
}
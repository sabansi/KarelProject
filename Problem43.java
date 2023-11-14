import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.*;

public class Problem43 extends GraphicsProgram {
	private static final int RADIUS = 50;
	private GOval circle;
	private int prevX;
	private int prevY;

	public void run() {
		circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
	//	add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			prevX = e.getX();
			prevY = e.getY();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		GObject obj = getElementAt(e.getX(), e.getY());
		if (obj != null) {
			// move object
			obj.move(e.getX() - prevX, e.getY() - prevY);
			prevX = e.getX();
			prevY = e.getY();
		}
	}
}

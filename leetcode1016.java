import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
	
	RandomGenerator rand = RandomGenerator.getInstance();
	
	private final static int CIRCLE_D = 40;
	
	private GOval circle;
	
	public void run() {
		drawCircle(CIRCLE_D / 2);
		addMouseListeners();
	}

	private void drawCircle(double radius) {
		double x = getWidth() / 2 - radius;
		double y = getHeight() / 2 - radius;
		circle = new GOval(x, y, CIRCLE_D, CIRCLE_D);
		add(circle);
	}
	
	public void mouseClicked(MouseEvent e) {
		circle.setFilled(true);
		circle.setFillColor(rand.nextColor());
	}
	
	public void mouseDragged(MouseEvent e) {
		double x1 = e.getX();
		double y1 = e.getY();
		double x2 = getWidth() / 2;
		double y2 = getHeight() / 2;
		double diff = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		drawCircle((CIRCLE_D / 2) / diff);
	}
}

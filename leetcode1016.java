import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
	
	RandomGenerator rand = RandomGenerator.getInstance();
	
	private final static int CIRCLE_D = 40;
	
	private GOval circle;
	
	public void run() {
		drawCircle();
		addMouseListeners();
	}

	private void drawCircle() {
		double x = getWidth() / 2 - CIRCLE_D / 2;
		double y = getHeight() / 2 - CIRCLE_D / 2;
		circle = new GOval(x, y, CIRCLE_D, CIRCLE_D);
		add(circle);
	}
	
	public void mouseClicked(MouseEvent e) {
		circle.setFilled(true);
		circle.setFillColor(rand.nextColor());
	}
}

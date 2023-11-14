import acm.graphics.GOval;
import acm.program.*;
public class Problem43 extends GraphicsProgram{
	private static final int RADIUS = 50;
	private GOval circle;

	public void run() {
		circle = new GOval(2* RADIUS, 2 * RADIUS);
		add(circle, getWidth() / 2 - RADIUS, getHeight() / 2 - RADIUS);
		addMouseListeners();
	}
}

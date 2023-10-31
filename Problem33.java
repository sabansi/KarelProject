import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import acm.graphics.*;


public class Problem33 extends GraphicsProgram {
	public void run() {
		RandomGenerator rand = new RandomGenerator();
		int radius = rand.nextInt(50, 200);
		GOval circle = new GOval(getWidth() / 2 - radius, getHeight() / 2 - radius, radius * 2, radius * 2);
		circle.setFilled(true);
		Color randColor = rand.nextColor();
		circle.setColor(randColor);
		add(circle);
	}
}

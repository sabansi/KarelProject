import acm.program.*;
import acm.util.RandomGenerator;

import java.awt.Color;
import java.util.Random;
import acm.graphics.*;


public class Problem33 extends GraphicsProgram {
	public void run() {
		RandomGenerator rand = new RandomGenerator();
		int radius = rand.nextInt(199);
		GOval circle = new GOval(getWidth() / 2, getHeight() / 2, radius, radius);
		circle.setFilled(true);
		Color randColor = rand.nextColor();
		circle.setColor(randColor);
		add(circle);
	}
}

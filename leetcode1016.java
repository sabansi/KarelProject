
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram{
	private final static int DELAY = 50;
	public void run() {
	RandomGenerator rgen = RandomGenerator.getInstance();
	GOval oval = new GOval(100,100,50,50);
	add(oval);
	oval.setFilled(true);
	oval.setColor(Color.BLACK);
	while(true) {
		Color c = rgen.nextColor();
		oval.setColor(c);
		if (c.equals(Color.GREEN)) break;
		pause(DELAY);
}
	}
}
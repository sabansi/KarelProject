import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
		myOval.setColor(Color.magenta);
		//GOval secondOval = new GOval(100, 200);
		myOval = new GOval(200, 200);
		add(myOval, 200, 200);
		myOval.setFilled(true);
		myOval.setColor(Color.PINK);
	}
}

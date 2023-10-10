import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	public void run() {
		/* GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
		myOval.setFilled(true);
		myOval.setColor(Color.magenta);
		//GOval secondOval = new GOval(100, 200);
		myOval = new GOval(200, 200);
		add(myOval, 200, 200);
		myOval.setFilled(true);
		myOval.setColor(Color.PINK); 
		*/
		drawMidLine();
	}
	private void drawMidLine() {
		double x1 = 0;
		double y1 = getWidth();
		double x2 = getHeight()/2;
		double y2 = y1;
		GLine Line = new GLine(x1, y1, x2, y2);
		add(Line);
	}
}

import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.*;
public class Problem42 extends GraphicsProgram{
	private GLine line;
	public void run() {
		addMouseListeners();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		line = new GLine(e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
}

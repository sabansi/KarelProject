import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Problem12 extends GraphicsProgram{
	public void run() {
		GOval myOval = new GOval(100, 200);
		add(myOval, 100, 100);
		add(myOval, 200, 200);
	}
}

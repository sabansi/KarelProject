import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {
    private final static int DELAY = 50;

    public void run() {
        RandomGenerator rgen = RandomGenerator.getInstance();
        GOval oval = new GOval(100, 100, 50, 50);
        add(oval);
        oval.setFilled(true);
        oval.setColor(Color.BLACK);

        while (true) {
            Color c = rgen.nextColor();
            oval.setFillColor(c);

            // Compare RGB values instead of using equals
            if (oval.getFillColor().getRGB() == Color.GREEN.getRGB()) {
                break;
            }
            pause(DELAY);
        }
    }
}

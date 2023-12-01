import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class leetcode1016 extends GraphicsProgram {
    private static final int BOX_SIZE = 80;
    private GRect square;
    private GLabel text;
    private int score = 0;

    public void run() {
        draw();
    }

    private void draw() {
        double x1 = getWidth() / 2 - BOX_SIZE / 2;
        double y1 = getHeight() / 2 - BOX_SIZE / 2;
        square = new GRect(x1, y1, BOX_SIZE, BOX_SIZE);
        add(square);

        String labelText = Integer.toString(score);
        text = new GLabel(labelText);
        double x2 = x1 + BOX_SIZE / 2 - text.getWidth() / 2;
        double y2 = y1 + BOX_SIZE / 2 + text.getAscent() / 2;
        add(text, x2, y2);
    }
}

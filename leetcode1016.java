import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class leetcode1016 extends GraphicsProgram {
    private static final int BOX_SIZE = 80;
    private GRect square;
    private GLabel text;
    private int score = 0;
    private int prevX1 = 0;
    private int x1 = 0;
    private int y1 = 0;

    public void run() {
        draw();
    }

    private void draw() {
        double x11 = getWidth() / 2 - BOX_SIZE / 2;
        double y11 = getHeight() / 2 - BOX_SIZE / 2;
        square = new GRect(x11, y11, BOX_SIZE, BOX_SIZE);
        add(square);

        String labelText = Integer.toString(score);
        text = new GLabel(labelText);
        double x2 = x11 + BOX_SIZE / 2 - text.getWidth() / 2;
        double y2 = y11 + BOX_SIZE / 2 + text.getAscent() / 2;
        add(text, x2, y2);
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        prevX1 = x1;
    }

    public void mouseDragged(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();

        if (x1 > prevX1) {
            if (score > 0) {
                score--;
                updateScoreLabel();
            }
        } else {
            if (score < 9) {
                score++;
                updateScoreLabel();
            }
        }

        prevX1 = x1;
    }

    private void updateScoreLabel() {
        String labelText = Integer.toString(score);
        double x2 = getWidth() / 2 - text.getWidth() / 2;
        double y2 = getHeight() / 2 + text.getAscent() / 2;
        text.setLabel(labelText);
        text.setLocation(x2, y2);
    }
}

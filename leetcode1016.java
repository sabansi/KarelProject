import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class leetcode1016 extends GraphicsProgram {
    private static final int BOX_SIZE = 80;
    private GRect square;
    private GLabel text;
    private int score = 0;
    private double x1 = 0;
    private double y1 = 0;

    public void run() {
        draw();
    }

    private void draw() {
        addMouseListeners();
        double x = getWidth() / 2 - BOX_SIZE / 2;
        double y = getHeight() / 2 - BOX_SIZE / 2;
        square = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        add(square);

        String labelText = Integer.toString(score);
        text = new GLabel(labelText);
        double x2 = x + BOX_SIZE / 2 - text.getWidth() / 2;
        double y2 = y + BOX_SIZE / 2 + text.getAscent() / 2;
        add(text, x2, y2);
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();

        if (!isMouseInsideSquare(x1, y1)) {
            x1 = 0;
            y1 = 0;
        }
    }

    public void mouseDragged(MouseEvent e) {
        double x2 = e.getX();
        double y2 = e.getY();

        if (isMouseInsideSquare(x2, y2)) {
            if (x1 > x2) {
                if (score > 0) {
                    score--;
                    updateScoreLabel();
                }
            } else if (x1 < x2) {
                if (score < 9) {
                    score++;
                    updateScoreLabel();
                }
            }

            x1 = x2;
        }
    }

    private boolean isMouseInsideSquare(double x, double y) {
        return x >= square.getX() && x <= square.getX() + square.getWidth() &&
               y >= square.getY() && y <= square.getY() + square.getHeight();
    }

    private void updateScoreLabel() {
        String labelText = Integer.toString(score);
        double x = getWidth() / 2 - text.getWidth() / 2;
        double y = getHeight() / 2 + text.getAscent() / 2;
        text.setLabel(labelText);
        text.setLocation(x, y);
    }
}

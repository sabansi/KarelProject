import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class leetcode1016 extends GraphicsProgram {

    RandomGenerator rand = RandomGenerator.getInstance();

    private final static int CIRCLE_D = 40;

    private GOval circle;
    private Color circleColor; // Store the original color
    private boolean mousePressed = false;

    public void run() {
        drawCircle(CIRCLE_D / 2);
        addMouseListeners();
    }

    private void drawCircle(double radius) {
        double x = getWidth() / 2 - radius;
        double y = getHeight() / 2 - radius;
        circle = new GOval(x, y, radius * 2, radius * 2);
        circleColor = rand.nextColor(); // Store the original color
        circle.setFilled(true);
        circle.setFillColor(circleColor);
        add(circle);
    }

    public void mouseClicked(MouseEvent e) {
        mousePressed = true;
        circleColor = rand.nextColor(); // Update the circleColor without changing the circle's color
    }

    public void mouseReleased(MouseEvent e) {
        mousePressed = false;
    }

    public void mouseDragged(MouseEvent e) {
        if (mousePressed) {
            double x1 = e.getX();
            double y1 = e.getY();
            double x2 = getWidth() / 2;
            double y2 = getHeight() / 2;

            double newRadius = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

            updateCircleRadius(newRadius);
        }
    }

    private void updateCircleRadius(double newRadius) {
        double x = getWidth() / 2 - newRadius;
        double y = getHeight() / 2 - newRadius;

        remove(circle);

        circle = new GOval(x, y, newRadius * 2, newRadius * 2);
        circle.setFilled(true);
        circle.setFillColor(circleColor);
        add(circle);
    }
}

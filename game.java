import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class game extends GraphicsProgram {
    private JTextField VX;
    private JTextField VY;
    private int vx;
    private int vy;
    private boolean isStopped = false;
    private RandomGenerator rgen = RandomGenerator.getInstance();
    private static final int BALL_RADIUS = 5;
    private static final int DELAY = 10;
    private GOval ball;

    public void init() {
        createButton();
        addActionListeners();
        addMouseListeners();
    }

    public void run() {
        drawTheBall();
        new Thread(() -> ballMovement()).start();
    }

    private void ballMovement() {
        while (true) {
            if (!isStopped) {
                moveBall();
            }
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveBall() {
        ball.move(vx, vy);
        checkWallCollision();
    }

    private void checkWallCollision() {
        if (ball.getX() < 0 || ball.getX() > getWidth() - 2 * BALL_RADIUS) {
            vx = -vx;
        }
        if (ball.getY() < 0 || ball.getY() > getHeight() - 2 * BALL_RADIUS) {
            vy = -vy;
        }
    }

    private void drawTheBall() {
        ball = new GOval(40, 40);
        ball.setLocation(50, 32);
        ball.setFilled(true);
        ball.setColor(Color.BLACK);
        add(ball);
    }

    private void createButton() {
        add(new JLabel("VX: "), SOUTH);
        VX = new JTextField(10);
        VX.addActionListener(this);
        add(VX, SOUTH);
        add(new JLabel("VY: "), SOUTH);
        VY = new JTextField(10);
        VY.addActionListener(this);
        add(VY, SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (!VX.getText().isEmpty()) {
            int x = convertToInt(VX.getText());
            vx = x;
        }
        if (!VY.getText().isEmpty()) {
            int y = convertToInt(VY.getText());
            vy = y;
        }
    }

    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == ball) {
            if (e.getClickCount() == 3) {
                isStopped = !isStopped;
            } else if (e.getClickCount() == 2) {
                isStopped = false;
            }
        }
    }

    private int convertToInt(String text) {
        int ans = 0;
        for (int i = 0; i < text.length(); i++) {
            ans = 10 * ans + (text.charAt(i) - 48);
        }
        return ans;
    }
}

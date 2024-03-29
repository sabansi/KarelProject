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
    private int counterStop;
    private int counterResume;
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
        ballMovement();
    }

    private void ballMovement() {
        vy = rgen.nextInt(0, 10);
        vx = rgen.nextInt(0, 10);

        while (true) {
            if (!isStopped) {
                ball.move(vx, vy);
                pause(DELAY);
                if (ball.getX() < 0) {
                    vx = -vx;
                } else if (ball.getX() > getWidth() - 2 * BALL_RADIUS) {
                    vx = -vx;
                } else if (ball.getY() < 0) {
                    vy = -vy;
                } else if (ball.getY() > getHeight() - 2 * BALL_RADIUS) {
                    vy = -vy;
                }
            }
            else ball.move(0, 0);
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

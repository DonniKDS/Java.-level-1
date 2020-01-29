/*
Не придумал ничего лучше, чем разобраться в коде, который
написан в статье "Быстрый старт с Java: «лопни шарик»"
https://geekbrains.ru/posts/bystryj-start-s-java-lopni-sharik

Из изменений которые добавил в него, это ускорее появления шариков
и Game over теперь выводится не в консоль, а повляется ввиде кнопки.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;


public class RandomBalls extends JFrame {

    final String TITLE_OF_PROGRAM = "Random balls";
    final int WINDOW_WIDTH = 650;
    final int WINDOW_HEIGHT = 650;
    final Color[] COLORS = {Color.red, Color.green, Color.blue};
    Random random = new Random();
    ArrayList<Ball> balls = new ArrayList<>();
    int showDelay = 500;
    int counter = 0;
    Canvas canvas = new Canvas();

    public static void main(String[] args) {
        new RandomBalls().game();
    }

    public RandomBalls() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas.setBackground(Color.white);
        canvas.setPreferredSize(
                new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        canvas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                canvas.repaint();
                deleteBall(e.getX(), e.getY());
            }
        });
        add(canvas);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    void game() {
        while (true) {
            addBall();
            if (balls.size() >= 5) {
                JButton button = new JButton("GAME OVER");
                add(button, BorderLayout.CENTER);
                setVisible(true);
                break;
            }
            canvas.repaint();
            counter++;
            if (counter % 10 == 0 && showDelay > 100) {
                showDelay -= 100;
            }
            try {
                Thread.sleep(showDelay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void addBall() {
        int d = random.nextInt(20) + 60;
        int x = random.nextInt(WINDOW_WIDTH - d);
        int y = random.nextInt(WINDOW_HEIGHT - d);
        Color color = COLORS[random.nextInt(COLORS.length)];
        balls.add(new Ball(x, y, d, color));

    }

    void deleteBall(int x, int y) {
        for (int i = balls.size() - 1; i > -1; i--) {
            double dx = balls.get(i).x + balls.get(i).d/2 - x;
            double dy = balls.get(i).y  + balls.get(i).d/2 - y;
            double d = Math.sqrt(dx * dx + dy * dy);
            if (d < balls.get(i).d/2) {
                balls.remove(i);
                break;
            }
        }
    }



    class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for (Ball ball : balls) {
                ball.paint(g);
            }
        }
    }

    class Ball {
        int x, y, d;
        Color color;

        Ball(int x, int y, int d, Color color) {
            this.x = x;
            this.y = y;
            this.d = d;
            this.color = color;
        }

        void paint(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, d, d);
            g.setColor(Color.black);
            g.drawOval(x, y, d, d);
        }
    }
}

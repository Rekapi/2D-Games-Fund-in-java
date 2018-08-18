package Chapter1.javagames.render;

import Chapter1.javagames.util.FrameRate;

import javax.swing.*;
import java.awt.*;

public class HelloWorldApp extends JFrame {
    private FrameRate frameRate;

    public HelloWorldApp() {
        frameRate = new FrameRate();
    }

    // GUI method
    // 1. creating game panel

    private class GamePanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            onPaint(g);
        }
    }

    protected void onPaint(Graphics g) {
        frameRate.calculate();
        g.setColor(Color.WHITE);
        g.drawString(frameRate.getFrameRate(), 50, 50);
        repaint();
    }

    protected void createAndShowGUI() {
        GamePanel gamePanel = new GamePanel();
        gamePanel.setBackground(Color.BLACK);
        gamePanel.setPreferredSize(new Dimension(320, 240));
        getContentPane().add(gamePanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(" FPS Counter-- Hello World");
        pack();
        frameRate.initialize();
        setVisible(true);
    }

    public static void main(String[] args) {
        final HelloWorldApp app = new HelloWorldApp();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                app.createAndShowGUI();
            }
        });
    }
}

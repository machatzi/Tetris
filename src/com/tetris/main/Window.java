package com.tetris.main;

        import javax.swing.*;
        import java.awt.*;

public class Window extends Canvas {
    private static final long serialVersionUID = -5591771183589240798L;

    public Window(int height, int width, String title, Game game) {
        JFrame jframe = new JFrame(title);

        Dimension windowDimension = new Dimension(width, height);

        jframe.setPreferredSize(windowDimension);
        jframe.setMaximumSize(windowDimension);
        jframe.setMinimumSize(windowDimension);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setLocationRelativeTo(null);
        jframe.add(game);
        jframe.setVisible(true);
        game.start();
    }
}

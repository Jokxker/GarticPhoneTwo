package view;

import controller.GameController;
import model.GameModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PlayerView implements GameView {
    private GameController controller;
    private GameModel model;
    private String name;
    private JFrame frame;
    private JPanel panel;
    private JLabel enter;
    private JTextField countText;
    private JButton send;

    public PlayerView(GameController controller, GameModel model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver(this);
    }

    public void createCountPlayers() {
        panel = new JPanel(new GridLayout(3, 1));
        frame = new JFrame("Gartic phone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        enter = new JLabel("Enter count players");
        countText = new JTextField(25);
        send = new JButton("Send");
        send.addActionListener(e -> {
            System.out.println("yes");
        });
        panel.add(enter);
        panel.add(countText);
        panel.add(send);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void updateGameView() {
        name = model.getName();
    }
}

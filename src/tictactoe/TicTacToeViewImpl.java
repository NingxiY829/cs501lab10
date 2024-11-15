package tictactoe;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class TicTacToeViewImpl extends JFrame implements TicTacToeView {
  private ReadonlyTttModel model;
  private final int BOARD_SIZE = 3;
  private JButton[][] buttons;

  public TicTacToeViewImpl(ReadonlyTttModel model) {
    super("TicTacToe");
    this.model = model;

    for (int i = 0; i < BOARD_SIZE; i++) {
      for (int j = 0; j < BOARD_SIZE; j++) {
        buttons[i][j] = new JButton("");
        buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
        buttons[i][j].setFocusPainted(false);
        add(buttons[i][j]);
      }
    }


    pack();

  }

  @Override
  public void addClickListener(TicTacToeController listener) {
    for (int i = 0; i < buttons.length; i++) {
      for (int j = 0; j < buttons[i].length; j++) {
        //buttons[i][j].addActionListener(listener);
      }
    }
  }

  @Override
  public void refresh() {
    for (int i = 0; i < BOARD_SIZE; i++) {
      for (int j = 0; j < BOARD_SIZE; j++) {
        buttons[i][j].setFont(new Font("Arial", Font.PLAIN, 60));
        add(buttons[i][j]);
      }
    }
  }

  @Override
  public void makeVisible() {
    setVisible(true);
  }
}

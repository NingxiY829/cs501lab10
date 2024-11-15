package tictactoe;

import javax.swing.*;

public class TicTacToeViewImpl extends JFrame implements TicTacToeView {
  private ReadonlyTttModel model;

  public TicTacToeViewImpl(ReadonlyTttModel model) {
    this.model = model;
  }

  @Override
  public void addClickListener(TicTacToeController listener) {

  }

  @Override
  public void refresh() {

  }

  @Override
  public void makeVisible() {

  }
}

package tictactoe;

public class TicTacToeControllerImpl implements TicTacToeController {
  private TicTacToeView view;
  private TicTacToeModel model;

  public TicTacToeControllerImpl(TicTacToeModel model, TicTacToeView view) {
    this.model = model;
    this.view = view;
  }

  @Override
  public void playGame() {

  }

  @Override
  public void handleCellClick(int row, int col) {

  }
}

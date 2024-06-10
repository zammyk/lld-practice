package tictactoe;

import tictactoe.symbols.Symbol;

import java.util.Objects;

public class Board {
    int size;
    private final Symbol[][] board;
    Board (int size) {
        this.size = size;
        this.board = new Symbol[size][size];
    }
    boolean isCellEmpty (int row, int col) {
        return Objects.isNull(board[row][col]);
    }
    void play (Symbol symbol, int row, int col) {
        board[row][col] = symbol;
    }
    boolean isGameComplete () {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (Objects.isNull(board[row][col])) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean winnerFound() {
        // TODO: add winnerFound logic
        return true;
    }

    public void display() {
        // TODO: add display logic
    }
}

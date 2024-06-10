import symbols.Symbol;

public class Board {
    int size;
    private Symbol[][] board;
    Board (int size) {
        this.board = new Symbol[size][size];
    }
}

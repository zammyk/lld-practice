import java.util.List;
import java.util.Objects;

public class Game {
    List<Player> players;
    Board board;
    int currentPlayer;
    Player winner;
    Game (List<Player> players, int boardSize) {
        this.board = new Board(boardSize);
        this.players = players;
        this.currentPlayer = 0;
        this.board.display();
    }
    void playTurn() {
        try {
            System.out.printf("%s please make a move%n", players.get(currentPlayer).getName());
            String playerInput = null;                                                                                  // TODO: add player input
            String[] inputArray = playerInput.split(",");

            int row = Integer.parseInt(inputArray[0]);
            int col = Integer.parseInt(inputArray[1]);

            if (Math.min(row, col) < 0 || Math.max(row, col) >= board.size) {
                throw new RuntimeException("Invalid entry");
            }
            if (!board.isCellEmpty(row, col)) {
                throw new Exception("This cell is not empty");
            }

            board.play(players.get(currentPlayer).getSymbol(), row, col);
            this.board.display();

            winner = board.winnerFound() ? players.get(currentPlayer) : null;
            currentPlayer = (currentPlayer + 1) % players.size();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    boolean isGameOver() {
        return Objects.nonNull(winner) || board.isGameComplete();
    }

    public Player getWinner() {
        return this.winner;
    }
}

package tictactoe;

import tictactoe.symbols.SymbolO;
import tictactoe.symbols.SymbolX;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Rahul", new SymbolO());
        Player p2 = new Player("Saketh", new SymbolX());
        Game ticTacToe = new Game(List.of(p1, p2), 3);
        while (!ticTacToe.isGameOver()) {
            ticTacToe.playTurn();
        }
        if (Objects.nonNull(ticTacToe.getWinner())) {
            System.out.println("We have a winner");
        } else {
            System.out.println("Its a draw");
        }
    }
}
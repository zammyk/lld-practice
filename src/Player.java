import symbols.Symbol;

public class Player {
    private final String name;
    private final Symbol symbol;
    Player (String name, Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }
    Symbol getSymbol() {
        return symbol;
    }

    public String getName() {
        return this.name;
    }
}

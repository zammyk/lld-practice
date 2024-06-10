package symbols;

public abstract class Symbol {
    SymbolType symbolType;
    Symbol(SymbolType symbolType) {
        this.symbolType = symbolType;
    }
}

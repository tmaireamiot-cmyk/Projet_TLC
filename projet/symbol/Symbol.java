package projet.symbol;

public abstract class Symbol {
    protected String name;  // Nom du symbole

    public Symbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

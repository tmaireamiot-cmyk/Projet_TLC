package projet.symbol;


public class Variable extends Symbol {
    private String type;  // Type simulé (exemple : binary_tree)
    private boolean used = false;
    private int declaredLine = -1;

    public Variable(String name, String type) {
        super(name);
        this.type = type;
    }

    public void setDeclaredLine(int line) { this.declaredLine = line; }
    public int getDeclaredLine() { return this.declaredLine; }

    public void setUsed(boolean u) { this.used = u; }
    public boolean isUsed() { return this.used; }

    public String getType() {
        return type;
    }

    public void setType(String nouveau_type) {
    	this.type=nouveau_type;
    }
    @Override
    public String toString() {
        return "Variable{name='" + name + "', type='" + type + "}";
    }
}


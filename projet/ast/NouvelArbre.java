package projet.ast;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class NouvelArbre extends CommonTree {
    
    private String information = null; 
    // Decorations / métadonnées pour AST décoré
    private projet.symbol.Symbol symbol = null;
    private String type = null; // type simple (ex: "int", "bool", "tree", etc.)
    private boolean isConstant = false;
    private Object constValue = null;
    private int line = -1;
    private int col = -1;
    private boolean used = false;

    public NouvelArbre(Token token) {
        super(token);
        if (token != null) {
            this.line = token.getLine();
            this.col = token.getCharPositionInLine();
        }
    }

    public String getInformation() {
        return this.information;
    }
    
    public void setInformation(String info) {
        this.information=info;
    }

    // Symbol annotations
    public void setSymbol(projet.symbol.Symbol s) { this.symbol = s; }
    public projet.symbol.Symbol getSymbol() { return this.symbol; }

    // Type annotations (nommé différemment pour éviter collision avec ANTLR Tree.getType())
    public void setSemanticType(String t) { this.type = t; }
    public String getSemanticType() { return this.type; }

    // Constante
    public void setConstant(Object value) { this.isConstant = true; this.constValue = value; }
    public boolean isConstant() { return this.isConstant; }
    public Object getConstValue() { return this.constValue; }

    // Source position
    public void setLine(int l) { this.line = l; }
    public int getLine() { return this.line; }
    public void setCol(int c) { this.col = c; }
    public int getCol() { return this.col; }

    // Usage flag
    public void setUsed(boolean u) { this.used = u; }
    public boolean isUsed() { return this.used; }

    // pour dupliquer le noeud, voir internet si ca existe
    @Override
    public CommonTree dupNode() {
        return new NouvelArbre(this.token); 
    }

    // Affichage : Très utile pour vérifier le résultat avec toStringTree()
    @Override
    public String toString() {
        if (information != null) {
            // Affichage: NOM_DU_TOKEN[texte_token] [étiquette]
            return super.toString() + " [" + information + "]";
        }
        return super.toString();
    }
}
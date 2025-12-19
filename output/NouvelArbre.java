import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class NouvelArbre extends CommonTree {
    
    private String information = null; 

    public NouvelArbre(Token token) {
        super(token);
    }

    public String getInformation() {
        return this.information;
    }
    
    public void setInformation(String info) {
        this.information=info;
    }

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
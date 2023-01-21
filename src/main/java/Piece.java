import java.util.List;

public class Piece extends Componant{

    String nom;
    float prix;
    String codeproduit;

    public Piece(String nom, float prix, String codeproduit) {
        this.nom = nom;
        this.prix = prix;
        this.codeproduit = codeproduit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getCodeproduit() {
        return codeproduit;
    }

    public void setCodeproduit(String codeproduit) {
        this.codeproduit = codeproduit;
    }
}

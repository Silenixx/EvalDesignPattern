import java.util.List;

public class Appareil extends Componant{

    String nom;
    float prix;
    String codeproduit;

    public Appareil(String nom, float prix, String codeproduit) {
        this.nom = nom;
        this.prix = prix;
        this.codeproduit = codeproduit;
    }

    public Appareil() {

    }

    List<Componant> list_componant;

    void add_componant(Componant componant)
    {
        list_componant.add(componant);
        return;
    }

    void del_componant(Componant componant)
    {
        list_componant.remove(componant);
        return;
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

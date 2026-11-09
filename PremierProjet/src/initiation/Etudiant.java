package initiation;




public class Etudiant {

    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne) {
        setNom(nom);
        setMoyenne(moyenne);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void ajouterPoints(double points) {
        setMoyenne(moyenne + points);
    }

    public boolean aLaMoyenne() {
        return moyenne >= 10;
    }
}

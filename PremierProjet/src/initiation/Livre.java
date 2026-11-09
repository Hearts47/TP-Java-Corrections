package initiation;


public class Livre {

    private String titre;
    private String auteur;
    private boolean emprunte;

    public Livre(String titre, String auteur) {
        setTitre(titre);
        setAuteur(auteur);
        setEmprunte(false);
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setEmprunte(boolean emprunte) {
        this.emprunte = emprunte;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public boolean isEmprunte() {
        return emprunte;
    }

    public void emprunter() {
        emprunte = true;
    }

    public void rendre() {
        emprunte = false;
    }
}

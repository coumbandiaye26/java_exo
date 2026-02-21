package sn.coumba.l2gl.app.model;

public class Note {
    // ÉTAPE 1 : Attributs privés (Relation entre Etudiant et Module)
    private Etudiant etudiant;
    private Module module;
    private double valeur;

    // ÉTAPE 2 : Constructeur avec contrôle d'intégrité
    public Note(Etudiant etudiant, Module module, double valeur) {
        if (etudiant == null || module == null) {
            throw new IllegalArgumentException("L'étudiant et le module sont requis.");
        }
        if (valeur < 0 || valeur > 20) {
            throw new IllegalArgumentException("La note doit être entre 0 et 20.");
        }
        this.etudiant = etudiant;
        this.module = module;
        this.valeur = valeur;
    }

    // ÉTAPE 3 : Getters
    public Etudiant getEtudiant() { return etudiant; }
    public Module getModule() { return module; }
    public double getValeur() { return valeur; }

    // ÉTAPE 4 : Méthode métier (Calcul automatique)
    public double getPoints() {
        return valeur * module.getCoefficient();
    }

    // ÉTAPE 5 : toString() avec calcul des points inclus
    @Override
    public String toString() {
        return "Note{etudiant=" + etudiant.getMatricule() + 
               ", module=" + module.getCode() + 
               ", valeur=" + valeur + 
               ", points=" + getPoints() + "}";
    }
}
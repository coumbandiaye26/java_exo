package sn.coumba.l2gl.app.model;

public class Module {
    // ÉTAPE 1 : Attributs privés
    private String code;
    private String libelle;
    private double coefficient;

    // ÉTAPE 2 : Constructeur complet avec validations strictes
    public Module(String code, String libelle, double coefficient) {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("Le code est obligatoire.");
        }
        if (libelle == null || libelle.isBlank()) {
            throw new IllegalArgumentException("Le libellé est obligatoire.");
        }
        if (coefficient <= 0) {
            throw new IllegalArgumentException("Le coefficient doit être positif.");
        }
        this.code = code;
        this.libelle = libelle;
        this.coefficient = coefficient;
    }

    // ÉTAPE 3 : Constructeur surchargé (Coeff par défaut 1.0)
    public Module(String code, String libelle) {
        this(code, libelle, 1.0);
    }

    // ÉTAPE 4 : Getters (Nécessaires pour la classe Note)
    public String getCode() { return code; }
    public String getLibelle() { return libelle; }
    public double getCoefficient() { return coefficient; }

    // ÉTAPE 5 : toString() redéfini pour le debug
    @Override
    public String toString() {
        return "Module{code=" + code + ", libelle=" + libelle + ", coefficient=" + coefficient + "}";
    }
}
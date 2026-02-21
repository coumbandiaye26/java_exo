package sn.coumba.l2gl.app.model;

public class Etudiant {
    // ÉTAPE 1 : Attributs privés pour l'encapsulation (Sécurité)
    private String matricule;
    private String nom;

    private static int compteur = 0;
    // ÉTAPE 2 : Constructeur principal (Complet)
    // Il force la saisie des données dès la naissance de l'objet
    public Etudiant(String matricule, String nom) {
        // Validation : Le matricule ne doit pas être vide
        if (matricule == null || matricule.isBlank()) {
            throw new IllegalArgumentException("Erreur : Le matricule est obligatoire.");
        }
        // Validation : Le nom ne doit pas être vide
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Erreur : Le nom est obligatoire.");
        }
        this.matricule = matricule;
        this.nom = nom;
    }

    // ÉTAPE 3 : Constructeur surchargé
    // Permet de créer un étudiant avec juste son matricule (le nom sera "Inconnu")
    // On utilise this(...) pour éviter de dupliquer les validations du dessus
    public Etudiant(String matricule) {
        this(matricule, "Inconnu"); 
    }
    //this() constructeur
    
    // ÉTAPE 4 : Getters (Accesseurs)
    // Indispensables pour que la classe Note puisse lire le matricule ou le nom
    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    // ÉTAPE 5 : Setter pour le nom uniquement
    // On ne met pas de setter pour le matricule (il est interdit de le changer)
    public void setNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nouveau nom ne peut pas être vide.");
        }
        this.nom = nom;
    }

    // ÉTAPE 6 : Méthode d'affichage classique
    public void afficher() {
        System.out.println(matricule + " - " + nom);
    }

    // ÉTAPE 7 : Redéfinition de toString (Override)
    // Pour que System.out.println(etudiant) affiche du texte et non une adresse mémoire
    @Override
    public String toString() {
        return "Etudiant{matricule=" + matricule + ", nom=" + nom + "}";
    }
    public static int getCompteur() {
        return compteur;
    }
}
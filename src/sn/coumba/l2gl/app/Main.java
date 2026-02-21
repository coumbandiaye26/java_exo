package sn.coumba.l2gl.app;

import sn.coumba.l2gl.app.model.Etudiant;
import sn.coumba.l2gl.app.model.Module;
import sn.coumba.l2gl.app.model.Note;

public class Main {
    public static void main(String[] args) {
        try {
            // Création de deux étudiants pour tester le compteur
            Etudiant e1 = new Etudiant("2026-001", "Awa");
            Etudiant e2 = new Etudiant("2026-002", "Moussa");
            
            Module m1 = new Module("JAVA", "Programmation Java", 2.0);
            
            // Création de la dernière note
            Note n1 = new Note(e1, m1, 17.5);

            // ÉTAPE 4 : Affichage du Bilan Final
            // Notez l'appel Etudiant.getCompteur() (avec une Majuscule)
            System.out.println("\n========================================");
            System.out.println("BILAN TD2:");
            System.out.print("Etudiants créés: " + Etudiant.getCompteur());
            System.out.print(" | Dernière note: " + n1.getValeur() + "/20");
            System.out.println(" | Points (coeff): " + n1.getPoints());
            System.out.println("========================================");

        } catch (IllegalArgumentException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}²
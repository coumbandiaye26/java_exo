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

<<<<<<< HEAD
=======
            // ÉTAPE 6 : Création d'objets Note
            // La note fait le lien entre un étudiant, un module et une valeur (0 à 20)
            Note n1 = new Note(e1, m1, 15.5);
            Note n2 = new Note(e1, m2, 12.0);

            // ÉTAPE 7 : Affichage des résultats
            // On utilise System.out.println qui appelle automatiquement toString()
            System.out.println("\n--- Liste des Étudiants ---");
            System.out.println(e1);
            System.out.println(e2);

            System.out.println("\n--- Liste des Modules ---");
            System.out.println(m1);
            System.out.println(m2);

            System.out.println("\n--- Détails des Notes ---");
            System.out.println(n1); // Affiche l'étudiant, le module, la valeur et les points
            System.out.println(n2);

            // ÉTAPE 8 : Test de sécurité (Vérification des validations)
            // Tentons de créer une note invalide pour tester notre protection
            System.out.println("\n--- Test de sécurité (Note > 20) ---");
            Note nErreur = new Note(e1, m1, 25.0); // Ceci va échouer et aller au catch
             // Création de deux étudiants pour tester le compteur
            Etudiant e1 = new Etudiant("2026-001", "Awa");
            Etudiant e2 = new Etudiant("2026-002", "Moussa");
            
            Module m1 = new Module("JAVA", "Programmation Java", 2.0);
            
            // Création de la dernière note
            Note n1 = new Note(e1, m1, 17.5);

>>>>>>> c6c443915fd843a3f12dce8b6dad8a4201a8a5f9
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
<<<<<<< HEAD
}²
=======
}
>>>>>>> c6c443915fd843a3f12dce8b6dad8a4201a8a5f9

package sn.coumba.l2gl.app;

// ÉTAPE 1 : Imports des classes de notre modèle

import sn.coumba.l2gl.app.model.Etudiant;
import sn.coumba.l2gl.app.model.Module;
import sn.coumba.l2gl.app.model.Note;

public class Main {
    
    // ÉTAPE 2 : Point d'entrée principal du programme
    public static void main(String[] args) {
        
        // ÉTAPE 3 : Utilisation d'un bloc try-catch pour gérer les erreurs de validation
        // Cela permet de capturer les IllegalArgumentException lancées par nos constructeurs
        try {
            System.out.println("=== INITIALISATION DES DONNÉES ===");

            // ÉTAPE 4 : Création d'objets Etudiant
            // On utilise le constructeur complet pour e1 et le surchargé pour e2
            Etudiant e1 = new Etudiant("2026-001", "Awa Ndiaye");
            Etudiant e2 = new Etudiant("2026-002"); // Nom sera "Inconnu" par défaut
            
            // ÉTAPE 5 : Création d'objets Module
            // On définit un code, un libellé et un coefficient
            Module m1 = new Module("JAVA", "Programmation Java", 2.0);
            Module m2 = new Module("BD", "Bases de Données", 1.5);

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

            // ÉTAPE 4 : Affichage du Bilan Final
            // Notez l'appel Etudiant.getCompteur() (avec une Majuscule)
            System.out.println("\n========================================");
            System.out.println("BILAN TD2:");
            System.out.print("Etudiants créés: " + Etudiant.getCompteur());
            System.out.print(" | Dernière note: " + n1.getValeur() + "/20");
            System.out.println(" | Points (coeff): " + n1.getPoints());
            System.out.println("========================================");

        } catch (IllegalArgumentException e) {
            // ÉTAPE 9 : Capture et affichage du message d'erreur si une règle est violée
            System.err.println("ERREUR CAPTURÉE : " + e.getMessage());
        }
    }
}

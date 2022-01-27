package com.training.example;

import java.util.Arrays;
import java.util.Scanner;

public class TrianglePascal {

    private static String chaineTableau(int[] tableau){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i<tableau.length ; i++){

            sb.append(tableau[i]);
            if ((tableau.length > 1) && (i < tableau.length -1))
                sb.append(" ");

        }
        sb.append("]");
        return sb.toString();
    }

    private static void afficherTableau(int[] tableau){
        System.out.println(chaineTableau(tableau));
    }

    private static void afficherTriangle(int[][] triangle){
        for (int i=0; i<triangle.length; i++){
            afficherTableau(triangle[i]);
        }
    }

    private static int saisirValeur(Scanner scanner){
        System.out.println("Entrez le nombre de lignes à calculer : ");
        return scanner.nextInt();
    }

    private static String[][] ajouterEleve(String[][] tableauEleve, String[] tableauNotePrenom){
        String[][] newTab = new String[tableauEleve.length + 1][];
        for (int i = 0; i < tableauEleve.length; i++){
            newTab[i] = Arrays.copyOf(tableauEleve[i], tableauEleve[i].length);
        }
        newTab[newTab.length -1] = Arrays.copyOf(tableauNotePrenom, tableauNotePrenom.length);
        return newTab;
    }

    private static int[][] ajouterLigne(int[][] triangle, int[] ligne){
        // Ajoute un tableau dans [length + 1 ][ici]
        // Augment le nombre de ligne (taille premiére dimention)
        int[][] newTab = new int[triangle.length + 1][];
        // recopie l'existant
        for (int i = 0; i < triangle.length; i++){
            newTab[i] = Arrays.copyOf(triangle[i], triangle[i].length);
        }
        // ajoute le nouvel élément
        newTab[newTab.length - 1] = Arrays.copyOf(ligne, ligne.length);

        return newTab;
    }

    public static int[] ajouterValeur(int valeur, int[] tableau){
        int[] newTab = Arrays.copyOf(tableau, tableau.length + 1);
        newTab[newTab.length - 1] = valeur;
        return  newTab;
    }

    public static void Go(){
        int amorce = 1;
        int[][] triangle = {};

        Scanner scanner = new Scanner(System.in);
        int nbLigne = saisirValeur(scanner);

        for (int i = 1; i <= nbLigne; i++){
            // 1 est un cas particulier
            if (i == 1) {
                int[] ligne = {1};
                triangle = ajouterLigne(triangle, ligne);
            }
            // 2 est un cas particulier
            if (i == 2){
                int[] ligne = {1, 1};
                triangle = ajouterLigne(triangle, ligne);
            }
            if (i > 2){
                // nb colonne = N° de ligne
                int[] ligne = new int[i];
                // Met 1 a chaque extrémité
                ligne[0] = 1;
                ligne[ligne.length - 1] = 1;
                // traite les valeurs du milieu
                for (int j = 1; j <= ligne.length - 2; j++){
                    // ligne précedente. Attention elle est sur i-2
                    int a =  triangle[i - 2][j - 1];
                    int b = triangle[i - 2][j];
                    // somme
                    int val = a + b;
                    ligne[j] = val;
                }
                triangle = ajouterLigne(triangle, ligne);
            }
        }

        afficherTriangle(triangle);

        scanner.close();
    }
}

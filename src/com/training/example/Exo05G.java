package com.training.example;

import java.util.Arrays;
import java.util.Scanner;

public class Exo05G {

    private static final Scanner scanner = new Scanner(System.in);

    private static String chaineTableau(int[] tableau){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i<tableau.length ; i++){

            sb.append(tableau[i]);
            if ((tableau.length > 1) && (i < tableau.length -1))
                sb.append(",");

        }
        sb.append("]");
        return sb.toString();
    }

    private static void afficherTableau(int[] tableau){
        System.out.println(chaineTableau(tableau));
    }

    private static int saisirNombre(){
        System.out.println("Entrez une valeur : ");
        return scanner.nextInt();
    }

    private static boolean continuer(){
        System.out.println("Voulez-vous enntrer une autre valeur (O/N) ?");
        return (scanner.next().toUpperCase().equals("O"));
    }

    private static int[] enregistrer(int nombre, int[] tableau){
        int[] newTab = Arrays.copyOf(tableau, tableau.length + 1);
        newTab[newTab.length - 1] = nombre;
        return  newTab;
    }

    private static int[] augmenterValeur(int[] tableau, int valeur){
        for (int i = 0; i < tableau.length; i++){
            tableau[i] = tableau[i] + valeur;
        }
        return tableau;
    }

    public static void Go(){
        int [] tableau = {};
        do {
            int valeur = saisirNombre();
            tableau = enregistrer(valeur, tableau);
            afficherTableau(tableau);
        } while (continuer());

        tableau = augmenterValeur(tableau, 1);
        afficherTableau(tableau);
    }

}

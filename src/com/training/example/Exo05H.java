package com.training.example;

import java.util.Scanner;

public class Exo05H {

    private static int saisirNombre(Scanner scanner){
        System.out.println("Entrez une valeur : ");
        return scanner.nextInt();
    }

    public static void Go(){
        final int NB_VAL = 5;
        Scanner scanner = new Scanner(System.in);

        int[] tableau = {};
        do {
            int valeur = saisirNombre(scanner);
            tableau = TabUtils.ajouterValeur(valeur, tableau);
            TabUtils.afficherTableau(tableau);
        } while (tableau.length < NB_VAL);

        int max = TabUtils.chercherValeurMax(tableau);
        System.out.println("Maximun = " + max);

        // Exercice 05i
        int idxMax = TabUtils.chercherIndexValeurMax(tableau);
        System.out.println("Index maximun = " + idxMax);

        scanner.close();
    }
}

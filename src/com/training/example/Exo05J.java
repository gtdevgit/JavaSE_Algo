package com.training.example;

import java.util.Scanner;

public class Exo05J {

    private static int saisirNombre(Scanner scanner){
        System.out.println("Entrez une valeur : ");
        return scanner.nextInt();
    }

    private static boolean valeurStop(int valeur){
        final int VALEUR_STOP = 0;
        return (valeur == VALEUR_STOP);
    }

    public static void Go(){

        Scanner scanner = new Scanner(System.in);
        int [] tableau = {};
        int valeur;
        do {
            valeur = saisirNombre(scanner);
            if (!valeurStop(valeur)) {
                tableau = TabUtils.ajouterValeur(valeur, tableau);
                TabUtils.afficherTableau(tableau);
            }
        } while (!valeurStop(valeur));

        System.out.println("Valeur max");
        System.out.println(TabUtils.chercherValeurMax(tableau));
    }
}

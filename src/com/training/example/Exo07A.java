package com.training.example;

import java.util.Scanner;

public class Exo07A {

    private static String saisirValeur(Scanner scanner){
        System.out.println("Entrez un mot : ");
        return scanner.next();
    }

    private static int longueurChaine(String chaine){
        return chaine.length();
    }

    public static void Go(){
        Scanner scanner = new Scanner(System.in);

        String mot = saisirValeur(scanner);
        System.out.println("la longueur du mot est : " + longueurChaine(mot));

        scanner.close();
    }
}

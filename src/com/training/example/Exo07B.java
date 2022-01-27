package com.training.example;

import java.util.Random;
import java.util.Scanner;

public class Exo07B {

    private static int saisirValeur(Scanner scanner){
        System.out.println("Entrez une valeur : ");
        return scanner.nextInt();
    }

    public static void Go(){
        // Chiffre aléatoire entre 0 et 5
        Scanner scanner = new Scanner(System.in);

        Random rn = new Random();
        int x = rn.nextInt(6);
        int val = 0;
        do {
            val = saisirValeur(scanner);
            if (val < x)
                System.out.println("trop petit");
            if (val > x)
                System.out.println("trop grand");
        } while (val != x);
        System.out.println("Trouver !");

        scanner.close();
    }
}

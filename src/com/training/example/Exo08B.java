package com.training.example;

import java.util.Arrays;

public class Exo08B {

    public static int[] extraireValeurSupperieur(int[] tableau, int valeur) {
        // extrait dans un tableau les valeurs supérieur à valeur
        int[] newTab = {};
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeur){
                newTab = Arrays.copyOf(tableau, newTab.length + 1);
                newTab[newTab.length - 1] = tableau[i];
            }
        }
        return newTab;
    }

    public static void Go(){
        int[] tableau1 = new int[] {10, 15, 20, 15, 14, 9};
        int valeur = 10;
        int[] tableau2 = extraireValeurSupperieur(tableau1, valeur);
        TabUtils.afficherTableau(tableau2);
    }
}

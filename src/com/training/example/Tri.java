package com.training.example;

public class Tri {

    public static void trierDecroissant(int[] tableau){
        for (int i = 0; i < tableau.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < tableau.length; j++){
                if (tableau[j] < tableau[index]){
                    index = j;
                }
            }
            // swap
            if (i != index){
                int min = tableau[index];
                tableau[index] = tableau[i];
                tableau[i] = min;
            }
        }
    }

    public static void trierCroissant(int[] tableau){
        for (int i = 0; i < tableau.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < tableau.length; j++){
                if (tableau[j] > tableau[index]){
                    index = j;
                }
            }
            // swap
            if (i != index){
                int min = tableau[index];
                tableau[index] = tableau[i];
                tableau[i] = min;
            }
        }
    }

    public static void Go(){
        int[] tableau = {-5, 10 , 2, -512, 400, 8, 7, 1, 3};
        //int[] tableau = {1, 2 , 3, 4, 5};
        TabUtils.afficherTableau(tableau);
        trierDecroissant(tableau);
        TabUtils.afficherTableau(tableau);
        trierCroissant(tableau);
        TabUtils.afficherTableau(tableau);
    }
}

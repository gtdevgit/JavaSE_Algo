package com.training.example;

public class Exo05E {

    private static int[] additionnerTableau(int[] tableau1, int[] tableau2){

        int[] tableauSomme = new int[tableau1.length];

        for (int i = 0; i<tableau1.length; i++){
            tableauSomme[i] = tableau1[i] + tableau2[i];
        }

        return tableauSomme;
    }

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

    public static void Go(){
        int[] tableau1 = new int[] {4, 8, 7, 9, 1, 5, 4, 6};
        int[] tableau2 = new int[] {7, 6, 5, 2, 1, 3, 7, 4};

        //int[] tableau1 = new int[] {4};
        //int[] tableau2 = new int[] {5};

        //int[] tableau1 = new int[] {};
        //int[] tableau2 = new int[] {};

        int[] somme = additionnerTableau(tableau1, tableau2);
        System.out.println(chaineTableau(somme));
    }

}

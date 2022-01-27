package com.training.example;

public class Exo05F {

    private static int[] multiplierTableau(int[] tableau1, int[] tableau2){
        int[] tabResult = new int[tableau1.length * tableau2.length];
        int idx = 0;
        for (int i = 0; i<tableau1.length; i++){
            for (int j = 0; j<tableau2.length; j++)
            {
                tabResult[idx] = tableau1[i] * tableau2[j];
                idx++;
            }
        }
        return tabResult;
    }

    private static int sommeTableau(int[] tableau){
        int somme = 0;
        for (int j : tableau) {
            somme = somme + j;
        }
        return somme;
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
        int[] tableau1 = new int[] {2, 5, 8, 4};
        int[] tableau2 = new int[] {6, 7};

        //int[] tableau1 = new int[] {4};
        //int[] tableau2 = new int[] {5};

        //int[] tableau1 = new int[] {};
        //int[] tableau2 = new int[] {};

        int[] produit = multiplierTableau(tableau1, tableau2);
        System.out.println(chaineTableau(produit));
        int somme = sommeTableau(produit);
        System.out.println(somme);
    }
}

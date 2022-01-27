package com.training.example;

public class Exo07C {

    private static String chaineTableau(int[] tableau){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i<tableau.length ; i++){
            sb.append(tableau[i]);
            if ((tableau.length > 1) && (i < tableau.length -1))
                sb.append(" - ");
        }
        sb.append("]");
        return sb.toString();
    }

    private static void afficherTableau(int[] tableau){
        System.out.println("#####");
        System.out.println("Valeur du tableau : " + chaineTableau(tableau));
        System.out.println("#####");
    }

    public static void Go(){
        int[] tableau = {1, 2, 3, 4, 5, 6};
        afficherTableau(tableau);
    }
}

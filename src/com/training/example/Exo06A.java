package com.training.example;

public class Exo06A {

    public static void Go() {
        // trouver la plus grande valeur
        int[][] tableau = new int[][]{{0, 18}, {1, 45}, {45, 48}, {-3, 2}};

        int max = Integer.MIN_VALUE;
        for (int[] t1 : tableau) {
            for (int t2 : t1){
                if (t2 > max) max = t2;
            }
        }

        System.out.println("Valeur max = " + max);
    }
}

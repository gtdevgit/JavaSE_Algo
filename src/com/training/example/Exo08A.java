package com.training.example;

public class Exo08A {

    private static double calculerTVA(double ht, double tx){
        return ht * (1 + (tx / 100));
    }

    public static void Go(){
        double ttc = calculerTVA(100, 20);
        System.out.println("Prix ttc = " + ttc);
    }
}

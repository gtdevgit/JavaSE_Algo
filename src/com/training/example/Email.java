package com.training.example;

import java.util.Scanner;

public class Email {

    private static String saisirValeur(Scanner scanner){
        System.out.println("Entrez un email: ");
        // pour garder les espaces dans la saisie
        return scanner.nextLine();
    }

    // {'0', '1', '2'}
    private static boolean caractereDansTableau(char valeur, char[] tableau){
        for (char c : tableau){
            if (valeur == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean caractereEstUnChiffre(char caractere){
        // ascii
        // Décimal  Octal  Hex  Binaire   Caractère
        // -------  -----  ---  --------    ------
        // 048      060    30   00110000        0
        // 049      061    31   00110001        1
        // 050      062    32   00110010        2
        // 051      063    33   00110011        3
        // 052      064    34   00110100        4
        // 053      065    35   00110101        5
        // 054      066    36   00110110        6
        // 055      067    37   00110111        7
        // 056      070    38   00111000        8
        // 057      071    39   00111001        9
        int ascii = (int) caractere;
        return (ascii >= 48) && (ascii <= 57);
    }

    private static boolean verifierPremierCaractere(String email){
        char c = email.charAt(0);
        if (caractereEstUnChiffre(c)) {
            System.out.println("Le premier caractere est un chiffre !");
            return false;
        }
        return true;
    }

    private static int compterCaractere(String email, char caractere){
        int count = 0;
        for (int i = 0; i < email.length(); i++){
            char c = email.charAt(i);
            if (c == caractere) count++;
        }
        return count;
    }

    private static boolean verifierQuantiteArobase(String email){
        if (compterCaractere(email, '@') > 1 ) {
            System.out.println("Un seul arobase autorisé !");
            return false;
        }
        return true;
    }

    private static int positionArobase(String email){
        return email.indexOf('@');
    }

    private static boolean verifierPositionArobase(String email){
        if (positionArobase(email) < 3) {
            System.out.println("L'arobase doit être au moins en 3 iéme position !");
            return false;
        }
        return true;
    }

    private static int positionEspace(String email){
        // quid espace insécables #160
        return email.indexOf(' ');
    }

    private static boolean verifierPositionEspace(String email){
        if (positionEspace(email) > -1) {
            System.out.println("Espace interdit !");
            return false;
        }
        return true;
    }

    private static boolean verifierQuantitePoint(String email){
        if (compterCaractere(email, '.') > 1) {
            System.out.println("Un seul espace autorisé !");
            return false;
        }
        return true;
    }

    private static int positionPoint(String email){
        return email.indexOf('.');
    }

    private static boolean verifierPositionPoint(String email){
        if (positionPoint(email) > 3) {
            System.out.println("Le point doit être au moins en 3 iéme position !");
            return false;
        }
        return true;
    }

    private static boolean verifierCaractereApresPoint(String email){
        int pos = positionPoint(email);
        if ((pos > -1) && (email.length() - pos < 2)){
            System.out.println("Au moins 2 caractères après le caractère point!");
            return false;
        }
        return true;
    }

    private static boolean verifierPointApresAroboase(String email){
        if (positionPoint(email) < positionArobase(email)){
            System.out.println("Le caractères point doit se trouver après le caractère arobase!");
            return false;
        }
        return true;
    }

    public static void Go(){
        Scanner scanner = new Scanner(System.in);

        String email = saisirValeur(scanner);

        System.out.println("email : " + email);
        if (verifierPremierCaractere(email) &
            verifierQuantiteArobase(email) &
            verifierPositionArobase(email) &
            verifierPositionEspace(email) &
            verifierQuantitePoint(email) &
            verifierPositionPoint(email) &
            verifierCaractereApresPoint(email) &
            verifierPointApresAroboase(email))
            System.out.println("email correcte");

        scanner.close();
    }
}

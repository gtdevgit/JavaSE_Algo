 package com.training.example;

import java.util.Scanner;

public class Main {

    private static void Exo01b(){
        System.out.println("*** Exo 01B ***");
        int a = 100;
        int b = 200;

        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a + " b = " + b);
    }

    private static void Exo01c(){
        System.out.println("*** Exo 01C ***");
        String A = "321";
        String B = "21";
        String C = A + B;

        System.out.println(C);
    }

    private  static void Exo02a(){
        System.out.println("*** Exo 02A ***");
        System.out.println("Entrez le prix hors taxe de votre objet : ");
        Scanner scanner = new Scanner(System.in);
        double prixHT = scanner.nextDouble();

        double prixTTC = prixHT * 1.196;
        System.out.println("Le prix TTC est de : " + prixTTC);
    }

    private  static void Exo02b(){
        System.out.println("*** Exo 02B ***");
        System.out.println("Entrez votre prénom : ");
        Scanner scanner = new Scanner(System.in);
        String prenom = scanner.next();

        System.out.println("Entrez votre nom : ");
        String nom = scanner.next();

        System.out.println("Bonjour " + prenom  + ", votre nom est : " + nom);
    }

    public static void Exo03a() {
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        if (nombre >= 0) {
            System.out.println("Le nombre est possitif.");
        } else {
            System.out.println("Le nombre est négatif.");
        }
        scanner.close();
    }

    public static void Exo03b() {
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nombre1 = scanner.nextInt();

        System.out.println("Entrez autre nombre : ");
        int nombre2 = scanner.nextInt();

        if ((nombre1 * nombre2) >= 0) {
            System.out.println("Le produit est possitif.");
        } else {
            System.out.println("Le produit est négatif.");
        }
        scanner.close();
    }

    public static void Exo03c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un premier nom : ");
        String nom1 = scanner.next();
        System.out.println("Entrez un deuxiéme nom : ");
        String nom2 = scanner.next();
        System.out.println("Entrez un troisiéme nom : ");
        String nom3 = scanner.next();
        scanner.close();
    }

    public static void Exo03d() {
        System.out.println("Entrez un nombre : ");
        Scanner scanner = new Scanner(System.in);
        int nombre1 = scanner.nextInt();

        System.out.println("Entrez autre nombre : ");
        int nombre2 = scanner.nextInt();

        int p = nombre1 * nombre2;
        if (p == 0) {
            System.out.println("Le produit est null.");
            return;
        }
        if ( p > 0) {
            System.out.println("Le produit est positif.");
            return;
        }
        System.out.println("Le produit est négatif.");
        scanner.close();
    }

    public static void Exo03e() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'age d'un enfant : ");
        int age = scanner.nextInt();

        String categorie;
        switch (age) {
            case 6: case 7:
                categorie = "Poussin";
                break;
            case 8: case 9:
                categorie = "Pupille";
                break;
            case 10: case 11:
                categorie = "Minime";
                break;
            default:
                if (age < 6) {
                    categorie = "Trop petit !";
                } else
                    categorie = "Cadet";
        }
        System.out.println(categorie);
        scanner.close();
    }

    public static void Exo04a() {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do {
            System.out.println("Entrez un nombre entre 0 et 10 : ");
            nombre = scanner.nextInt();
        } while (nombre < 0 || nombre > 10);

        System.out.println("OK");

        scanner.close();
    }

    public static void Exo04b() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nombre = scanner.nextInt();
        for (int i = nombre; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void Exo04c() {
        int chiffreInconnu = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre : ");
        int saisieUtilisateur = scanner.nextInt();

        while (saisieUtilisateur != chiffreInconnu){
            if (saisieUtilisateur < chiffreInconnu) {
                System.out.println("Trop petit.");
            } else {
                System.out.println("Trop grand.");
            }
            System.out.println("Entrez un autre chiffre : ");
            saisieUtilisateur = scanner.nextInt();
        }

        System.out.println("Trouvé !");

        scanner.close();
    }

    public static void Exo04d() {
        System.out.println("Entrez un chiffre : ");
        Scanner scanner = new Scanner(System.in);

        int saisieUtilisateur = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i <= saisieUtilisateur; i++) {
            somme = somme + i;
        }
        System.out.println("Somme de 1 à " + saisieUtilisateur + " = " + somme);

        scanner.close();
    }

    public static void Exo05a() {
        // Calcul la somme des élèments d'un tableau
        int[] tab = new int[] {10, 15, 20, 15, 14, 9};
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }
        System.out.println("Somme du tableau est de " + somme);
    }

    public static void Exo05b() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'éléves : ");
        int nbEleve = scanner.nextInt();

        int[] tab = new int[nbEleve];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la note de l'éléve : " + (i+1) );
            int note = scanner.nextInt();
            tab[i] = note;
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Eleve : " + (i+1) + " note : " + tab[i]);
        }

        scanner.close();
    }

    public static void Exo05c() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre d'éléves : ");
        int nbEleve = scanner.nextInt();

        int[] tab = new int[nbEleve];

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrez la note de l'éléve : " + (i+1) );
            int note = scanner.nextInt();
            tab[i] = note;
        }

        // somme
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            somme = somme + tab[i];
        }

        // moyenne
        double moyenne = somme / nbEleve;
        System.out.println("moyenne = " + moyenne);

        // éleves au dessus de la moyenne
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > moyenne)
                System.out.println("Eleve " + (i+1) + "  au dessus de la moyenne, avec une note de : " + tab[i]);
        }
    }

    public static void Exo05d(){
        Exo05D.Go();
    }

    public static void Exo05e(){
        Exo05E.Go();
    }

    public static void Exo05f(){
        Exo05F.Go();
    }

    public static void Exo05g(){
        Exo05G.Go();
    }

    public static void Exo05h(){
        Exo05H.Go();
    }

    public static void Exo05j(){
        Exo05J.Go();
    }

    public static void Exo06A(){
        Exo06A.Go();
    }

    public static void Exo06B(){
        Exo06B.Go();
    }

    public static void Exo07A(){
        Exo07A.Go();
    }

    public static void Exo07B(){
        Exo07B.Go();
    }

    public static void Exo07C(){
        Exo07C.Go();
    }

    public static void Exo08A(){
        Exo08A.Go();
    }

    public static void Exo08B(){
        Exo08B.Go();
    }

    public static void Tri(){
        Tri.Go();
    }

    public static void TrianglePascal(){
        TrianglePascal.Go();
    }

    public static void Email(){
        Email.Go();
    }

    public static void main(String[] args) {
        // Exo01b();
        // Exo01c();
        // Exo02a();
        // Exo02b();
        // Exo03a();
        // Exo03c();
        // Exo03d();
        // Exo03e();
        // Exo04a();
        // Exo04b();
        // Exo04c();
        // Exo04d();
        // Exo05a();
        // Exo05b();
        // Exo05c();
        // Exo05d();
        // Exo05e();
        // Exo05f();
        // Exo05g();
        // Exo05h();
        // Exo05j();
        // Exo06A();
        // Exo06B();
        // Exo07A();
        // Exo07B();
        // Exo07C();
        // Exo08A();
        // Exo08B();
        //Tri();
        //TrianglePascal();
        Email();
    }
}

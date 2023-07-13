package exo1_2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre 1");
        int n1 = sc.nextInt();
        System.out.println("Entrez le nombre 2");
        int n2 = sc.nextInt();

        Somme B = new Somme(n1, n2);
        System.out.println("Le resultat est : " + B.sum());

    }
}
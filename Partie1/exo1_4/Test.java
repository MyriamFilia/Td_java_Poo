package exo1_4;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Premier nombre");
        System.out.print("Entrer la partie réelle : ");
        int partieReel1 = sc.nextInt();
        System.out.print("Entrer la partie imaginaire : ");
        int partieIm1 = sc.nextInt();
        System.out.println("Deuxieme nombre");
        System.out.print("Entrer la partie réelle : ");
        int partieReel2 = sc.nextInt();
        System.out.print("Entrer la partie imaginaire : ");
        int partieIm2 = sc.nextInt();

        Complex A = new Complex(partieReel1, partieIm1);
        Complex B = new Complex(partieReel2, partieIm2);

        String resultat = Complex.sommeComplex(A, B);

        System.out.println(resultat);

    }

}

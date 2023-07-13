package exo1_3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);
        System.out.println("Entrez le nom de l'étudiant");
        String nom = sb.nextLine();
        System.out.println("Entrez la note 1");
        int note1 = sb.nextInt();
        System.out.println("Entrez la note 2");
        int note2 = sb.nextInt();

        Student C = new Student(nom, note1, note2);
        C.show();

    }

}

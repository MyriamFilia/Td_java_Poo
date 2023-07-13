package exo2_2;

public class Test {

    public static void main(String[] args) {

        Apartment test = new Apartment();
        test.porte.color = "bleu";
        Person p = new Person();
        p.nom = "Thomas";
        p.maison = test;
        p.display();

    }

}

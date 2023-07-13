package exo2_2;

public class Person {

    protected String nom;
    protected House maison;

    public Person() {

    }

    public Person(String nom, House maison) {
        this.nom = nom;
        this.maison = maison;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public House getHouse() {
        return maison;
    }

    public void setHouse(House maison) {
        this.maison = maison;
    }

    public void display() {
        System.out.println("Je m'appelle " + nom);
        maison.display();
        maison.porte.display();
    }

}

package exo1_3;

public class Student {
    String nom;
    int note1;
    int note2;

    public Student(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }

    public double calc_moy() {
        return (note1 + note2) / 2;
    }

    public void show() {
        System.out.println(this.nom + " : " + calc_moy());
    }
}

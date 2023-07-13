package exo1_4;

public class Complex {

    int partieReel;
    int partieIm;

    public Complex(int partieReel, int partieIm) {
        this.partieReel = partieReel;
        this.partieIm = partieIm;
    }

    public static String sommeComplex(Complex a, Complex b) {
        int sommePr = a.partieReel + b.partieReel;
        int sommeIm = a.partieIm + b.partieIm;
        return "La somme est : " + sommePr + " + " + sommeIm + "i";
    }

}

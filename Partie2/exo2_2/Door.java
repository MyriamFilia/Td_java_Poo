package exo2_2;

public class Door {
    protected String color;

    public Door() {
    }

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Je suis une porte, ma couleur est " + color);
    }
}

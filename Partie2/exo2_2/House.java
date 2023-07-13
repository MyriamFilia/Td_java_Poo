package exo2_2;

public class House {

    protected int surface;
    protected Door porte;

    public House(int surface) {
        this.surface = surface;
        this.porte = new Door();
    }

    public int getSurface() {
        return surface;
    }

    public Door getDoor() {
        return porte;
    }

    public void setDoor(Door porte) {
        this.porte = porte;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m²");
    }

}

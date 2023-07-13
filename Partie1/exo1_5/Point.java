package exo1_5;

import java.lang.Math;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point p) {
        double px = this.getX() - p.getX();
        double py = this.getY() - p.getY();

        return Math.sqrt(px * px + py * py);
    }

}

package tack1;

public abstract class Figure {
    protected int EdgeA;
    protected int EdgeB;
    protected int EdgeC;

    protected int radius;

    public Figure(int EdgeA, int EdgeB, int EdgeC, int radius) {
        this.EdgeA = EdgeA;
        this.EdgeB = EdgeB;
        this.EdgeC = EdgeC;
        this.radius = radius;
    }

    public Figure(int EdgeA, int EdgeB, int EdgeC) {
        this(EdgeA, EdgeB, EdgeC, 0);
    }

    public Figure(int EdgeA, int EdgeB ) {
        this(EdgeA, EdgeB, 0);
    }

    public Figure(int radius) {
        this(0, 0, 0, radius);
    }

    public double getPerimetr() {
        return 0;
    }

    public double getSquare() {
        return 0;
    }

}
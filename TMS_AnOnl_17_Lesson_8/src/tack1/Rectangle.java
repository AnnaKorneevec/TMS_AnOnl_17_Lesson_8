package tack1;

public final class Rectangle extends Figure {
    private final int EdgeA;
    private final int EdgeB;

    public Rectangle(int EdgeA, int EdgeB) {
        this.EdgeA = EdgeA;
        this.EdgeB = EdgeB;
    }
    @Override
    public double getPerimetr() {
        return (this.EdgeA * 2) + (this.EdgeB * 2);
    }
    @Override
    public double getSquare() {
        return this.EdgeA + this.EdgeB;
    }
}

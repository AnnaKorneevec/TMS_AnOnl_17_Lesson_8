package tack1;

public final class Triangle extends Figure {
    private final int EdgeA;
    private final int EdgeB;
    private final int EdgeC;

    public Triangle(int EdgeA, int EdgeB, int EdgeC) {
        this.EdgeA = EdgeA;
        this.EdgeB = EdgeB;
        this.EdgeC = EdgeC;
    }
    @Override
    public double getPerimetr() {
        return this.EdgeA + this.EdgeB + this.EdgeC;
    }
    public double getSquare() {
        int demiRadius = (this.EdgeA + this.EdgeB + this.EdgeC) / 2;
        double result = Math.sqrt(demiRadius * (demiRadius - this.EdgeA) * (demiRadius - this.EdgeB) * (demiRadius - this.EdgeC));
return result;
    }
}

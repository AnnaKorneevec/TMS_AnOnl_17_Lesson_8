package tack1;

    public final class Circle extends Figure {
        private final int radius;

        public Circle (int radius) {
            this.radius = radius;
        }

        @Override
        public double getPerimetr() {
            return (2 * Math.PI * this.radius);
        }
        @Override
        public double getSquare() {
            return Math.PI * this.radius * this.radius;

    }
}

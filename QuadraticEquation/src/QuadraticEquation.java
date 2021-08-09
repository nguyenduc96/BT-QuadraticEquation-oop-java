public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return ((-this.b) - Math.sqrt(this.getDelta())) / (2 * this.a);
    }

    public double getRoot2() {
        return ((-this.b) + Math.sqrt(this.getDelta())) / (2 * this.a);
    }
}

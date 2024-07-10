package Exercise.Exercise_10_QuadraticEquation;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    double delta = 0;
    double x1 = 0;
    double x2 = 0;
    double x3 = 0;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double  getDiscriminant() {
        return delta = (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return x1 = (-b + Math.pow(delta,0.5)) / (2 * a);
    }

    public double getRoot2() {
        return x2 = (-b - Math.pow(delta,0.5)) / (2 * a);
    }

    public double getRoot3() {
        return x3 = -b / (2 * a);
    }
}

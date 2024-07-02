public class Geometry {
    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double base , double height) {
        return base * height;
    }

    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    public static double circleArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public static double cubeArea(double a) {
        return 6 * (a * a);
    }

    public static double parallelepipedArea(double a, double b, double c) {
        return ((2 * a * b) + (2 * a * c) + (2 * b * c));
    }

    public static double trapezoidArea(double B, double b, double h) {
        return ((B + b) * h) / 2;
    }

    public static double sphereArea(double r) {
        return (4 * Math.PI * (r * r));
    }

}

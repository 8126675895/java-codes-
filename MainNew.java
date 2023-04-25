import java.util.Scanner;
class Shape {
    double dim1, dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public void printArea() {
        System.out.println("Area is undefined for this shape.");
    }
}

class Rectangle extends Shape {
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of the rectangle is: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of the triangle is: " + area);
    }
}

public class MainNew {
    public static void main(String[] args) {
        Shape s1 = new Shape(10, 20);
        s1.printArea();

        Rectangle r1 = new Rectangle(5, 8);
        r1.printArea();

        Triangle t1 = new Triangle(6, 12);
        t1.printArea();
    }
}
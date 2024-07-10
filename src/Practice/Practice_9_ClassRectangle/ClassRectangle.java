package Practice.Practice_9_ClassRectangle;

import java.util.Scanner;

public class ClassRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width, height;
        System.out.print("Nhập width: ");
        width = scanner.nextDouble();
        System.out.print("Nhập height: ");
        height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Rectangle: " + rectangle.display());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter : " + rectangle.getPerimeter());
    }
}


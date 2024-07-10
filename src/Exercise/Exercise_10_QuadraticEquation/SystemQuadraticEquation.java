package Exercise.Exercise_10_QuadraticEquation;

import java.util.Scanner;

public class SystemQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        
        if (delta > 0){
            System.out.println("x1 = " + quadraticEquation.getRoot1() + " , x2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot3());
        }else {
            System.out.println("The aquation has no roots");
        }
    }
}

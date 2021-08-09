import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giải phương trình bậc 2 A*x^2 + B*x + C = 0");
        System.out.print("Nhập A : ");
        double a = scanner.nextDouble();
        System.out.print("Nhập B : ");
        double b = scanner.nextDouble();
        System.out.print("Nhập C : ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDelta() > 0) {
            System.out.printf("Phương trình có 2 nghiệm \n x1 = %2.2f \n x2 = %2.2f", equation.getRoot1(), equation.getRoot2());
        } else if (equation.getDelta() == 0) {
            System.out.printf("Phương trình có nghiệm \n x1 = x2 = %2.2f ", equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

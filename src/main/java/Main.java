import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        try {
            CheckTriangle.checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("a,b,c khong phai la canh cua 1 tam giac");
            System.out.println("Nhap lai gia tri a b c");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
        }
        System.out.println("Chu vi tam giac la: " +(a+b+c));
    }

}

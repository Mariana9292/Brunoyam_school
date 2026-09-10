import java.util.Scanner;
public class Module3Hard2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи 6 координат вершин треугольника (x1 y1 x2 y2 x3 y3): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double ab = Math.hypot(x2 - x1, y2 - y1);
        double bc = Math.hypot(x3 - x2, y3 - y2);
        double ac = Math.hypot(x3 - x1, y3 - y1);
        double p = (ab + bc + ac) / 2;
        double area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        System.out.printf("Площадь треугольника: %.2f%n", area);

    }
}

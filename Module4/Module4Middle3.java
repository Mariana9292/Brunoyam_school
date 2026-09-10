import java. util.Scanner;
public class Module4Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        int a = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int b = scanner.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("верно");
        } else {
            System.out.println("не верно");

        }
    }
}

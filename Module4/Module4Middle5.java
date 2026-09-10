import java. util.Scanner;
public class Module4Middle5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр 1: ");
        int a = scanner.nextInt();
        System.out.println("Введите параметр 2: ");
        int b = scanner.nextInt();
        System.out.println("Введите параметр 3: ");
        int c = scanner.nextInt();
        int discriminant = b * b - 4 * a * c;


        if (discriminant >= 0) {
            System.out.println("Уравнение имеет действительные корни");
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }

    }
}

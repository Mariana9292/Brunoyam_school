import java.util.Scanner;
public class Module2Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три значения переменных a, b и c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Сумма чисел: " + (a+b+c));
        System.out.println("Произведение чисел: " + (a*b*c));
    }
}

import java.util.Scanner;
public class Module5Middle4 {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Введите число от 1: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Не работает для отрицательных чисел.");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + n + " равен: " + factorial);

    }
}

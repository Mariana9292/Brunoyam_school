import java.util.Scanner;
public class Module3Easy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение переменных a и b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Пользователь ввел значение для a: " + a + " и b: " + b);

    }
}

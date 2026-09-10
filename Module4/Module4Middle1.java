import java.util.Scanner;
public class Module4Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("mid: " + mid);


    }
}

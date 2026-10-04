import java.util.Scanner;
public class Module5Hard1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;


        for (int i = 0; i < n; i++) {
            if (i == 0)
            {
                System.out.print(a);
            } else if (i == 1) {
                System.out.print(" " + b);
            } else {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;

            }
        }
    }
}

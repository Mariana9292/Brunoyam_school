import java.util.Scanner;
public class Module4Easy1 {
    public static void main(String[] args) {
        //если x = 6, а затем x = -2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        double y;

        if (x > 0) {
            y = 2 * x;
        } else {
            y = -2 * x;
        }
        System.out.println("y = " +y);

    }
}

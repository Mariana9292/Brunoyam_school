import java.util.Scanner;
public class Module3Middle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a");
        double a = scanner.nextDouble();
        System.out.println("Введите значение b");
        double b = scanner.nextDouble();
        System.out.println("Введите значение c");
        double c = scanner.nextDouble();
        double discriminant = (b * b) - (4 * a * c);
        System.out.println ("Дискриминант: " + discriminant);

    }
}

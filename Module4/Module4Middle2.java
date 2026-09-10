import java.util.Scanner;
public class Module4Middle2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int c = a % b;

        if (c < 1) {
            System.out.println("кратно");
        } else {
            System.out.println("не кратно");
            System.out.println("Остаток: " + c);


        }
    }
}
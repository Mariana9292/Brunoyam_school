import java.util.Scanner;
public class Module6Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действие: +, -, *, /");
        String action = scanner.next();

        System.out.println("Введите первый аргумент: ");
        int a = scanner.nextInt();

        System.out.println("Введите второй аргумент: ");
        int b = scanner.nextInt();
        switch (action) {


            case "+":
                System.out.println("Результат: " + (a + b));
                break;

            case "-":
                System.out.println("Результат: " + (a - b));
                break;

            case "*":

                System.out.println("Результат: " + (a * b));
                break;

            case "/":


                if (b != 0) {

                    System.out.println("Результат: " + (a / b));

                } else {

                    System.out.println("На ноль делить нельзя!");
                }
        }
    }
}

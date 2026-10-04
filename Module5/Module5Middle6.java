import java.util.Random;
import java.util.Scanner;

public class Module5Middle6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            int correctAnswer = a * b;

            System.out.println("Решите пример " + a + "*" + b);

            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Ответ верный");
                } else {
                    System.out.println("Ответ неверный. " + a + "*" + b + "=" + correctAnswer);
                }
            } else {
                System.out.println("Ошибка ввода. Ожидается число.");
                scanner.next();
                }
            }

        }
    }


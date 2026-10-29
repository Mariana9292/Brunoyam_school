import java.util.Scanner;
import java.util.Random;

public class Module6Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int sticks = 20;
        boolean playerTurn = true;

        printSticks(sticks);

        while (sticks > 1) {
            if (playerTurn) {
                System.out.print("Сколько палочек берёте (1–3)? ");
                int take = scanner.nextInt();
                sticks -= take;
                System.out.println("Вы взяли " + take + " палочку(ки).");
            } else {
                int take = random.nextInt(3) + 1;
                if (take > sticks - 1) {
                    take = sticks - 1;
                }
                sticks -= take;
                System.out.println("Компьютер взял " + take + " палочку(ки).");
            }

            printSticks(sticks);

            if (sticks == 1) {
                if (playerTurn) {
                    System.out.println("Поздравляем! Вы победили!");
                } else {
                    System.out.println("Компьютер победил!");
                }
                break;
            }

            playerTurn = !playerTurn;
        }

        scanner.close();
    }

    private static void printSticks(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("| ");
        }
        System.out.println();
        System.out.println("Осталось палочек: " + count);
        System.out.println("-------------------------");
    }
}

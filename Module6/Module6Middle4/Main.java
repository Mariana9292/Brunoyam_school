import java.util.Random;
import  java.util.Scanner;
public class Main {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Player player1 = new Player("Первый игрок");
        Player player2 = new Player("Второй игрок");

        int secretNumber = random.nextInt(100) + 1;
        int sum = 0;

        Player currentPlayer = player1;
        System.out.println("Игра <<Камешки>>");
        System.out.println("Компьютер загадал число от 1 до 100.");

        while (sum <= secretNumber) {
            int number = currentPlayer.makeMove(scanner);
            sum += number;

            System.out.println("Текущая сумма: " + sum);

            if (sum > secretNumber) {
                System.out.println(currentPlayer.name + "проиграл!");
                Player winner;

                if (currentPlayer == player1) {
                    winner = player2;
                } else {
                    winner = player1;
                }
                winner.win();

                System.out.println("Победитель: " + winner.name);

                System.out.println("Загаданное число: " + secretNumber);

                System.out.println("Счёт побед:");

                System.out.println(player1.name + ": " + player1.wins);

                System.out.println(player2.name + ": " + player2.wins);

                break;

            }

            if (currentPlayer == player1) {

                currentPlayer = player2;

            } else  {
                currentPlayer = player1;

                 }
            }
        scanner.close();

        }
    }


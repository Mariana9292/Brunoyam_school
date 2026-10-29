import java.util.Random;
import java.util.Scanner;

public class Game {
    private char[][] board = new char[3][3];
    private Player player;
    private Player computer;
    private Random random;

    public Game(Player player, Player computer) {
        this.player = player;
        this.computer = computer;
        random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void drawBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    System.out.print(" " + (i * 3 + j + 1) + " ");
                } else {
                    System.out.print(" " + board[i][j] + " ");
                }
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            drawBoard();
            System.out.print(player.getName() + ", введите номер клетки (1–9): ");

            if (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Пожалуйста, введите число от 1 до 9.");
                continue;
            }

            int cell = scanner.nextInt();

            if (cell < 1 || cell > 9) {
                System.out.println("Номер клетки должен быть от 1 до 9.");
                continue;
            }

            int r = (cell - 1) / 3;
            int c = (cell - 1) % 3;

            if (board[r][c] != ' ') {
                System.out.println("Эта клетка уже занята. Выберите другую.");
                continue;
            }

            board[r][c] = player.getSymbol();

            if (win(player.getSymbol())) {
                drawBoard();
                System.out.println(player.getName() + " победил!");
                break;
            }

            if (full()) {
                drawBoard();
                System.out.println("Ничья!");
                break;
            }


            int cr, cc;
            do {
                cr = random.nextInt(3);
                cc = random.nextInt(3);
            } while (board[cr][cc] != ' ');

            board[cr][cc] = computer.getSymbol();

            if (win(computer.getSymbol())) {
                drawBoard();
                System.out.println("Компьютер победил!");
                break;
            }

            if (full()) {
                drawBoard();
                System.out.println("Ничья!");
                break;
            }
        }

        scanner.close();
    }

    private boolean win(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[1][1] == symbol) {
            if ((board[0][0] == symbol && board[2][2] == symbol) ||
                    (board[0][2] == symbol && board[2][0] == symbol)) return true;
        }
        return false;
    }

    private boolean full() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') return false;
            }
        }
        return true;
    }
}





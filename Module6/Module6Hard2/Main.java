import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int[] SHIPS = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

    private static final char[] LETTERS = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'К'};

    private static final
    Scanner scanner = new Scanner(System.in);
    private static final
    Random random = new Random();

    public static void main(String[] args) {

        Field player = new Field();
        Field computer = new Field();

        System.out.println(" - МОРСКОЙ БОЙ - ");


        placePlayerShips(player);


        computer.placeRandomShips();

        System.out.println("\nКомпьютер расставил корабли!");
        System.out.println("Игра начинается!");

        boolean playerTurn = true;

        while (player.countShips() > 0
                && computer.countShips() > 0) {

            if (playerTurn) {

                System.out.println("\n--- ТВОЙ ХОД ---");
                System.out.println("Твоё поле:");
                player.print(true);

                System.out.println("\nПоле компьютера:");
                computer.print(false);

                boolean hit = playerShoot(computer);

                if (computer.countShips() == 0) {
                    break;
                }

                if (hit) {
                    System.out.println("Попадание! Стреляй ещё.");
                } else {
                    System.out.println("Промах! Ход компьютера.");
                    playerTurn = false;
                }

            } else {

                System.out.println("\n--- ХОД КОМПЬЮТЕРА ---");

                boolean hit = computerShoot(player);

                if (player.countShips() == 0) {
                    break;
                }

                if (hit) {
                    System.out.println("Компьютер попал! Он стреляет ещё.");
                } else {
                    System.out.println("Компьютер промахнулся! Твой ход.");
                    playerTurn = true;
                }
            }
        }

        System.out.println("\n=== ИГРА ОКОНЧЕНА ===");

        if (computer.countShips() == 0) {
            System.out.println("Поздравляем! Ты победил!");
        } else {
            System.out.println("Компьютер победил!");
        }

        System.out.println("\nТвоё поле:");
        player.print(true);

        System.out.println("\nПоле компьютера:");
        computer.print(true);

        scanner.close();
    }


    private static void placePlayerShips(Field field) {

        System.out.println("\nРасставь свои корабли.");
        System.out.println("Пример координаты: А1, Б5, К10.");
        System.out.println("Г — горизонтально, В — вертикально.");

        for (int ship : SHIPS) {

            while (true) {

                System.out.println("\nТвоё поле:");
                field.print(true);

                System.out.println("\nДлина корабля: " + ship);
                System.out.print("Начальная координата: ");

                String input = scanner.next().toUpperCase();
                int[] pos = parseCoordinate(input);

                if (pos == null) {
                    System.out.println("Неверная координата!");
                    continue;
                }

                boolean horizontal = true;

                if (ship > 1) {

                    System.out.print("Направление (Г/В): ");
                    String direction = scanner.next().toUpperCase();

                    if (!direction.equals("Г") && !direction.equals("В")) {
                        System.out.println("Введи Г или В!");
                        continue;
                    }

                    horizontal = direction.equals("Г");
                }

                if (field.canPlaceShip(
                        pos[0], pos[1], ship, horizontal)) {

                    field.placeShip(
                            pos[0], pos[1], ship, horizontal);

                    break;

                } else {
                    System.out.println( "Нельзя разместить корабль здесь. " + "Попробуй снова.");
                }
            }
        }

        System.out.println("\nВсе корабли расставлены!");
    }

    private static boolean playerShoot(Field field) {

        while (true) {

            System.out.print("Куда стреляем? ");
            String input = scanner.next().toUpperCase();
            int[] pos = parseCoordinate(input);

            if (pos == null) {
                System.out.println("Неверная координата!");
                continue;
            }

            int row = pos[0];
            int col = pos[1];

            if (field.wasShot(row, col)) {
                System.out.println("Ты уже стрелял сюда!");
                continue;
            }

            boolean hit = field.shoot(row, col);

            if (hit) {System.out.println("Попал!");
            } else {
                System.out.println("Мимо!");
            }

            return hit;
        }
    }


    private static boolean computerShoot(Field field) {

        int row;
        int col;

        do {
            row = random.nextInt(field.getSize());
            col = random.nextInt(field.getSize());
        } while (field.wasShot(row, col));

        System.out.println("Компьютер стреляет: " + LETTERS[col] + (row + 1));

        boolean hit = field.shoot(row, col);

        if (hit) {
            System.out.println("Компьютер попал!");
        } else {
            System.out.println("Компьютер промахнулся!");
        }

        return hit;
    }


    private static int[] parseCoordinate(String input) {

        input = input.replaceAll("\\s+", "");

        if (input.length() < 2) {
            return null;
        }

        char letter = input.charAt(0);
        int col = -1;

        for (int i = 0; i < LETTERS.length; i++) {
            if (LETTERS[i] == letter) {
                col = i;
                break;
            }
        }

        if (col == -1) {
            return null;
        }

        int row;

        try {
            row = Integer.parseInt(input.substring(1)) - 1;
        } catch (NumberFormatException e) {
            return null;
        }

        if (row < 0 || row >= 10) {
            return null;
        }

        return new int[]{row, col};
    }
}

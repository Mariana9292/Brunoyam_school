import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) name = "Игрок";

        Player player = new Player(name, 'X');
        Player computer = new Player("Компьютер", 'O');

        Game game = new Game(player, computer);
        game.play();

        scanner.close();
    }
}
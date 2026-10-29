import java.util.Scanner;

public class Player {
    String name;
    int wins;

    public  Player(String name) {
        this.name = name;
        this.wins = 0;
    }
    public int makeMove(Scanner scanner) {
        System.out.print(name + ", введите число от 1 до 100: ");
        return scanner.nextInt();
    }
    public void win() {
        wins++;
    }
}

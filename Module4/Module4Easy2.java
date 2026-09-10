import java.util.Scanner;
public class Module4Easy2 {
    public static void main(String[] args) {
        //Вывести на консоль: Зима, если введено 1, Весна — 2, Лето — 3, Осень — 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение (1-4): ");
        int season = scanner.nextInt();

        switch (season) {
            case 1:
            System.out.println("Зима");
            break;
            case 2:
            System.out.println("Весна");
                break;
            case 3:
            System.out.println("Лето");
                break;
            case 4:
            System.out.println("Осень");
                break;
            default:
            System.out.print("Некорректное значение. Введите число от 1 до 4. ");
        }

    }
}


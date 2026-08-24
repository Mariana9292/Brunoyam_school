import java.util.Scanner;
public class Module3Middle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество отработанных дней в месяц");
        int days = scanner.nextInt();
        System.out.println("Введите зарплату за день");
        double dailySalary = scanner.nextDouble();
        double totalSalary = days * dailySalary;
        System.out.println("Зарплата рабочего за месяц: " + totalSalary);
    }
}

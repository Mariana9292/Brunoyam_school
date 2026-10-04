import java.util.Scanner;
public class Module5Middle3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число (от 1 до 100): ");
        int n = scanner.nextInt();
        //ограничение n от 1 до 100
        if (n < 1 || n > 100) {
            System.out.println("Ошибка: число должно быть от 1 до 100: ");
            return;
        }




        boolean hasDivisor = false;

        int i = 0;
        int[] divisors = new int[n];
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                divisors[i] = j;
                i++;
                hasDivisor = true;

            }
        }
        if (!hasDivisor) {
            System.out.println("нет");
        }

            System.out.println("Делители числа " + n + " (кроме 1 и самого числа): ");
            for (int k = 0; k < i; k++) {
                if (divisors[k] == 25) {
                    System.out.println(25);
                    break;
                }

                {
                    System.out.println(divisors[k] + " ");


                }

            }
        }
    }



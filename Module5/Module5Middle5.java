import java.util.Scanner;
public class Module5Middle5 {
    public static void  main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива от 1 до 10:");
        //int N = scanner.nextInt();

        //ограничение от 1 до 10
        int n;
        do {
            n = scanner.nextInt();
            if ( n < 1 || n > 10) {
                System.out.println("Ошибка: количество элементов должно быть от 1 до 10: ");
            }
        } while (n < 1 || n > 10);


        System.out.println("Введите элементы массива: ");
        int [] [] arr = new int [n] [n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        System.out.println("Сумма элементов главной диагонали: "+sum);


    }

}

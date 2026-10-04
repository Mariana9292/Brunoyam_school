import java.util.Scanner;

public class Module5Hard2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите длину массива: ");
            n = scanner.nextInt();
            if (n >1000) {
                System.out.println("Число элементов массива должно быть не больше 1000. Введите корректное значение:");
            }
        }
        while (n > 1000);

        int[] count = new int[n];
        System.out.print("Введите эллементы массива: ");

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x < 0 || x > 1000) {
                System.out.println("Число " + x + " вне диапазона от 1 до 1000, исключаем это значение.");
                n = n-1;
                i = i-1;
            }
            else {
                count[i] = x;
                System.out.println("Введён элемент массива count["+i+"] = " + count[i] + " ");
            }
        }
        System.out.println("Введены значения: n = " + n);
        System.out.print("Элементы массива: ");
        for (int i=0; i<n; i++) {
            System.out.print( count[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (count[i] == count[j]) {
                    System.out.println("Внимание! "+count[i]+"="+count[j]+" Значения count[" + i +"] и conunt ["+ j +"] совпадают. Удаляем повтор.");
                    for (int k = j; k < n - 1; k++) {
                        count[k] = count[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("•••РЕЗУЛЬТАТ•••");
        System.out.println("Количество элементов массива после удаления повторов: n = " + n);
        System.out.print("Элементы массива после удаления повторов: ");
        for (int i=0; i<n; i++) {
            System.out.print( count[i] + " ");
        }
    }
}

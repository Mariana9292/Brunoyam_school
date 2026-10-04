import java.util.Scanner;
public class Module5Middle2 {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива (от 1 до 100):");
        Scanner scanner = new Scanner(System.in);

        //ограничение n от 1 до 100
        int n;
        do {
            n = scanner.nextInt();
            if (n < 1 || n > 100) {
            System.out.println("Ошибка: количество элементов должно быть от 1 до 100: ");
            }
        } while (n < 1 || n > 100);

        System.out.println("n равно: "+n);

        double[] values = new double[n];
        System.out.println("Введите элементы массива");

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextDouble();
            //System.out.println("i равно: "+i);
            //System.out.println("Значение values["+i+"] равно: "+values[i]);
        }

        double maxElem = 0; //double maxElem = values[0];
        for (int i = 0; i < n; i++) {
            if (Math.abs(values[i]) > Math.abs(maxElem)) {
                maxElem = values[i];
            }
        }
        System.out.println("Максимальный по модулю элемент массива:");
        System.out.println(maxElem);
    }
}

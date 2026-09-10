import java.util.Scanner;
public class Module4Hard2 {
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введите позицию слона: ");
            char col1 = scanner.next().charAt(0);
            int row1 = scanner.nextInt();
            System.out.println("Введите позицию пешки: ");
            char col2 = scanner.next().charAt(0);
            int row2 = scanner.nextInt();

            int diffCol = Math.abs(col1 - col2);
            int diffRow = Math.abs(row1 - row2);

            if (diffCol == diffRow) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }


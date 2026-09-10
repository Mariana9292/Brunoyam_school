import java. util.Scanner;
public class Module4Hard1 {
    public static void main(String[] args) {
        //...вычисляет площадь одной из трёх геометрических фигур: прямоугольника, треугольника или круга.
        // Заметка: не забыть использовать библиотеку (Math.PI) для круга!
        // Формулы: Прямоугольник S=a*b; Треугольник S=1/2*a*h; Круг S=пи*r^2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одну из трёх фигур: ");
        System.out.println("1 - прямоугольник");
        System.out.println("2 - треугольник");
        System.out.println("3 - круг");
        System.out.print("Введите номер фигуры (1-3): ");
        int figures = scanner.nextInt();

        switch (figures) {
            case 1:
                System.out.println("Длина: ");
                double length = scanner.nextDouble();
                System.out.println("Ширина: ");
                double width = scanner.nextDouble();
                System.out.println("Площадь прямоугольника: " + (length * width));
                break;

            case 2:
                System.out.println("Основание: ");
                double base = scanner.nextDouble();
                System.out.println("Высота: ");
                double height = scanner.nextDouble();
                System.out.println("Площадь треугольника: "+ (0.5 * base * height));
                break;


            case 3:
                System.out.println("Радиус: ");
                double radius = scanner.nextDouble();
                System.out.println("Площадь круга: " + (Math.PI * radius * radius));
                break;



        }
    }
}

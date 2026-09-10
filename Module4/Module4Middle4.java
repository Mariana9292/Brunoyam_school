import java.util.Scanner;
public class Module4Middle4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите продукт (яйца / молоко / кофе): ");
        String ingredient = scanner.next().toLowerCase();
        switch (ingredient) {
            case "яйца":
                System.out.println("Можно приготовить яичницу");
                break;
            case "молоко":
                System.out.println("Из одного молока не приготовить блюдо по рецепту");
                break;
                case "кофе":
                    System.out.println("Для кофе нужно молоко");
                    break;
            default:
                System.out.println("Неизвестный продукт");


            }

        }
    }


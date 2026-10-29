import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardDesk desk = new CardDesk();

        ArrayList<Card> playerCards = new ArrayList<>();
        ArrayList<Card> dealerCards = new ArrayList<>();

        playerCards.add(desk.takeCard());
        playerCards.add(desk.takeCard());

        dealerCards.add(desk.takeCard());
        dealerCards.add(desk.takeCard());

        System.out.println("Добро пожаловать в BlackJack!");
        System.out.println();

        printCards("Ваши карты:", playerCards);

        int playerPoints = getPoints(playerCards);
        System.out.println("Ваши очки: " + playerPoints);
        System.out.println();

        System.out.println("Первая карта дилера: " + dealerCards.get(0).getName());


        while (playerPoints < 21) {
            System.out.println();
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 - Взять ещё карту");
            System.out.println("2 - Остановиться");
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                Card card = desk.takeCard();
                playerCards.add(card);

                System.out.println("Вам выпала карта: " + card.getName());
                playerPoints = getPoints(playerCards);
                System.out.println("Ваши очки: " + playerPoints);

                if (playerPoints > 21) {
                    System.out.println("Перебор! Вы проиграли.");
                }
            } else if (command.equals("2")) {
                System.out.println("Вы решили остановиться.");
                break;
            } else {
                System.out.println("Введите 1 или 2.");
            }
        }


        if (playerPoints <= 21) {
            System.out.println();
            System.out.println("Теперь ход дилера.");

            while (getPoints(dealerCards) < 17) {
                Card card = desk.takeCard();
                dealerCards.add(card);
                System.out.println("Дилер взял карту: " + card.getName());
            }
        }

        int dealerPoints = getPoints(dealerCards);

        System.out.println();
        printCards("Ваши карты:", playerCards);
        System.out.println("Ваши очки: " + playerPoints);

        printCards("Карты дилера:", dealerCards);
        System.out.println("Очки дилера: " + dealerPoints);
        System.out.println();

        if (playerPoints > 21) {
            System.out.println("Вы проиграли! У вас больше 21 очка.");
        } else if (dealerPoints > 21) {
            System.out.println("Вы выиграли! У дилера перебор.");
        } else if (playerPoints > dealerPoints) {
            System.out.println("Вы выиграли!");
        } else if (playerPoints < dealerPoints) {
            System.out.println("Вы проиграли!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }

    public static int getPoints(ArrayList<Card> cards) {
        int sum = 0;
        int aces = 0;

        for (Card card : cards) {
            sum += card.getPoints();

            if (card.getPoints() == 11) {
                aces++;
            }
        }

        while (sum > 21 && aces > 0) {
            sum -= 10;
            aces--;
        }

        return sum;
    }

    public static void printCards(String title, ArrayList<Card> cards) {
        System.out.println(title);

        for (Card card : cards) {
            System.out.println(card.getName()
                    + " - " + card.getPoints() + " очков");
        }
    }
}
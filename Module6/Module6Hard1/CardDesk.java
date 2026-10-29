import java.util.Random;

public class CardDesk {
    private Card[] cards = new Card[36];
    private int nextCard = 0;

    public CardDesk() {
        String[] names = {"Шестёрка", "Семёрка", "Восьмёрка", "Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"};
        int[] points = {6, 7, 8, 9, 10, 10, 10, 10, 11};

        String[] suits = {"Черви", "Бубны", "Крести", "Пики"};
        int index = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < names.length; j++) {
                cards[index] = new Card(names[j] + " " + suits[i], points[j]);
                index++;
            }
        }

        Random random = new Random();

        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card takeCard() {
        if (nextCard >= cards.length) {
            throw new IllegalStateException("Колода закончилась!");
        }

        return cards[nextCard++];
    }
}
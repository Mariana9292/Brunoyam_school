import java.util.Random;

public class Field {

    private static final int SIZE = 10;


    private final int[][] field = new int[SIZE][SIZE];

    private final Random random = new Random();

    private static final char[] LETTERS = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ж', 'З', 'И', 'К'};


    public int getSize() {
        return SIZE;
    }


    public int getCell(int row, int col) {
        return field[row][col];
    }


    public boolean wasShot(int row, int col) {
        return field[row][col] == 2 || field[row][col] == 3;
    }


    public boolean canPlaceShip(int row, int col, int length, boolean horizontal) {

        for (int i = 0; i < length; i++) {

            int r = row + (horizontal ? 0 : i);
            int c = col + (horizontal ? i : 0);

            if (r < 0 || r >= SIZE || c < 0 || c >= SIZE) {
                return false;
            }


            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {

                    int nr = r + dr;
                    int nc = c + dc;

                    if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE && field[nr][nc] == 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public void placeShip(
            int row, int col, int length, boolean horizontal) {

        if (!canPlaceShip(row, col, length, horizontal)) {
            throw new IllegalArgumentException("Нельзя разместить корабль в этой позиции");
        }

        for (int i = 0; i < length; i++) {

            int r = row + (horizontal ? 0 : i);
            int c = col + (horizontal ? i : 0);

            field[r][c] = 1;
        }
    }


    public void placeRandomShips() {

        int[] ships = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

        for (int ship : ships) {

            boolean placed = false;

            while (!placed) {

                int row = random.nextInt(SIZE);
                int col = random.nextInt(SIZE);
                boolean horizontal = random.nextBoolean();

                if (canPlaceShip(row, col, ship, horizontal)) {
                    placeShip(row, col, ship, horizontal);
                    placed = true;
                }
            }
        }
    }


    public boolean shoot(int row, int col) {

        if (field[row][col] == 1) {
            field[row][col] = 2;
            return true;
        }

        if (field[row][col] == 0) {
            field[row][col] = 3;
        }

        return false;
    }


    public int countShips() {

        int count = 0;

        for (int[] row : field) {
            for (int cell : row) {
                if (cell == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public void print(boolean showShips) {
        System.out.print("   ");

        for (char letter : LETTERS) {
            System.out.print(letter + " ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {

            System.out.printf("%2d ", i + 1);

            for (int j = 0; j < SIZE; j++) {

                char symbol;

                if (field[i][j] == 1) {
                    symbol = showShips ? 'К' : '~';
                } else if (field[i][j] == 2) {
                    symbol = 'Х';
                } else if (field[i][j] == 3) {
                    symbol = '·';
                } else {
                    symbol = '~';
                }

                System.out.print(symbol + " ");
            }

            System.out.println();
        }
    }
}
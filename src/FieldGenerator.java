import java.util.Random;

public class FieldGenerator {

    private int length;
    private int width;

    private int quantityOfFourDeckShip;
    private int quantityOfThreeDeckShip;
    private int quantityOfDoubleDeckShip;
    private int quantityOfSingleDeckShip;


    public FieldGenerator(int length, int width, int quantityOfFourDeckShip, int quantityOfThreeDeckShip, int quantityOfDoubleDeckShip, int quantityOfSingleDeckShip) {
        this.length = length;
        this.width = width;
        this.quantityOfFourDeckShip = quantityOfFourDeckShip;
        this.quantityOfThreeDeckShip = quantityOfThreeDeckShip;
        this.quantityOfDoubleDeckShip = quantityOfDoubleDeckShip;
        this.quantityOfSingleDeckShip = quantityOfSingleDeckShip;
    }

    public int[][] generate() {
        Random random = new Random();
        int[][] field = new int[length][width];

        int countOfFourDeckShips = 0;
        while (countOfFourDeckShips < quantityOfFourDeckShip) {
            int x = random.nextInt(0, length);
            int y = random.nextInt(0, width);

            int direction = random.nextInt(2);   // если direction = 0 - заполняем вправо, если direction = 1 - заполняем вниз
            if (direction == 0 && y < length - 3 && field[x][y] == 0 && field[x][y + 1] == 0 && field[x][y + 2] == 0 && field[x][y + 3] == 0) {
                field[x][y] = 4;
                field[x][y + 1] = 4;
                field[x][y + 2] = 4;
                field[x][y + 3] = 4;
                countOfFourDeckShips++;
            } else if (direction == 1 && x < width - 3 && field[x][y] == 0 && field[x + 1][y] == 0 && field[x + 2][y] == 0 && field[x + 3][y] == 0) {
                field[x][y] = 4;
                field[x + 1][y] = 4;
                field[x + 2][y] = 4;
                field[x + 3][y] = 4;
                countOfFourDeckShips++;
            }
        }

        int countOfThreeDeckShips = 0;
        while (countOfThreeDeckShips < quantityOfThreeDeckShip) {
            int x = random.nextInt(0, length);
            int y = random.nextInt(0, width);

            int direction = random.nextInt(2);   // если direction = 0 - заполняем вправо, если direction = 1 - заполняем вниз
            if (direction == 0 && y < length - 2 && field[x][y] == 0 && field[x][y + 1] == 0 && field[x][y + 2] == 0) {
                field[x][y] = 3;
                field[x][y + 1] = 3;
                field[x][y + 2] = 3;
                countOfThreeDeckShips++;
            } else if (direction == 1 && x < width - 2 && field[x][y] == 0 && field[x + 1][y] == 0 && field[x + 2][y] == 0) {
                field[x][y] = 3;
                field[x + 1][y] = 3;
                field[x + 2][y] = 3;
                countOfThreeDeckShips++;
            }
        }

        int countOfDoubleDeckShips = 0;
        while (countOfDoubleDeckShips < quantityOfDoubleDeckShip) {
            int x = random.nextInt(0, length);
            int y = random.nextInt(0, width);

            int direction = random.nextInt(2);   // если direction = 0 - заполняем вправо, если direction = 1 - заполняем вниз
            if (direction == 0 && y < length - 1 && field[x][y] == 0 && field[x][y + 1] == 0) {
                field[x][y] = 2;
                field[x][y + 1] = 2;
                countOfDoubleDeckShips++;
            } else if (direction == 1 && x < width - 1 && field[x][y] == 0 && field[x + 1][y] == 0) {
                field[x][y] = 2;
                field[x + 1][y] = 2;
                countOfDoubleDeckShips++;
            }
        }

        int countOfSingleDeckShips = 0;
        while (countOfSingleDeckShips < quantityOfSingleDeckShip) {
            int x = random.nextInt(0, length);
            int y = random.nextInt(0, width);

            if (field[x][y] == 0) {
                field[x][y] = 1;
                countOfSingleDeckShips++;
            }
        }
        return field;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}











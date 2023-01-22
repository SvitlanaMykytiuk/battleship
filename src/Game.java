import java.util.Scanner;

public class Game {

    private int[][] field;
    private int lenth;
    private int width;
    private int quantityOfShots;


    public Game(int[][] field, int lenth, int width, int quantityOfShots) {
        this.field = field;
        this.lenth = lenth;
        this.width = width;
        this.quantityOfShots = quantityOfShots;
    }

    public void start() {

        int scoring = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= quantityOfShots; i++) {

            System.out.println("Выстрел № " + i);
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (first >= 0 && first < lenth && second >= 0 && second < width) {

                int shot = field[first][second];

                if (shot == 0) {
                    System.out.println("Мимо");
                } else {
                    System.out.println("Убил");
                    scoring ++;
                }
            } else {
                System.out.println("Введены некорректные координаты");
                i --;
            }
        }
        System.out.println("Колличество уничтоженных кораблей: " + scoring);
    }
}

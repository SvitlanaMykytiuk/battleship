import java.util.Random;

public class Main {
    public static void main(String[] args) {

        FieldGenerator fieldGenerator = new FieldGenerator(10, 10, 1, 2, 3, 4);
        int[][] field = fieldGenerator.generate();

        Game game = new  Game (field, fieldGenerator.getLength(), fieldGenerator.getWidth(), 3);
        game.start();

        FieldPrinter fieldViewer = new FieldPrinter(fieldGenerator.getLength());
        fieldViewer.printField(field);

    }
}
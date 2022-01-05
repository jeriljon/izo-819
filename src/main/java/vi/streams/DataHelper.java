package vi.streams;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DataHelper {

    public static List<String> createListOfNames(){
        List<String> names = new ArrayList<>();
        names.add("TOM");
        names.add("JIM");
        names.add("MARK");
        names.add("CHRIS");
        return names;
    }

    public static List<Integer> generateRandomListOfNumbers(){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) numbers.add(i % 2);
        Collections.shuffle(numbers);
        return numbers;
    }

    public static List<Integer> generateOrderedListOfNumbers (int lowerLimit, int upperLimit) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = lowerLimit; i < upperLimit; i++)
            numbers.add(i);
        return numbers;
    }

    /**
     * Get some bricks based on the List of colors passed
     * @param count, colors
     * @return int
     */
    public static  List<Brick> getRandomBricks (int count) {
        List<Color> colors = List.of(Color.DARK_GRAY, Color.BLACK, Color.RED, Color.WHITE);
        List<Brick> bricks = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Brick brick = new Brick(colors.get(random.nextInt(colors.size())), i);
            bricks.add(brick);
        }
        return bricks;
    }
}

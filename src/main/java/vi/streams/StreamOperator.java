package vi.streams;

import java.awt.*;
import java.util.List;

/**
 * Use Java Streams to filter, transform and process data
 * Java Stream interface is about a sequence of elements supporting sequential and parallel aggregate operations.
 *
 */
public class StreamOperator {

    public static void main(String[] args) {
        int weightOfRedBricks = getBricksWeightByColorIfPresent(8, Color.RED);
        System.out.println("Weight of 8 red bricks: " + weightOfRedBricks);
    }

    /**
     * Get list of random color bricks based on the count
     * @param count, colors
     * @return int
     */
    public static int getBricksWeightByColorIfPresent (int count, Color color) {
        List<Brick> allBricks = DataHelper.getRandomBricks(count);
        return allBricks.stream()
                .filter( brick -> brick.getColor() == color)
                .mapToInt(brick -> brick.getWeight())
                .sum();

    }


}

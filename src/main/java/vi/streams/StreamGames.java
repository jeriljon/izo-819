package vi.streams;

import java.util.stream.Stream;

public class StreamGames {

    public static void main(String[] args) {
        streamIterateAndPrint();
        streamOfOddNumbers();
    }

    public static void streamIterateAndPrint(){
        // (initial value, next value)
        Stream.iterate(0, n -> n + 1)
                .limit(10)
                .forEach(x -> System.out.println(x));
    }

    public static void streamOfOddNumbers() {
        Stream.iterate(0, n -> n + 1)
                .filter(x -> x % 2 != 0)
                .limit(10)
                .forEach(x -> System.out.println(x));
    }
}

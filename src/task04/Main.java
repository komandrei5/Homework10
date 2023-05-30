package task04;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "crab", "crab", "crab",
                "crab", "turtle", "fox", "cat", "bird", "cat", "bird");
        Task04.calcOccurrence(words);
    }
}

package task01;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task01 task = new Task01();
        List<String> words = Arrays.asList("apple", "banana", "orange", "apple", "grape", "apple",
        "pen", "Hi", "read", "pear", "table", "potato", "plume", "run!", "Go");

        List<String> randomWords = task.getList(words, 7771);
        int occurrences = task.countOccurance(randomWords, "pen");
        System.out.println("Occurrences of coincidence: "  + occurrences);
    }
}

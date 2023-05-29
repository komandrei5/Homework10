package task01;

import java.util.ArrayList;
import java.util.List;

public class Task01 {

    public int countOccurance(List<String> list, String pattern) {
        int count = 0;
        for (String word : list) {
            if (word.equals(pattern)) {
                count++;
            }
        }
        return count;
    }

     List<String> getList (List<String> words, int count) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String word = getRandomWord(words);
            result.add(word);
        }
        return result;
    }

    private String getRandomWord(List<String> words) {
        return words.get((int) (Math.random()* words.size()));
    }
}
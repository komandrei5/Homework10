package task04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task04 {
    public static void calcOccurrence(List<String> words) {
        Map<String, Integer> occurenceMap = new HashMap<>();

        for (String word : words) {
            if (occurenceMap.containsKey(word)) {
                int count = occurenceMap.get(word);
                occurenceMap.put(word, count + 1);
            } else {
                occurenceMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : occurenceMap.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
}

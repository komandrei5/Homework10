package task03;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task03 task = new Task03();
        List<Integer> numbers = Arrays.asList(1, 5, 5, 7, 8, 9, 342, 34, 882, 89428378,
                57, 5, 893, 3498, 498, 3, 98, 11, 11, 98, 57, 1, 7, 8, 9, 342, 34);
        List<Integer> uniqueNumbers = task.findUnique(numbers);
        System.out.println("Original numbers: " + numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }

}

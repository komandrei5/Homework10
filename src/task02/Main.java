package task02;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] array ={1, 2, 3};
        List<Integer> list = Task02.toList(array);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("List: " + list);
    }
}

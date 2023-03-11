package franxx.code.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5, 2323, 23, 23, 23, 2, 32, 31, 213, 12, 434, 3, 24, 13, 1, 23123124
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 434));
        System.out.println(Arrays.binarySearch(numbers, 24));
        System.out.println(Arrays.binarySearch(numbers, 1111));

        int[] copy = Arrays.copyOf(numbers, 10);
        System.out.println(Arrays.toString(copy));

        int[] copyInts = Arrays.copyOfRange(numbers, 1, 5);
        System.out.println(Arrays.toString(copyInts));
    }
}

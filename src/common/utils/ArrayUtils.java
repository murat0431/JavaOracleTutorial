package common.utils;

public class ArrayUtils {

    public static <T> void printArray(T[] arr) {
        for (T element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int element : arr)
            System.out.print(element + " ");
        System.out.println();
    }

}

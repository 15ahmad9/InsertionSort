package insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionsort(int[] array) {

        for (int index = 1; index < array.length; index++) {
            int j = index;
            int temp;
            while (j < 0 && array[j - 1] < array[j]) {
                temp = array[j];
                array[j] = array[j - 1];
                temp = array[j - 1];
                j--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 8, 5, 3, 9, 4, 7};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));

    }

}

package homework.HW4;
// Реализовать алгоритм быстрой сортировки
import java.util.Arrays;

public class quick_sort {
    public static void QuickSort(int[] input_array, int low, int high) {
        if (input_array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int base = input_array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (input_array[i] < base) {
                i++;
            }

            while (input_array[j] > base) {
                j--;
            }

            if (i <= j) {
                int temp = input_array[i];
                input_array[i] = input_array[j];
                input_array[j] = temp;
                i++;
                j--;
            }
    }

        if (low < j)
        QuickSort(input_array, low, j);

    if (high > i)
            QuickSort(input_array, i, high);
    }
    public static void main(String[] args) {
        int[] arr = { 0, -5, 2, 3, 5, 9, -1, 7 };
        System.out.println("Первоначальный массив: ");
        System.out.println(Arrays.toString(arr));

        int low = 0;
        int high = arr.length - 1;

   QuickSort(arr, low, high);
        System.out.println("Отсортированный массив: ");
    System.out.println(Arrays.toString(arr));
}

}

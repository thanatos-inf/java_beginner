package homework.HW2;

import java.util.Arrays;

// Реализовать алгоритм сортировки вставками
public class task_2 {
    public static void main(String[] args) {
        int[] array = {3, 7, 14, 2, 9, 5, 1, -8, -6};
        System.out.print("Изначальный массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j  = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
    } 
}

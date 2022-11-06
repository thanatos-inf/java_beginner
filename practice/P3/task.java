package practice.P3;

import java.util.ArrayList;
// Описать структуру такую, что:
// Есть хранилище, можно добавить извлечь.
// 0 0 0 0 0 0 0 0 0 0
// void add (int item)
// int remove (void)
// add(2)
// 2 0 0 0 0 0 0 0 0 0
// add(12)
// 2 12 0 0 0 0 0 0 0 0
// add(1)
// 2 12 1 0 0 0 0 0 0 0
// el = remove()
// 12 1 0 0 0 0 0 0 0 0
// el = remove()
// 1 0 0 0 0 0 0 0 0 0
import java.util.List;


public class task {
    public static void main(String[] args) {
        ArrayList<Integer> new_list = new ArrayList<Integer>(10);
        new_list.add(123);
        new_list.add(456);
        new_list.add(789);
        System.out.println(new_list);
        new_list.remove(0);
        System.out.println(new_list);
    }

    // public static void add_item(int[] arr,  int item) {
    //     int n = arr.length;
    //     for (int i = 0; i < n; i++)
    //         if (arr[0] == 0) {
    //             int temp = arr[0];
    //             arr[0] = item;
    //             item = temp;
    //         else if (arr[0] != 0) {
                

    //         }

    //     }

    // }


}

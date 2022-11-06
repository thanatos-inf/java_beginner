package lections.L3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class work {
    // static int[] AddItem(int[] array, int item) {
    //     int length = array.length;
    //     int[] temp = new int[length + 1];
    //     System.arraycopy(array, 0, temp, 0, length);
    //     temp[length] = item;
    //     return temp;
    // }
    // public static void main(String[] args) {
    //     int[] a = new int[] { 0, 9 };
    //     for (int i : a) { System.out.printf("%d ", i); }
    //     a = AddItem(a, 2);
    //     a = AddItem(a, 6);
    //     for (int j : a) { System.out.printf("%d ", j); }
    // }
    public static void main(String[] args) {
        ArrayList<Integer> new_list = new ArrayList<Integer>(); //c помощью "обобщения" явно указываем тип элемента
        new_list.add(2809);
        new_list.add(2999);
        new_list.add(3102);

        System.out.println(new_list);

        new_list.remove(1);
        System.out.println(new_list);


        // for (Object o : new_list) {
        //     System.out.println(o);
        // }
    }

    // public static void main(String[] args) {
    //     int day = 20;
    //     int month = 12;
    //     int year = 1992;
    //     Integer[] date = {day, month, year};
    //     List<Integer> d = Arrays.asList(date);
    //     System.out.println(d);
    // }
 }


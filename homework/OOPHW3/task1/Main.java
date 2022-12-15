package OOPHW3.task1;

import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        Integer [] arr1 = {12459, 31, 156, 1415, 287};    
    

    Arrays.sort(arr1, new Comparator<Integer>(){
        @Override
        public int compare(Integer a, Integer b) {
            return Integer.compare(a % 10, b % 10);
        }
    });

for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

}
}
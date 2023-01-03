package other.EXHW1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_one{
    private int[] array;
    private int element;


    public void firstEx() {
        array = new int[5];

        for (int element : array) {
            System.out.println(array[6]);
        }
    }

    public void secondEx() {
        System.out.println(array);
    }

    public void thirdEx() throws FileNotFoundException {
        File file = new File("nopath");
        Scanner scanner = new Scanner(file);
    }
}
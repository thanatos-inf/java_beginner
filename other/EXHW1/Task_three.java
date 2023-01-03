package other.EXHW1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен частному элементов
//двух входящих массивов в той же ячейке. Если длины массивов не равны,
//необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение,
//которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class Task_three {


    private int[] arrFirst;
    private int[] arrSecond;
    private int[] arrResult;

    Task_three(int[] arrFirst, int[] arrSecond) {
        this.arrFirst = arrFirst;
        this.arrSecond = arrSecond;
    }

    public void subArr() {
        if (arrFirst.length > arrSecond.length) {
            arrResult = new int[arrFirst.length];
        } else arrResult = new int[arrSecond.length];
        try {
            for (int i = 0; i < arrResult.length; i++) {

                arrResult[i] = arrFirst[i] / arrSecond[i];
            }
            System.out.println(Arrays.toString(arrResult));

        } catch (RuntimeException exception) {
            System.out.println("One array is less then the other!");

        }
    }
}

package lections.L6.OOP;

import java.util.Arrays;
import java.util.HashSet;

public class ex {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Вася";
        w1.lastName = "Пупкин";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Вася";
        w4.lastName = "Пупкин";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Анна";
        w2.lastName = "Иванова";
        w2.salary = 108;
        w2.id = 777;

        Worker w3 = new Worker();
        w3.firstName = "Игорь";
        w3.lastName = "Митин";
        w3.salary = 200;
        w3.id = 963;

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

        System.out.println(w3.toString());
    }

}

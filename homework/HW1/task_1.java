package HW1;
// Написать программу вычисления n-ого треугольного числа.
public class task_1 {
    public static void main(String[] args) {
        Double num = 9.0;
        Double res = 0.5 * num * (num + 1);
        System.out.println(res);

    System.out.println(req_tria_num(9));
    
}

    public static int req_tria_num(int num) {
        int result = 1;
        if (num == 1) {
            return result;
        }
        result = num + (req_tria_num(num - 1));
        return result;


}

}
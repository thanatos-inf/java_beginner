package lections.L1;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        float num = 123.45f; //тип данных float требует знак f после объявленного значения переменной
        System.out.println(num);
        char ch =')';
        System.out.println(ch);
        boolean x = true | false; // ^ - дизъюнкция
        System.out.println(x);
        String text = "Here we go again!";
        System.out.println(text.charAt(3)); 
        System.out.println(text);
        var i = 123; // переменная, тип данных определяется при компиляции приложения
        System.out.println(getType(i));
        System.out.println(Integer.MAX_VALUE);
        int new_num = 145_65_12; // вариант оформления для наглядности, не влияет на значение
        System.out.println(new_num);
        int a = 123;
        a = a-- - --a; // так и не понял, почему в ответе 2
        System.out.println(a);
        

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}
package HW2;
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
public class task_1 {
    
    public static void main(String[] args) {
        System.out.println("Кратчайший путь решения: ");
        int ring_count = 4;
        moveRing('1', '2', '3', ring_count);
    }
    

    public static void moveRing(char a, char b, char c, int count) {
        
    	if (count==1) {
		    System.out.println(String.format("Перемещаем кольцо со стержня %s на стержень %s", a, b));
	    } else {
		    moveRing(a, c, b, count - 1);
		    System.out.println(String.format("Перемещаем кольцо со стержня %s на стержень %s", a, b));
	        moveRing(c, b, a, count - 1);
    	}
    }
}

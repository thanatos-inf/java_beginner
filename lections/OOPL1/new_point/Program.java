package lections.OOPL1.new_point;



public class Program {

    static double distance(point2D a, point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        // point2D a = new point2D();
        // a.x = 0;
        // a.y = 2;
        // System.out.println(a.toString());
        point2D a = new point2D(0, 2);
        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getY());

        point2D b = new point2D();
        b.setX(0);
        b.setY(10);
        System.out.println(b);

        System.out.println(distance(a, b));
    }
}

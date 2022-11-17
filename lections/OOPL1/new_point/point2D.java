package lections.OOPL1.new_point;

/** 
 * Это точка 2D
*/
public class point2D {
    int x, y; // можно сделать private

    /**
     * 
     * @param ValueX это координата Х
     * @param ValueY это координата У
     */
    public point2D(int ValueX, int ValueY) {
        x = ValueX;
        y = ValueY;
    }

    public point2D(int value) {
        this(value, value);
    }

    public point2D() {
       this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    // public point2D() {
    //     x = 0;
    //     y = 0;
    // }

    private String getInfo () {
        return String.format("x: %d, y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    //ctor
    //get, set
    //docs
}

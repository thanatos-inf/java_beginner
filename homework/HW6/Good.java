package HW6;

public class Good {

    public String name;
    public double price;
    public int count;
    public String description;

    public void print() {
        System.out.println(
            String.format(
                "%s %f %d %s",
                name,
                price,
                count,
                description));
      }
    
  }
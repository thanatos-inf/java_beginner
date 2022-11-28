package HW6;

public class Main {
    public static void main(String[] args) {
        Good laptop = new CreateGood()
        .setName("Razer Blade")
        .setPrice(199999.99)
        .setCount(1)
        .setDescription("New Model!")
        .Create();

        laptop.print();

        Good car = new Good();
        car.print();

    }
}

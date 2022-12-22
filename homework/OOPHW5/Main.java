package OOPHW5;

public class Main {
    public static void main(String[] args) {
        Presenter sum = new Presenter(new SumModel(), new View());
        Presenter sub = new Presenter(new SubModel(), new View());
        Presenter mult = new Presenter(new MultModel(), new View());
        Presenter div = new Presenter(new DivModel(), new View());

        Command c = new Command(sum, sub, mult, div);

        c.start(sum, sub, mult, div);
    }
}

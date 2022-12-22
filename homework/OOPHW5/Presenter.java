package OOPHW5;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void startAction() {
        Float a = view.getValue("Enter first value: ");
        Float b = view.getValue("Enter second value: ");
        model.setX(a);
        model.setY(b);
        Float result = model.result();
        view.print(result, "Result: ");
    }
}

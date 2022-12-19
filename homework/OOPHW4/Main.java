package OOPHW4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var per_1 = new Person<Integer>("Jane", 1);
        var per_2 = new Person<Integer>("Ostin", 2);
        var per_3 = new Person<Integer>("Alex", 3);
        var per_4 = new Person<Integer>("Marry", 4);
        var per_5 = new Person<Integer>("Peter", 5);

        GeoTree gt = new GeoTree();

        gt.createLink(per_1, Human.relationship.parent, Human.relationship.child, per_2);
        gt.createLink(per_1, Human.relationship.sister, Human.relationship.sister, per_3);
        gt.createLink(per_1, Human.relationship.sister, Human.relationship.brother, per_5);
        gt.createLink(per_1, Human.relationship.sister, Human.relationship.sister, per_4);

        ArrayList<Person> listOfPer = new ArrayList<>();

        listOfPer.add(per_1);
        listOfPer.add(per_2);
        listOfPer.add(per_3);
        listOfPer.add(per_4);
        listOfPer.add(per_5);

        App s = new App();
        s.start(listOfPer);

        // System.out.print("For the ");
        // System.out.print(String.format("%s", per_1));
        // System.out.println();
        // System.out.println();
        // System.out.println("Known ciblings are:");
        // System.out.println(new Search(gt).check(per_1, Human.relationship.sister));
        // System.out.println();
        // System.out.println("Known children are:");
        // System.out.println(new Search(gt).check(per_1, Human.relationship.parent));
    }
}
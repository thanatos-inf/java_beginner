package OOPHW1_2;

public class Main {
    public static void main(String[] args) {
        var person_1 = new Person("Jane");
        var person_2 = new Person("Ostin");
        var person_3 = new Person("Alex");
        var person_4 = new Person("Marry");
        var person_5 = new Person("Peter");

        GeoTree gt = new GeoTree();

        gt.createLink(person_1, Human.relationship.parent, Human.relationship.child, person_2);
        gt.createLink(person_1, Human.relationship.sister, Human.relationship.sister, person_3);
        gt.createLink(person_1, Human.relationship.sister, Human.relationship.brother, person_5);
        gt.createLink(person_1, Human.relationship.sister, Human.relationship.sister, person_4);

        System.out.print("For the ");
        System.out.print(String.format("%s", person_1));
        System.out.println();
        System.out.println();
        System.out.println("Known ciblings are:");
        System.out.println(new Search(gt).check(person_1, Human.relationship.sister));
        System.out.println();
        System.out.println("Known children are:");
        System.out.println(new Search(gt).check(person_1, Human.relationship.parent));

    }
}

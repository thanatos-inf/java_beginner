package OOPHW1_2;

public class Node {
    Person p1;
    Person p2;
    Human.relationship re;

    public Node(Person p1, Human.relationship re, Person p2) {
        this.re = re;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", p1, re, p2);
    }
}

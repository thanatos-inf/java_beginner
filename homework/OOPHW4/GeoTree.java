package OOPHW4;

import java.util.ArrayList;

class GeoTree implements Tree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getData() {
        return tree;
    }

    public void createLink(Person p1, Human.relationship v1, Human.relationship v2, Person p2) {
        tree.add(new Node(p1, v1, p2));
        tree.add(new Node(p2, v2, p1));
    }
}
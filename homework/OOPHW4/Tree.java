package OOPHW4;

import java.util.ArrayList;;

interface Tree {
    void createLink(Person parent, Human.relationship v1, Human.relationship v2, Person children);

    ArrayList<Node> getData();
}

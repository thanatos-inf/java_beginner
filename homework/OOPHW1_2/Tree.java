package OOPHW1_2;

import java.util.ArrayList;

interface Tree {
    void createLink(Person person_1, Human.relationship v1, Human.relationship v2, Person person_2);

    ArrayList<Node> getData();
}

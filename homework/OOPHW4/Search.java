package OOPHW4;

import java.util.ArrayList;

class Search {
    ArrayList<Node> tree;

    public Search(Tree pd) {
        tree = pd.getData();
    }

    public ArrayList<Person> check(Human p, Human.relationship re) {
        var result = new ArrayList<Person>();
        for (Node t : tree) {
            if (t.p2.getName() == p.getName() && t.re == re) {
                result.add(t.p1);
            }
        }
        return result;
    }
}


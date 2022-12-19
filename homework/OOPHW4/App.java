package OOPHW4;

import java.util.ArrayList;
import java.util.Scanner;;

public class App {
    public void showList(ArrayList<Person> list) {
        System.out.println(list);
    }
    public void searchById(ArrayList<Person> list, String id) {
        int intId = Integer.parseInt(id);
            var result = new ArrayList<>();
            for (Person p : list) {
                if (intId == (Integer) p.getId()) {
                    result.add(p);
                    System.out.println(result);
                }
            }
        }

    public void start(ArrayList<Person> list) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Press: 1 - Find a person by ID  2 - Show the list of persons 3 - Exit the program");
                String key = in.next();
                switch (key) {
                    case "1":
                    System.out.println("Enter person's ID");
                    String num = in.next();
                        searchById(list, num);
                        System.out.println();
                        break;
                    case "2":
                        showList(list);
                        System.out.println();
                        break;
                    case "3":
                        System.exit(0);

                    default:
                        System.out.println("Sorry! There is no such command!");
                        break;
                }
            }
        }
    }
}
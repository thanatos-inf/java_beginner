package practice.P5;

// Нужно передавать ссылку на уже инициализированный узел

import java.util.Random;

public class app {
  public static void main(String[] args) {
    int count = 1;
    Node treeList = new Node(0);
    Node.create(treeList, count);

    Node.readTree(treeList, "");
  }
}

class Node {
  int value;

  public Node(int value) {
    this.value = value;
  }

  Node left;
  Node right;

  public static void create(Node node, int count) {
    Random r = new Random();
    if (count == 3)
      return;
    count++;

    node.left = new Node(r.nextInt(10));
    create(node.left, count);

    node.right = new Node(r.nextInt(10));
    create(node.right, count);

  }

  static void readTree(Node name, String sp) {
    // System.out.println(name);
    if ((name != null)) {
      System.out.println(sp + name.value);
    }

    if ((name.left != null)) {
      readTree(name.left, sp + "  ");
    }
    if ((name.right != null)) {
      readTree(name.right, sp + "  ");
    }
  }
}
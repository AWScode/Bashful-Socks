/* Node.java created by Mr. Considine
This class holds all of the information
and methods responsible for the Node for
a BinaryTree. */

import java.util.*;
import java.io.*;

public class Node {

  int Key;
  String name;

  public Node parent;
  public Node leftChild;
  public Node rightChild;
  public Integer val;

  public Node(int val) {
    this.val = val;
    this.parent = null;
    this.leftChild = null;
    this.rightChild = null;
  }

  public int getValue() {
    return this.val;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public Node getParent() {
    return this.parent;
  }

  public void setChild(Node child) {
    if (child.getValue() >= this.val) {
      this.leftChild = child;
    }
    else {
      this.rightChild = child;
    }
  }

  public Node getChild(boolean right) {
    if (right) {
      return this.rightChild;
    }
    else {
      return this.leftChild;
    }
  }

}

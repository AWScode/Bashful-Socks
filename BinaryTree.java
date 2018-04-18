/* BinaryTree.java created by Mr. Considine
This program holds all of the information for
the BinaryTree class. BinaryTree stores data in a
specific data structure that makes adding data
and searching for data possible in O(logn) time */
import java.util.*;
import java.io.*;

public class BinaryTree {

  public Node root;



  public void searchNode(Int val, Node focusNode) {

    Node focusNode = root;

    while(focusNode.val != val){

      if (val < focusNode.val){
        focusNode = focusNode.leftChild;
      }

      else{

        focusNode = focusNode.rightChild;
      }

      if(focusNode == null)
      return null;
    }

    return focusNode;

  }

  public void addNode(Int val, Node focusNode) {
    if (root == null){
      root = newNode
    }

    else {
      Node focusNode = root;

      Node parent;

      while(true){

        parent = focusNode

        if(key < focusNode.val){

          focusNode = focusNode.leftChild;

          if(focusNode == null){

            parent.leftChild = newNode;
            return;
          }
        }

        else{

          focusNode = focusNode.rightChild;

          if(focusNode == null){
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public void removeNode(Int val) {

  }

  Public void inOrderTraverseTree(Node focusNode){
    if (focusNode ! = null){
      inOrderTraverseTree(focusNode.leftChild);

      System.out.println(focusNode);

      inOrderTraverseTree(focusNode.rightChild);
    }
  }

  Public void preOrderTraverseTree(Node focusNode){
    if (focusNode ! = null){

      System.out.println(focusNode);

      preOrderTraverseTree(focusNode.leftChild);

      preOrderTraverseTree(focusNode.rightChild);
    }

  public void printTree(Node root) {
    if (root != null) {
      String valS = Integer.toString(root.getValue());
      System.out.println("[" + valS + "]");
      this.printTree(root.getChild(false));
      this.printTree(root.getChild(true));
    }
  }

  public static void main(String[] args) {

    BinaryTree tree = new BinaryTree();



  }

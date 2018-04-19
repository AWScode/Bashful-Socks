/* I really worked on it yesterday with Nerissa for 4h
it just doesn't worked
 */
import java.util.*;
import java.io.*;

public class BinaryTree {

  Node root;
  Node focusNode;
  Node parent;
  Node leftChild=focusNode.getChild(true);
  Node rightChild=focusNode.getChild(false);



  public void searchNode(int val) {

     focusNode = root;
     int focusVal=focusNode.getValue();
//start with the root
    while(focusVal != val){
//if it is not the root, keep looking
      if (val < focusVal){//start from the left
        focusNode = leftChild;
      }
//shift focus to the leftchild
      else{//move on to the right
        focusNode = rightChild;
      }

      if(focusNode == null){
        //return null;
      }
    }//wasn't found

    //return focusNode;

  }

  public void addNode(int val, String name) {

    Node newNode = new Node(val, name);//creat a new node and initialize it
//if there is no root this becomes root
    if (root == null){
      root = newNode;
    }

    else {
      focusNode = root;
//set root as the node we will start with as we traverse the tree

//futrre parent
      while(true){
//start with the root
        parent = focusNode;
//check if it should go on the left side of the parent node
        if(val < focusNode.getValue()){

          focusNode = leftChild;
//make leftchild the focus
          if(focusNode == null){
//if there is no children for leftchild, then place it on the left
            parent.getChild(true)= newNode;
            break;
            //return;
          }

        }

        else{
        focusNode = rightChild;

          if(focusNode == null){//no children for the rightchild
            parent.getChild(false)= newNode;//place it on the right
            //return;
          }
        }
      }
    }
  }

  public void removeNode(int val) {
    boolean find=false;
    focusNode = root;
    //start with the top
    parent = root;


    //keep looking if it is not found
    while(focusNode.getValue() != val){

      if(val < focusNode.getValue()){
        //search left
        if(leftChild!=null){
          focusNode = leftChild;//make left the focus
          if(focusNode==val){
            find=true;
            break;
          }
        }

      }

      else if(val > focusNode.getValue()){
        if(rightChild!=null){
          focusNode = rightChild;
          if(focusNode==val){
            find=true;
            break;
          }
        }
      }

      else if(focusNode == null){
        break;
      }

      //wasn't found
      else if(rightChild== null && leftChild == null){
        break;
      }
    }

      else if(left){
//left children --> delete in its parent
        parent.leftChild = null;
      }

      else{

        parent.rightChild = null;
      }
    }

    else if(focusNode.rightChild == null){
//no rightchild
      if(focusNode == root){
        root = focusNode.leftChild;
      }

      else if(left){
        Node leftChild=focusNode.getChild(left);
        focusNode.setParent(leftChild);
        parent.leftChild = focusNode.leftChild;
      }
//move from leftchild to parent
      else {
        parent.rightChild = focusNode.leftChild;
      }

    }

    else if(focusNode.leftChild == null){
//no leftchild
      if(focusNode == root){
        root = focusNode.rightChild;
      }

      else if(left){
        parent.leftChild = focusNode.rightChild;
      }

      else{
        parent.rightChild = focusNode.leftChild;
      }


    }

    else {//need to find the felete nodes
      Node replacement getReplacementNode(focusNode);

      if(focusNode == root){
        root = replacement;
      }

      else if(left){
        parent.leftChild = replacement;
      }

      else {
        parent.rightChild = replacement;
        replacement.leftChild = focusNode.leftChild;
      }
    }

    return ture;
  }
}


  public void inOrderTraverseTree(Node focusNode){
    if (focusNode != null){
      inOrderTraverseTree(focusNode.leftChild);

      System.out.println(focusNode);

      inOrderTraverseTree(focusNode.rightChild);
    }
  }

  public void preOrderTraverseTree(Node focusNode){
    if (focusNode != null){

      System.out.println(focusNode);

      preOrderTraverseTree(focusNode.leftChild);

      preOrderTraverseTree(focusNode.rightChild);
    }
  }

    public Node getReplacementNode(Node replacedNode){
      Node replacementParent = replacedNode;
      Node replacement = replacedNode;

      Node focusNode = replacedNode.rightChild;

      while(focusNode != null){
        replacementparent = replacement;
        replacement = focusNode;
        focusNode = focusNode.leftChild;
      }

      if(replacement != replacedNode.rightChild){

        replacementParent.leftChild = replacement.rightChild;
        replacement.rightChild = replacedNode.rightChild;
      }

      return replacement;
    }

  /*public void printTree(Node root) {
    if (root != null) {
      String valS = Integer.toString(root.getValue());
      System.out.println("[" + valS + "]");
      this.printTree(root.getChild(false));
      this.printTree(root.getChild(true));
    }*/


public static void main(String[] args) {

  BinatyTree theTree = new BinaryTree();

  theTree.addNode(50, "ZX");

  theTree.addNode(25, "Y");

  theTree.addNode(15, "O");

  theTree.addNode(2, "B");

  theTree.addNode(18, "R");

  theTree.addNode(30, "ZD");

  theTree.addNode(75, "ZZX");

}


  }

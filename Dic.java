/* Pound.java by Mr. Considine
This class holds all of the data and methods
to create Pound objects. This is a class used
other files such as Dog.java and Owner.java */

public class Dic {

  public static void main(String[] args) {
    System.out.println("Welcome to the Pound!");
    System.out.println("Here we have some students to see.");

    Student fido = new Dog("Fido", 5, "Mr. Burns");

    Student marble = new Dog("Marble", 2, "Ms. Billings");

    Student cat = new Dog("Actually a Scone", 20, "Mr. Sidman");

    System.out.println("Here is one now:");

    fido.speak();
    String newName = fido.getName();
    System.out.println("Student's name is: " + newName);
  }
}

import java.util.*;

public class Dic {

  public static void main(String[] args) {
    System.out.println("Welcome to the Pound!");
    System.out.println("Here we have some students to see.");

    Student Sam = new Student("Sam", 5, "Mr. Burns");

    Student Tom = new Student("Tom", 2, "Ms. Billings");

    Student James = new Student("James", 20, "Mr. Sidman");

    System.out.println("Here is one now:");


    String newName = Sam.getName();
    System.out.println("Student's name is: " + newName);
    System.out.println("");
    System.out.println("Here is a list of all our students");

    ArrayList<Student> listofstudent = new ArrayList<Student>();
    listofstudent.add(Sam);
    listofstudent.add(Tom);
    listofstudent.add(James);


    for (int i=0; i<listofstudent.size(); i++){
      System.out.println(listofstudent.get(i).getName());
    }


    System.out.println("");
    System.out.println("Which student would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();


    Boolean found = false;
    Student oldstudent = new Student("test", 0, "test0");
    for (int i=0; i<listofstudent.size(); i++){
      if (choice.equals(listofstudent.get(i).getName())){
        System.out.println("what do you want to know about " + choice + "?");
        found = true;
        oldstudent = listofstudent.get(i);
        break;
      }
    }

    if (!found){
      System.out.println("I think you got the wrong name...");
    }
    else {
      Scanner q = new Scanner(System.in);
      String question = q.next();
      if (question.equals("age")) {
        System.out.println(oldstudent.getName() + "\'s age is" + oldstudent.getAge());
      }
        if (question.equals("class")) {
          System.out.println(oldstudent.getClasses() + "\'s class is" + oldstudent.getClasses());
        }
      }
    }


  }

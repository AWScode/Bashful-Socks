import java.util.*;

public class Dic {

  public static void main(String[] args) {
    System.out.println("Welcome to the Pound!");
    System.out.println("Here we have some students to see.");

    Student Sam = new Student("Sam", 15, "English and Chemistry", "red", "to read books");

    Student Tom = new Student("Tom", 16, "Algebra and Art", "gold", "free writing");

    Student James = new Student("James", 17, "Biology and History", "black", "to do experiments");

    Student John = new Student("John", 15, "Music and Geometry", "white", "to sing");

    Student Jenny = new Student("Jenny", 16, "Computer Science and English", "brown", "to code");

    Student Chris = new Student("Chris", 18, "Film and Psychology", "hazelnut", "to watch movies");

    Student Grace = new Student("Grace", 15, "Art and History", "gold", "to draw");

    Student Ivan = new Student("Ivan", 17, "Biology and Music", "black", "to read about music history");


    System.out.println("Here is one now:");


    String newName = Sam.getName();
    System.out.println("Student's name is: " + newName);
    System.out.println("");
    System.out.println("Here is a list of all our students");

    ArrayList<Student> listofstudent = new ArrayList<Student>();
    listofstudent.add(Sam);
    listofstudent.add(Tom);
    listofstudent.add(James);
    listofstudent.add(John);
    listofstudent.add(Jenny);
    listofstudent.add(Chris);
    listofstudent.add(Grace);
    listofstudent.add(Ivan);


    for (int i=0; i<listofstudent.size(); i++){
      System.out.println(listofstudent.get(i).getName());
    }


    System.out.println("");
    System.out.println("Which student would you like to know more about?");
    Scanner newIn = new Scanner(System.in);
    String choice = newIn.next();


    Boolean found = false;
    Student oldstudent = new Student("test", 0, "test0", "test1", "test2");
    for (int i=0; i<listofstudent.size(); i++){
      if (choice.equals(listofstudent.get(i).getName())){
        System.out.println("what do you want to know about " + choice + "?");
        System.out.println("You can ask about their age, classes, hair color, or hobby");
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
        System.out.println(oldstudent.getName() + "\'s age is " + oldstudent.getAge());
      }
        if (question.equals("classes")) {
          System.out.println(oldstudent.getName() + "\'s classes are " + oldstudent.getClasses());
        }
        if (question.equals("hair color")) {
          System.out.println(oldstudent.getName() + "\'s hair color is " + oldstudent.getHaircolor());
        }
        if (question.equals("hobby")) {
          System.out.println(oldstudent.getName() + "\'s hobby is " + oldstudent.getHobby());
        }
      }
    }


  }

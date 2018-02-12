/* Dog.java by Mr. Considine
This class holds all of the data and methods
to create Dog objects. This is a class to be
imported and used in other files such as
Pound.java which creates a bunch of dogs. */

public class Student {

  private static String name;
  private static int age;
  private static String class;

  public Student(String n, int a, String c) {
    this.name = n;
    this.age = a;
    this.class = c;
  }

  public static void speak() {
    System.out.println("nice to meet you");
  }

  public String getName() {
    return this.name;
  }

  public static int getAge() {
    return age;
  }

  public static String getOwner() {
    return class;
  }

  public static void setName(String n) {
    name = n;
  }

  public static void setAge(int a) {
    age = a;
  }

  public static void setClass(String c) {
    class = c;
  }

}

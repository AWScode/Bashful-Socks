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
    System.out.println("it is class time now");
  }

  public String getName() {
    return this.name;
  }

  public static int getAge() {
    return age;
  }

  public static String getClass() {
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

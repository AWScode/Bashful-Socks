public class Student {

  private String name;
  private int age;
  private String classes;

  public Student(String n, int a, String c) {
    this.name = n;
    this.age = a;
    this.classes = c;
  }

  public static void speak() {
    System.out.println("nice to meet you");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getClasses() {
    return classes;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  public void setClass(String c) {
    classes = c;
  }

}

public class Student {

  private String name;
  private int age;
  private String classes;

  public Student(String n, int a, String c, String d) {
    this.name = n;
    this.age = a;
    this.classes = c;
    this.haircolor = d;
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

  public String getHaircolor() {
    return haircolor;
  }

  public void setName(String n) {
    name = n;
  }

  public void setAge(int a) {
    age = a;
  }

  public void setClasses(String c) {
    classes = c;
  }

  public void setHaircolor(String c) {
    classes = h;
  }

}

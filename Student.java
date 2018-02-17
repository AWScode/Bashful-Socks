public class Student {

  private String name;
  private int age;
  private String classes;
  private String haircolor;
  private String hobby;

  public Student(String n, int a, String c, String h, String b) {
    this.name = n;
    this.age = a;
    this.classes = c;
    this.haircolor = h;
    this.hobby = b;
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

  public String getHobby() {
    return hobby;
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

  public void setHaircolor(String h) {
    haircolor = h;
  }

  public void setHobby(String b) {
    hobby = b;
  }

}

import java.util.Scanner;
public class CoffeeShop{
  public static void main(String[] args){

    System.out.println("Welcome to Yip Coffee!~");

    Scanner in1= new Scanner(System.in);
    String b = in1.nextLine();
    System.out.println("Sure. Tall, grande, or venti?");

    Scanner in2= new Scanner(System.in);
    String c = in2.nextLine();
    System.out.println("Got it! Can I have Your name please?");

    Scanner in3= new Scanner(System.in);
    String d = in3.nextLine();
    System.out.println("Thank you.");

    System.out.println(d+ ", your "+ b + " in " + c +" is ready.");

    //Vivian Yip 9/15/2017
  }
}

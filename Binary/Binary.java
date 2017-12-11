//Vivian Yip
//2017 12 06

import java.util.*;


public class Binary{

  // method

  public static Binary Addition (){
    for (int i=0 ; i<8 ; i++);{
      b[i]=second.charAt(i);
      a[i]=first.charAt(i);

    if (a [i].equal(0) && b [i].equal(0)){
      f[i]= 0;}
      else if (a[i].equal(1) && b[i].equal(0)) || (a[i].equal(0) && b[i].equal(1));{
      f[i] =0;
      remainder =1;}
      else {f[i]=1;}
    }
  }
  }

  public static void main(String[] args) {


    System.out.println("Input first binary number:(please type one nubmer at a time, and press enter after every number)");


    int a = new int [8];
    int b = new int [8];
    int f = new int [8];


    Scanner first = new Scanner(System.in);
    String a = parseInt(first.nextLine());


    System.out.println("Input second binary number:");

    Scanner second = new Scanner(System.in);
    int b = parseInt(second.nextLine());

    System.out.println("Choose add, subtract, multiply, divide");

    Scanner function = new Scanner(System.in);
    char operator = parseInt(function.nextLine());
}

}

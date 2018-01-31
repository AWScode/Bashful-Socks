/*
code how to calculate the factorial of the number 10
and print it
*/

public class Factorial{
  public static void main(String[] args) {
    int fac;
    fac = 10;
    for (int i=10; i>=1; i--){
      fac *= i;
      System.out.println(fac);
      }
    }
  }

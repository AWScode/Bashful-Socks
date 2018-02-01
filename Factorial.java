/*
code how to calculate the factorial of the number 10
and print it
*/
import java.util.*;

public class Factorial{
  //two numbers
  long fac;
  long num;
  public static void main(String[] args) {
    System.out.print("Please enter a number");
    Scanner input = new Scanner(System.in);
    long fac = input.nextLong();
    long result = V(fac);
    System.out.println(result);
  }
  public static long V(long fac) {
//method for Factorial
    for (long i=fac; i>=1; i--){
      fac = fac * i;
    }
    return fac;
    
  }

}

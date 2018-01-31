import java.util.Scanner;

// A Calculator for Binary
// Vivian Yip
// IB CS
// MR. C
// 12/20/2017 00:39am
public class TheRealFinalBinary {

//		  //to find out is it positive, negative, or 0
//		  public static Boolean isneg(int x){
//		  	return x&0x80000;
//		  }
//
//		  public static Boolean iszero(int x){
//		  	return !(x&0xFFFF);
//		  }
//
//		  public static Boolean ispos(int x){
//		  	return (x&0xFFFF) && !(x&0x8000);
//		  }

		  // inverse operation
		  public static int negative(int x)
		  {
		  	return add(~x, 1);
		  }

			//addition
		  public static int add( int x, int y) {
		    if (y == 0) return x;
		    int sum, carry;
		    sum = x ^ y;
		    carry = (x & y) << 1;
		    return add(sum, carry);
		  }

		  public static int Minus(int x, int y){
		  		return add(x, negative(y));
		  }

		  //positive multiplication
		  public static int multi(int x, int y)
		  {
			  int result = x;
			  for(int i=0; i < y - 1 ; i++)
			  {
				  result = add(result,x);
			  }
			  return result;
		  }

		  //positive division
		  public static int Divide(int x,int y){
			  if(y == 0)
				  return 0;

			  int coun = 0;
			       while(x >= y)
			       {
			           x = Minus(x, y);
			           coun = add(coun, 1);
			       }
			      return coun;
		  }



	public static void main(String[] args)
	{

		// input the numbers and function
		System.out.println("input your first number");
		Scanner scanner = new Scanner(System.in);
	    String s = scanner.nextLine();
	    int input1 = Integer.parseInt(s,2);
	    System.out.println("input your second number");
	    String s2 = scanner.nextLine();
	    int input2 = Integer.parseInt(s2,2);
			System.out.println("choose your function: addition, substruction, multiplication, or divition");
			String s3 = scanner.nextLine();

//if choose addition...
if (s3.equals("addition")){
			int output = add(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "+" + s2 + "=" + outputstring);
		}

//if choose substraction...
if (s3.equals("substraction")){
	    int output = Minus(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "-" + s2 + "=" + outputstring);
}

//if choose multiplication...
if (s3.equals("multiplication")){
	    int output = multi(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "*" + s2 + "=" + outputstring);
}

// if choose division...
if (s3.equals("division")){
	    int output = Divide(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "/" + s2 + "=" + outputstring);
		}
	}

}

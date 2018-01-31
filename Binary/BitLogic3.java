import java.util.Scanner;

public class BitLogic3 {

//		  //判断正数负数还是0
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

		  //取反 
		  public static int negative(int x)
		  {
		  	return add(~x, 1);
		  }

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

		  //正数乘法
		  public static int multi(int x, int y)
		  {
			  int result = x;
			  for(int i=0; i < y - 1 ; i++)
			  {
				  result = add(result,x);
			  }
			  return result;
		  }

		  //正数除法
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

		System.out.println("input hex number");
		Scanner scanner = new Scanner(System.in);
	    String s = scanner.nextLine();
	    int input1 = Integer.parseInt(s,2);
	    System.out.println("input hex number");
	    String s2 = scanner.nextLine();
	    int input2 = Integer.parseInt(s2,2);
			System.out.println("choose your function: addition, substruction, multiplication, or divition");
			String s3 = scanner.nextLine();


if (s3.equals("addition")){
			int output = add(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "+" + s2 + "=" + outputstring);
		}

if (s3.equals("substraction")){
	    int output = Minus(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "-" + s2 + "=" + outputstring);
}

if (s3.equals("multiplication")){
	    int output = multi(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "*" + s2 + "=" + outputstring);
}

if (s3.equals("substraction")){
	    int output = Divide(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "/" + s2 + "=" + outputstring);
		}
	}

}

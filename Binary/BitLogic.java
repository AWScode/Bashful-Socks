package console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitLogic {
		  public static int add(int x, int y) {
		    if (y == 0) return x;
		    int sum, carry;
		    sum = x ^ y;
		    carry = (x & y) << 1;
		    return add(sum, carry);
		  }

		  public static int multiplication(int x, int y)
		  {
			  int result = x;
			  for(int i=0; i < y - 1 ; i++)
			  {
				  result = add(result,x);
			  }
			  return result;
		  }


	public static void main(String[] args) throws IOException {

		//
		System.out.println("input hex number");
		InputStreamReader reader = new InputStreamReader(System.in);
	    BufferedReader input = new BufferedReader(reader);
	    String s = input.readLine();
	    int input1 = Integer.parseInt(s,2);
	    System.out.println("input hex number");
	    String s2 = input.readLine();
	    int input2 = Integer.parseInt(s2,2);

	    //
	    int output = add(input1, input2);
	    String outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "+" + s2 + "=" + outputstring);



	    //
	    output = multiplication(input1, input2);
	    outputstring = Integer.toBinaryString(output);
	    System.out.println(s + "*" + s2 + "=" + outputstring);
	}

}

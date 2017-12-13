//Vivian Yip
//2017 12 06

import java.util.*;
public class Binary{
  public static void main(String[] args) {

    System.out.println("Input first binary number:(please type one nubmer at a time, and press enter after every number)");


    Scanner first = new Scanner(System.in);
    int z = Integer.parseInt(first.nextLine());


    System.out.println("Input second binary number:");

    Scanner second = new Scanner(System.in);
    int y = Integer.parseInt(second.nextLine());

    System.out.println("Choose add, subtract, multiply, divide");

    Scanner function = new Scanner(System.in);
    char operator = char.parseInt(function.nextLine());


    int[] a = new int [8];
    int[] b = new int [8];
    int[] result = new int [8];

    //put into numbers

  for (int i=0; i<8; i++){
  a[7-i]= z.charAt(0+i);
  }

  for (int i=0; i<8; i++){
  b[7-i]= z.charAt(0+i);
  }

    // method Addition

    if (operator.equals("addition")){
      for (int i=0 ; i<8 ; i++){
        while(a [i]==2){
          a [i]=0;
          a [i+1]=a [i+1]+1;
        }
        if(a [i]==0 || b [i]==0){
          result [i]=a [i]+b [i];
        }
  else{
    result[i]=0;
    a [i+1]= a[i+1]+1;
  }
  }
  }



// method Substraction
if (operator.equals("substraction")){
  for (int i=0; i<8; i++){
  while(a [i]==-1){
    a [i]=1;
    a [i+1]=a [i+1]-1;
  }
  if((a [i]==0 && b [i]==0) || a [i]==1){
    result [i]=1;
    a [i+1]= a [i+1]-1;
  }
}
}



//method multiplication




//division


}
}

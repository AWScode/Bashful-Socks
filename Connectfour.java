/* Vivian Yip
 */

import java.util.*;

public class Connectfour {




  //Instance Variables here
  String[][] board;
  //rows
  String[] column1;
  String[] column2;
  String[] column3;
  String[] column4;
  String[] column5;
  String[] column6;
  String[] column7;

  Boolean gameOver;

  public static void main(String[] args) {
    Connectfour newGame = new Connectfour();
    newGame.displayBoard();
    //newGame.checkFour();
    String player = "2";
    while (true) {
      if (player.equals("1")) {
        player = "2";
      }
      else {
        player = "1";
      }
      System.out.println("Player " + player + "s turn.");

      Scanner newSc = new Scanner(System.in);
      newGame.displayBoard();
      System.out.println("Where do you want to play?");
      int col = newSc.nextInt()-1;
      //-1 in order to let 1 be the first column
      newGame.addPiece(col, player);
      newGame.checkFourUR(player);
      newGame.checkFourR(player);
      newGame.checkFourDR(player);
      newGame.checkFourD(player);

    }
  }

    //newGame.addPiece(col, player);




  public Connectfour() {
    //Constructor Method here
    this.column1 = new String[6];
    this.column1[0] = "0";
    this.column1[1] = "0";
    this.column1[2] = "0";
    this.column1[3] = "0";
    this.column1[4] = "0";
    this.column1[5] = "0";

    this.column2 = new String[6];
    this.column2[0] = "0";
    this.column2[1] = "0";
    this.column2[2] = "0";
    this.column2[3] = "0";
    this.column2[4] = "0";
    this.column2[5] = "0";

    this.column3 = new String[6];
    this.column3[0] = "0";
    this.column3[1] = "0";
    this.column3[2] = "0";
    this.column3[3] = "0";
    this.column3[4] = "0";
    this.column3[5] = "0";

    this.column4 = new String[6];
    this.column4[0] = "0";
    this.column4[1] = "0";
    this.column4[2] = "0";
    this.column4[3] = "0";
    this.column4[4] = "0";
    this.column4[5] = "0";

    this.column5 = new String[6];
    this.column5[0] = "0";
    this.column5[1] = "0";
    this.column5[2] = "0";
    this.column5[3] = "0";
    this.column5[4] = "0";
    this.column5[5] = "0";

    this.column6 = new String[6];
    this.column6[0] = "0";
    this.column6[1] = "0";
    this.column6[2] = "0";
    this.column6[3] = "0";
    this.column6[4] = "0";
    this.column6[5] = "0";

    this.column7 = new String[6];
    this.column7[0] = "0";
    this.column7[1] = "0";
    this.column7[2] = "0";
    this.column7[3] = "0";
    this.column7[4] = "0";
    this.column7[5] = "0";

    this.board = new String[7][6];
    this.board[0] = column1;
    this.board[1] = column2;
    this.board[2] = column3;
    this.board[3] = column4;
    this.board[4] = column5;
    this.board[5] = column6;
    this.board[6] = column7;

    this.gameOver = false;
  }

  // Get and Set Methods here
  public void getPiece(){


  }

  // Other methods here
  public void displayBoard(){
    for (int j = 0; j < 6; j++) {
      String row = "";
      for (int i = 0; i < 7; i++) {
        row = row + board[i][j] + " ";
      }
      System.out.println(row);
    }
  }

  public void addPiece(int col, String player) {

    for(int j =5; j>-1; j--){
     if (board[col][j].equals ("0")){
       board[col][j] = player;
       break;
     }
     else if (board[col][0].equals ("1") || board[col][0].equals ("2")){
       System.out.println("-----------Not here-----------");
       //if the person misplaced it in a column that is already full, she/he will not have another chance to put another piece
       break;
     }
   }
 }




 public void checkFour(String player){
   int c = 0;
   for(int i =0; i<7; i++){
     for (int j = 0; j<6; j++){
       if (board[i][j].equals("1")){
       for (int k=0; k<4; k++){
         if (board[i+k][j-k].equals ("1")){
           k = k+1;
           c = c+1;
         if (c == 6){
         System.out.println("Player 1 won");
         System.out.println("press control + c");

       }

       }
       break;

     }



   }
     }

    }
  }




 public void checkFourUR(String player){
   int c = 0;
   for(int i =0; i<7; i++){
     for (int j = 0; j<6; j++){
       if (board[i][j].equals("1")){
       for (int k=1; k<5; k++){

       if (board[i+k][j-k].equals ("1")){
         k = k+1;
         c++;
         if (c == 3){
         System.out.println("Player 1 won UR");
         System.out.println("press control + c");
         break;


       }

     }
     else if (board[i+k][j-k].equals ("0") || board[i+k][j-k].equals ("2")){
       break;
     }




}

}
}
break;
}
}

public void checkFourR(String player){
  int c = 0;
  for(int i =0; i<7; i++){
    for (int j = 0; j<6; j++){
      if (board[i][j].equals("1")){
      for (int k=0; k<4; k++){
        /*if (!board[col+k][j+k].equals ("1")){
          return false;
      }*/
      if (board[i+k][j].equals ("1")){
        k = k+1;
        c = c+1;
    }
    if (c == 6){
    System.out.println("Player 1 won R");
    System.out.println("press control + c");

  }

    break;
}
}
}
}
}


public void checkFourDR(String player){
  int c = 0;
  for(int i =0; i<7; i++){
    for (int j = 0; j<6; j++){
      if (board[i][j].equals("1")){
      for (int k=0; k<4; k++){
        /*if (!board[col+k][j+k].equals ("1")){
          return false;
      }*/
      if (board[i+k][j+k].equals ("1")){
        k = k+1;
        c = c+1;
        if (c == 6){
        System.out.println("Player 1 won DR");
        System.out.println("press control + c");

      }
    }

    break;
}
}
}
}
}

public void checkFourD(String player){
  int c = 0;
  for(int i =0; i<7; i++){
    for (int j = 0; j<6; j++){
      if (board[i][j].equals("1")){
      for (int k=0; k<3; k++){
        /*if (!board[col+k][j+k].equals ("1")){
          return false;
      }*/
      if (board[i][j+k].equals ("1")){
        k = k+1;
        c = c+1;
      }
      if (c == 4){
      System.out.println("Player 1 won D");
      System.out.println("press control + c");

    }

    break;
}
}
}
}
}




}

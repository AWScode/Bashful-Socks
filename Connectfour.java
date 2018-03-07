/* Vivian Yip
 */

import java.util.*;

public class ConnectFour {

    //variables
    final static int WIDTH = 7;
    final static int HEIGHT = 6;
    final static int BOTTOM_ROW = WIDTH - 1;


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

  public ConnectFour() {
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
    return piece

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

  public void addPiece(int columnInd) {
      //Place a piece in the column that is passed in.
      //Find the lowest possible empty space and fill.
      //The largest row number that is empty.

  }




  public void checkFour() {
    for (int i = 0; j < 7; j++){
      for (int j = 0; i < 6; i++){
        if board [i][j].equals("1");
        return [i][j];

      }
    }
  }

  public static boolean CheckXHorizontal(){
       //creates boolean to act as flag
       boolean flag = true;

       //creates counter
       int counter = 0;
       while(flag){

           //goes through board horizontally
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'X'){ //if it finds an X, add 1 to counter
                       counter += 1;
                   }else{
                       counter = 0; // if next piece is not an X, set counter to 0
                   }
                   if(counter >= 4){
                       System.out.println("Player 1 wins"); //if counter is greater or equal to 4, player wins
                       flag = false;
                   }
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckXVertical(){
       //creates boolean to act as flag
       boolean flag = true;

       //creates counter
       int counter = 0;
       while(flag){

           //goes through board vertically
           for(int h = 0; HEIGHT > h; h += 1){
               for(int w = 0; WIDTH > w; w += 1){
                   if(board[w][h] == 'X'){ //if it finds an X, add 1 to counter
                       counter += 1;
                   }else{
                       counter = 0; // if next piece is not an X, set counter to 0
                   }
                   if(counter >= 4){
                       System.out.println("Player 1 wins"); //if counter is greater or equal to 4, player wins
                       flag = false;
                   }
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckOVertical(){
       //creates boolean to act as flag
       boolean flag = true;

       //creates counter
       int counter = 0;
       while(flag){

           //goes through board vertically
           for(int h = 0; HEIGHT > h; h += 1){
               for(int w = 0; WIDTH > w; w += 1){
                   if(board[w][h] == 'O'){ //if it finds an O, add 1 to counter
                       counter += 1;
                   }else{
                       counter = 0; // if next piece is not an O, set counter to 0
                   }
                   if(counter >= 4){
                       System.out.println("Player 2 wins"); //if counter is greater or equal to 4, player wins
                       flag = false;
                   }
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckOHorizontal(){
       //creates boolean to act as flag
       boolean flag = true;

       //creates counter
       int counter = 0;
       while(flag){

           //goes through board vertically
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'O'){ //if it finds an O, add 1 to counter
                       counter += 1;
                   }else{
                       counter = 0; // if next piece is not an O, set counter to 0
                   }
                   if(counter >= 4){
                       System.out.println("Player 2 wins"); //if counter is greater or equal to 4, player wins
                       flag = false;
                   }
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckXDiagonalForward(){
       //flag
       boolean flag = true;

       //counter
       int counter = 0;

       //check boolean
       Boolean check = false;

       //checkers
       int checkColumn = 1;
       int checkRow = 1;

       while(flag){ //goes through until an X is found
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'X'){ //if X is found, add one to counter and go into loop
                       counter += 1;
                       check = true;
                       while(check){ //goes through diagonally looking for Xs
                           if(checkColumn + w <= WIDTH - 1&& checkRow + h <= HEIGHT - 1){
                               if(board[w + checkColumn][h + checkRow] == 'X'){ //if X is found, add 1 to counter
                                   counter += 1;
                               }
                           }

                           //adds 1 to checkers
                           checkColumn += 1;
                           checkRow += 1;

                           if(checkColumn == WIDTH -1 || checkRow == HEIGHT -1){ //if outside of board, break
                               check = false;
                               break;
                           }

                           if(counter >= 4){
                               System.out.println("Player 1 wins"); //if counter is greater or equal to 4, player wins
                               check = false;
                               flag = false;
                               break;
                           }
                       }
                   }
                   if(counter >= 4){
                       flag = false;
                       break;
                   }

                   //resets counter and checkers
                   counter = 0;
                   checkColumn = 1;
                   checkRow = 1;
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckODiagonalForward(){
       //flag
       boolean flag = true;

       //counter
       int counter = 0;

       //check boolean
       Boolean check = false;

       //checkers
       int checkColumn = 1;
       int checkRow = 1;

       while(flag){ //goes through until an O is found
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'O'){ //if O is found, add one to counter and go into loop
                       counter += 1;
                       check = true;
                       while(check){ //goes through diagonally looking for Os
                           if(checkColumn + w <= WIDTH - 1&& checkRow + h <= HEIGHT - 1){
                               if(board[w + checkColumn][h + checkRow] == 'O'){ //if O is found, add 1 to counter
                                   counter += 1;
                               }
                           }

                           //adds 1 to checkers
                           checkColumn += 1;
                           checkRow += 1;

                           if(checkColumn == WIDTH -1 || checkRow == HEIGHT -1){ //if outside of board, break
                               check = false;
                               break;
                           }

                           if(counter >= 4){
                               System.out.println("Player 2 wins"); //if counter is greater or equal to 4, player wins
                               check = false;
                               flag = false;
                               break;
                           }
                       }
                   }
                   if(counter >= 4){
                       flag = false;
                       break;
                   }

                   //resets counter and checkers
                   counter = 0;
                   checkColumn = 1;
                   checkRow = 1;
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckXDiagonalBack(){
       //flag
       boolean flag = true;

       //counter
       int counter = 0;

       //check boolean
       Boolean check = false;

       //checkers
       int checkColumn = 1;
       int checkRow = 1;

       while(flag){ //goes through until an X is found
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'X'){ //if X is found, add one to counter and go into loop
                       counter += 1;
                       check = true;
                       while(check){ //goes through diagonally looking for Xs
                           if(w - checkColumn >= 0 && h - checkRow >= 0){
                               if(board[w - checkColumn][h - checkRow] == 'X'){
                                   counter += 1; //if X is found, add 1 to counter
                               }
                           }

                           //adds 1 to checkers
                           checkColumn += 1;
                           checkRow += 1;

                           if(checkColumn == 0 || checkRow == HEIGHT -1){ //if outside of board, break
                               check = false;
                               break;
                           }

                           if(counter >= 4){
                               System.out.println("Player 1 wins"); //if counter is greater or equal to 4, player wins
                               check = false;
                               flag = false;
                               break;
                           }
                       }
                   }
                   if(counter >= 4){
                       flag = false;
                       break;
                   }

                   //resets counter and checkers
                   counter = 0;
                   checkColumn = 1;
                   checkRow = 1;
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckODiagonalBack(){
       //flag
       boolean flag = true;

       //counter
       int counter = 0;

       //check boolean
       Boolean check = false;

       //checkers
       int checkColumn = 1;
       int checkRow = 1;

       while(flag){

           //goes through until an O is found
           for(int w = 0; WIDTH > w; w += 1){
               for(int h = 0; HEIGHT > h; h += 1){
                   if(board[w][h] == 'O'){ //if O is found, add one to counter and go into loop
                       counter += 1;
                       check = true;
                       while(check){ //goes through diagonally looking for Os
                           if(w - checkColumn >= 0 && h - checkRow >= 0){
                               if(board[w - checkColumn][h - checkRow] == 'O'){
                                   counter += 1; //if O is found, add 1 to counter
                               }
                           }

                           //adds 1 to checkers
                           checkColumn += 1;
                           checkRow += 1;

                           if(checkColumn == 0 || checkRow == HEIGHT -1){ //if outside of board, break
                               check = false;
                               break;
                           }

                           if(counter >= 4){
                               System.out.println("Player 2 wins"); //if counter is greater or equal to 4, player wins
                               check = false;
                               flag = false;
                               break;
                           }
                       }
                   }
                   if(counter >= 4){
                       flag = false;
                       break;
                   }

                   //resets counter and checkers
                   counter = 0;
                   checkColumn = 1;
                   checkRow = 1;
               }
           }
           break;
       }
       return flag;
   }

   public static boolean CheckX(){
       //creates flag
       boolean flag = true;

       //checks all Xs at once, for clearner main loop
       if(!CheckXVertical() || !CheckXHorizontal()|| !CheckXDiagonalBack()|| !CheckXDiagonalForward()){
           flag = false;
       }
       return flag;
   }

   public static boolean CheckO(){
       //creates flag
       boolean flag = true;

       //checks all Os at once, for clearner main loop
       if(!CheckOVertical() || !CheckOHorizontal() || !CheckODiagonalBack() || !CheckODiagonalForward()){
           flag = false;
       }
       return flag;
   }




  public static void main(String[] args) {
    ConnectFour newGame = new ConnectFour();
    newGame.displayBoard();
  }
}

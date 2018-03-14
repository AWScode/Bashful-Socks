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

  public static void main(String[] args) {//main method
    Connectfour newGame = new Connectfour();

    //newGame.checkFour();
    String player = "2"; //player = 2
    int turnC = 1;
    while (true) {
      if (player.equals("1")) { //if player is 1
        player = "2"; //then player actually equals 2
      }
      else {
        player = "1"; //otherwise player = 1
      }


      Boolean added = false;
      while (!added) {


      Scanner newSc = new Scanner(System.in);//gethers user's input
      newGame.displayBoard();//displays board in whatever form (original or new)
      System.out.println(" ");
      System.out.println(" === Turn " + turnC + " === ");
      System.out.println(" ");
      System.out.println("Player " + player + "s turn.");
      System.out.println(" ");
      System.out.println("Where do you want to play?");
      int col = newSc.nextInt()-1; //user's input minus 1 = the column number used for addPiece
      //-1 in order to let 1 be the first column
      added = newGame.addPiece(col, player);
      if (!added) {
        System.out.println("Column full, please choose another play.");
} //runs method and sets col and player as parameters for addPiece method
}
      newGame.checkFour();//runs the different checkFour methods
      Boolean end = newGame.checkFour();

      turnC++;
      if (end == true) {
        System.out.println("Game Over! ");
        System.out.println("Player " + player + " wins!");
        break;
      }


    } //end of while loop
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
  } //data for the game

  // Get and Set Methods here
  public void getPiece(){//unused method


  }

  // Other methods here
  public void displayBoard(){//method to display the board
    for (int j = 0; j < 6; j++) {//j is row
      String row = "";
      for (int i = 0; i < 7; i++) {//i is column
        row = row + board[i][j] + " ";//know what is happenning but not really how
      }
      System.out.println(row);//prints the board
    }
  }

  public Boolean addPiece(int col, String player) {//method to add a piece. user and column determined in main

    for(int j =5; j>-1; j--){//loops through rows
     if (board[col][j].equals ("0")){//if the space is empty...
       board[col][j] = player;//then replace 0 with whatever player it is (either 1 or 2)
       break;//stop loop
     }
     if (j == 0){
     return false;
   }

     }
     return true;
  }





 public Boolean checkFour(){//method that checks for 4-in-a-rows going in the NW direction
   int c = 0;//c will represent the in-a-rows
   for(int i =0; i<7; i++){//looping through columns
     for (int j = 0; j<6; j++){//and looping through rows
       if (board[i][j].equals("1")){//once found a 1 on the board (the first one found)
         c = 1;

       for (int k=1; k<4; k++){
//UR
         if (j-k > -1){
           if (i+k < 7){

       if (board[i+k][j-k].equals ("0")){//then will look in the NW direction for another 1

         c = 1;//not sure what this does
         break;//stop the loop
     }
     else if (board[i+k][j-k].equals ("2")){
       c = 1;
       break;
     }

     else {
       c++;
       if (c == 4){//when it count to four
         gameOver = true;//the player wins the game
         break;
       }
     }
   }
 }
}


c = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                c = 1;
                break;
              }
              else if (board[i+k][j].equals("2")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          c = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  c = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("2")) {
                  c = 1;
                  break;
                }
                else {
                  c++;
                  if (c == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          c = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                c = 1;
                break;
              }
              else if (board[i][j+k].equals("2")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }


        if (board[i][j].equals("2")) {
          c = 1;
          for (int k = 1; k < 4; k++) {
            //up-right
            if (j-k > -1) {
              if (i + k < 7) {
                if (board[i+k][j-k].equals("0")) {
                  c = 1;
                  break;
                }
                else if (board[i+k][j-k].equals("1")) {
                  c = 1;
                  break;
                }
                else {
                  c++;
                  if (c == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          c = 1;
          for (int k = 1; k < 4; k++) {
            //right
            if (i + k < 7) {
              if (board[i+k][j].equals("0")) {
                c = 1;
                break;
              }
              else if (board[i+k][j].equals("1")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }

            }
          }

          c = 1;
          for (int k = 1; k < 4; k++) {
            //bottom-right
            if (j+k < 6) {
              if (i + k < 7) {
                if (board[i+k][j+k].equals("0")) {
                  c = 1;
                  break;
                }
                else if (board[i+k][j+k].equals("1")) {
                  c = 1;
                  break;
                }
                else {
                  c++;
                  if (c == 4){
                    gameOver = true;
                    break;
                  }
                }
              }
            }
          }
          c = 1;
          for (int k = 1; k < 4; k++) {
            //bottom
            if (j+k < 6) {
              if (board[i][j+k].equals("0")) {
                c = 1;
                break;
              }
              else if (board[i][j+k].equals("1")) {
                c = 1;
                break;
              }
              else {
                c++;
                if (c == 4){
                  gameOver = true;
                  break;
                }
              }
            }
          }
        }
      }
    }
    return gameOver;
  }



}

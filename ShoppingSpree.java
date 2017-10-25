/* ShoppingSpree
Class: ShoppingSpree

Data: Budget($$),
      Inventory (what you bought)

Method: get money --- tells how much money we still have
        get bags --- what we bought
        buy blablabla --- buys a blablabla, and subtract money from budget

        Main method(type main)(kindda like a control) --- type what will prtint out
                                                          have to put other method into main method in order to let it work


*/
import java.util.*;

public class ShoppingSpree {
  int budget;
  ArrayList<String> bags;

  public ShoppingSpree(int) {
    budget = money;
    bags = new ArrayList<String>();
  }

  public int getMoney(){
    return budget;
  }

public void getBags(){
  System.out.print("You have ");
  for (int i = 0; i < bags.size(); i++){
    System.out.print(bags.get (i) + ", ");
  }

  if budget < 100 {
    System.out.println("You don't have a lot of money now!");
  }
  else {
    System.out.println("Do you want to buy more?");
  }

  public void buyClothes(){

    System.out.println("color?");
    Scanner choice = new Scanner;
    String color = choice.nextLine();

    bads.add(color + " clothes");
    budget = budget -18;
}

  public void buyhats(){
    bags.add ("hats");
    budget = budget -30;
  }

  public static void main(String[] args) {

    System.out.println("Wow, you are going to the shopping Mall again?!");
    System.out.println("You are sooooo lucky becasue I will be helping you today~");
    System.out.println("How much money are you willing to spend today?");
    Scanner Choice = new Scanner;
    String a = choice.nestLine()
    System.out.println("great! You have " + a + " dollars today!");
    ShoppingSpree spree = new ShoppingSpree(money);

    spree.buyClothes();
    spree.buyhats();

    System.out.println("Now you have " + budget + "dollars, and you have " + bags + "in you bag!");
  }


}

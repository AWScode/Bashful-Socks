import java.io.*;
import java.util.*;

public class refresher1 {
  public static void main(String[] args)
  {
      File file=new File("Topic.txt");
      ArrayList<String> lowrisk=new ArrayList<String>();
      ArrayList<String> highrisk=new ArrayList<String>();
      HashMap<String,Integer> list2=new HashMap<>();

      try{
        Scanner topic= new Scanner(file);

//scan the topics within the file

        while(topic.hasNextLine()){

//input all the topic into the HashMap

          String name=topic.nextLine();
          if(list2.containsKey(name)){
            int num= list2.get(name);
            num++;
            list2.put(name,num);
          }
          else{
            list2.put(name, 1);
          }
        }
      }
    catch(FileNotFoundException e){
        System.out.println("dont work");
      }



      for(String highriskTopic: list2.keySet()){
        if(list2.get(highriskTopic)<=3){
          highrisk.add(highriskTopic);
        }

}
  for(String lowriskTopic: list2.keySet()){
    if(list2.get(lowriskTopic)>3){
      lowrisk.add(lowriskTopic);
    }
  }

//sort the topics into highrisk/lowrisk catagory

      System.out.println("You find yourself stranded at the watercooler with a group of people. What do you want to say?");
      System.out.println("Please choose 'low-risk', 'high-risk', or 'new-topic'");
      Scanner input = new Scanner (System.in);
      String choice = input.nextLine();

//input the user's choice

      Random rand= new Random();
      int lowMax= lowrisk.size();
      int highMax= highrisk.size();
      String topichoice;

      System.out.print("lowMax : ");
      System.out.println(lowMax);
      if (choice.equals("low-risk")){
        topichoice = lowrisk.get(rand.nextInt(lowMax));

//randomly choose a low risk topic

        System.out.println("So, how's the "+ topichoice +" yesterday night?");
        System.out.println(" Jenny: It's really good");
        System.out.println(" You: I'm glad that you liked it");
        System.out.println(" Bill: Thanks, we will show you more about " + topichoice + " next time!");
      }

    else if (choice.equals("high-risk")&& highMax>0){
      topichoice= highrisk.get(rand.nextInt(highMax));

//randomly choose a highrisk topic

      System.out.println("So, how's the "+ topichoice +" yesterday night?");
      System.out.println("Bill: I think I told you that I don't like it anymore");
      System.out.println("You: Well, sorry. But I really can't remember what you said everytime");
      System.out.println("Bill: Seriously?");
    }

    else if (choice.equals("new-topic")){

//something interesting happened

      System.out.println("You attempt to start a brand new tpic, but some unkonwn force has prevent you from do so.");
      System.out.println("Suddenly, you feel like you just did something you;re not suppose to do.");
      System.out.println("It's like when you try to cheat your way through a video game");
      System.out.println("But ends up getting your save file DELETED");
      System.out.println("You feel like there's something crawling on your back.");
      System.out.println("It is extremely uncomfortable and you want to scream.");
      System.out.println("You think you are suffocating");
      System.out.println("Jenny and Bill are just there, chilling at the water cooler.");
      System.out.println("Other colleges are around, working or slacking");
      System.out.println("You tried to call out for help");
      System.out.println("But nobody answered");
      System.out.println("Your sight starts to get blurry as you feel something fearsome is approaching.");
      System.out.println("As a last resort to escape whatever is after you, you rush twards the window and burst out through those broken glass with the last piece of strenth you have.");
      System.out.println("Your body hits the cold, hard ground.");
      System.out.println("The severe pain start to fade away along with your conucious");
      System.out.println("Before you drown into the void, you heard your college's voice:");
      System.out.println("Bill: Oh my God, they killed [DATA EXPUNGED]!");
      System.out.println("Jenny: You bastards!");
      System.out.println("All of a sudden, you wake up.");
      System.out.println("You can't believe you just fall asleep during working hours.");
      System.out.println("You feel thirsty.");
      System.out.println("You walk twards the water cooler...");
      System.out.println("You feel like you should make some better choice this time...");
    }

    else {
      System.out.println("Your option is not valid in this case, try again.");
}
    }
  }

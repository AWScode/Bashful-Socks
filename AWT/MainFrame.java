/* MainFrame.java by Mr. Considine
This java program displays an example frame
using the java awt library */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class MainFrame extends Frame{

  private Button b;
  private TextField tf;
  private Label name;
  private TextArea ta;
  private Button b2;
  private Choice c;
  private Button b100;
  private Label l1;
  private Label l2;
  private Label l3;
  private Label l4;
  private Label l5;
  private Label l6;
  private Label l7;
  private Label l8;
  private Label l0;
  private Checkbox c1;
  private Checkbox c2;
  private Checkbox c3;
  private Checkbox c4;
  private Checkbox c5;
  private Frame f2;
  private Button order;
  private TextField ordered;
  private TextField ordereded;
  private int r1;
  private int r2;
  private int r3;
  private int r4;
  private int r5;
  private int r6;
  public int fin;
  public String finn;






  public MainFrame() {

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });

//making a place to type your name
    tf = new TextField(" ");
        tf.setBounds(450, 100, 200, 30);
        add(tf);
        tf.setText("Your order");
//making a button to see how much is the price
        b = new Button("Submit");
        b.setBounds(100,550,200,30);
        add(b);
//first make it say your order, but it will change later
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf.setText("your order");
      }
    });





//making a lot of labels
    l0 = new Label("Your Name");
    l0.setBounds(50, 100, 100, 30);
    add(l0);
//making a place to type your name
    ta = new TextArea();
    ta.setBounds(150,100,200,40);
    add(ta);


//labels
    l1 = new Label("Beef Salad 12");
    l1.setBounds(100, 190, 200, 30);
    add(l1);
//making a check box in front of it to check if the costomer wants it
    Checkbox c1 = new Checkbox("Yes");
    c1.setBounds(50, 190, 30, 30);
    this.add(c1);




//more label and ckeck boxs
    l2 = new Label("Chicken Soup 10");
    l2.setBounds(100, 250, 200, 30);
    add(l2);

    Checkbox c2 = new Checkbox("Yes");
    c2.setBounds(50, 250, 30, 30);
    this.add(c2);





    l3 = new Label("Tuna Sandwich 15");
    l3.setBounds(100, 310, 200, 30);
    add(l3);

    Checkbox c3 = new Checkbox("Yes");
    c3.setBounds(50, 310, 30, 30);
    this.add(c3);





    l4 = new Label("Fruit Plate 7");
    l4.setBounds(100, 370, 200, 30);
    add(l4);

    Checkbox c4 = new Checkbox("Yes");
    c4.setBounds(50, 370, 30, 30);
    this.add(c4);




    l5 = new Label("Chocolate Icecream 9");
    l5.setBounds(100, 430, 200, 30);
    add(l5);

    Checkbox c5 = new Checkbox("Yes");
    c5.setBounds(50, 430, 30, 30);
    this.add(c5);





    l6 = new Label("Hot Tea 3");
    l6.setBounds(100, 490, 200, 30);
    add(l6);

    Checkbox c6 = new Checkbox("Yes");
    c6.setBounds(50, 490, 30, 30);
    this.add(c6);





    l7 = new Label("Welcome to Yip's Restaurant");
    l7.setBounds(400, 50, 200, 30);
    add(l7);


    l8 = new Label("Choose your tip");
    l8.setBounds(450, 190, 200, 30);
    add(l8);
//making a list to let the customer to choose how much they want to pay for tip
    c = new Choice();
    c.setBounds(450, 210, 75, 180);
    c.add("10%");
    c.add("12.5%");
    c.add("15%");
    c.add("17.5%");
    c.add("20%");
    add(c);




//calculate the total
//not working though...
    b.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e2){
     String answer = "no selection";
     if (c1.getState()) {
       answer = "12";
       int r1 = Integer.parseInt(answer);
       System.out.println(r1);
       tf.setText(answer);
     }
     if (c2.getState()) {
       answer = "10";
       int r2 = Integer.parseInt(answer);
       System.out.println(r2);
       tf.setText(answer);
     }
     if (c3.getState()) {
       answer = "15";
       int r3 = Integer.parseInt(answer);
       System.out.println(r3);
       tf.setText(answer);
     }
     if (c4.getState()) {
       answer = "7";
       int r4 = Integer.parseInt(answer);
       System.out.println(r4);
       tf.setText(answer);
     }
     if (c5.getState()) {
       answer = "9";
       int r5 = Integer.parseInt(answer);
       System.out.println(r5);
       tf.setText(answer);
     }
     else if (c6.getState()) {
       answer = "3";
       int r6 = Integer.parseInt(answer);
       System.out.println(r6);
       tf.setText(answer);
     }
     System.out.println(answer);
     int fin = r1 + r2 + r3 + r4 + r5 + r6;
     String finn = Integer.toString(fin);
     tf.setText(finn);
     System.out.println(fin);
     System.out.println(r1);
   }
 });

/*
 b2 = new Button("calculate total");
    b2.setBounds(450, 450, 100, 30);
    add(b2);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evev){

     int fin = r1 + r2 + r3 + r4 + r5 + r6;
     String finn = Integer.toString(fin);
     tf.setText(finn);
     System.out.println(fin);
     System.out.println(r1);
   }
 });
*/


//making another button to open another frame to show that the customer have done ordering
 order = new Button("ORDER");
    order.setBounds(450, 550, 100, 30);
    add(order);
    order.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent eve){
        f2.setVisible(true);
        //if "for here", add a label that says (we will be bringing this to you in a moment). if "to go", add label saying (your order will be ready for pick up in 20 min)
      }
    });

//background color
setBackground(new Color(50,80,70));
//set the second frame
f2 = new Frame();
    f2.setSize(400,300);
    f2.setBackground(new Color(50,80,50));
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });
//text that will show up on the second frame
    ordered = new TextField("Your order has been placed.");
    ordered.setBounds(90,100,200,40);
    ordered.setBackground(Color.white);
    f2.add(ordered);

    ordereded = new TextField("Thank you for ordering");
    ordereded.setBounds(35,160,315,40);
    ordereded.setBackground(Color.white);
    f2.add(ordereded);



//first frame size
    setSize(800,700);
    setLayout(null);
    setVisible(true);
    //setBackground();
  }

  public static void main(String[] args) {
    MainFrame m = new MainFrame();

  }
}

/* MainFrame.java by Mr. Considine
This java program displays an example frame
using the java awt library */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
  private Label l0;
  private Checkbox c1;
  private Checkbox c2;
  private Checkbox c3;
  private Checkbox c4;
  private Checkbox c5;
  private Frame f2;
  private Button order;





  public MainFrame() {

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


    tf = new TextField(" ");
        tf.setBounds(450, 100, 200, 30);
        add(tf);
        tf.setText("Your order");

        b = new Button("Submit");
        b.setBounds(100,550,200,30);
        add(b);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        tf.setText("your order");
      }
    });




  /*  tf = new TextField("Welcome to the Restaurant!");
    tf.setBounds(400, 50, 200, 30);
    add(tf);
    tf.setText("Welcome to Yip's Restaurant"); */
    l0 = new Label("Your Name");
    l0.setBounds(50, 100, 100, 30);
    add(l0);

    ta = new TextArea();
    ta.setBounds(150,100,200,40);
    add(ta);


    l1 = new Label("Beef Salad 12");
    l1.setBounds(100, 190, 200, 30);
    add(l1);

    Checkbox c1 = new Checkbox("Yes");
    c1.setBounds(50, 190, 30, 30);
    this.add(c1);



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




    b.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e2){
     String answer = "no selection";
     if (c1.getState()) {
       answer = "12";
       tf.setText(answer);
     }
     if (c2.getState()) {
       answer = "10";
       tf.setText(answer);
     }
     if (c3.getState()) {
       answer = "15";
       tf.setText(answer);
     }
     if (c4.getState()) {
       answer = "7";
       tf.setText(answer);
     }
     if (c5.getState()) {
       answer = "9";
       tf.setText(answer);
     }
     else if (c6.getState()) {
       answer = "3";
       tf.setText(answer);
     }
     System.out.println(answer);
   }
 });

 order = new Button("ORDER");
    order.setBounds(450, 550, 100, 30);
    add(order);
    order.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent eve){
        f2.setVisible(true);
        //if "for here", add a label that says (we will be bringing this to you in a moment). if "to go", add label saying (your order will be ready for pick up in 20 min)
      }
    });


setBackground(new Color(50,80,70));

f2 = new Frame();
    f2.setSize(200,600);
    f2.setBackground(new Color(50,80,50));
    f2.setLayout(null);
    f2.setVisible(false);
    f2.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent windowEvent){
        System.exit(0);
      }
    });


/*
    c = new Choice();
    c.setBounds(5, 120, 75, 180);
    c.add("10%");
    c.add("12.5%");
    c.add("15%");
    c.add("17.5%");
    c.add("20%");
    add(c);
    //ta.addTextListener(new MyTextListener());
    b100 = new Button("Submit");
    b100.setBounds(150, 200, 100, 30);
    add(b100);
    b100.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e2){
        tf.setText("Your name is: " + ta.getText());
      }
    });
*/
    setSize(1000,800);
    setLayout(null);
    setVisible(true);
    //setBackground();
  }
/*
  class MyTextListener implements TextListener {
    public void textValueChanged(TextEvent e) {
      tf.setText("");
    }
  } */
  /*public void addCheckbox() {
    Checkbox check1 = new Checkbox("Yes");
    check1.setBounds(220, 50, 80, 30);
    this.add(check1);
    Checkbox check2 = new Checkbox("No");
    check2.setBounds(220, 75, 80, 30);
    this.add(check2);
  }
*/public String calcTip(String perc) {
    return null;
}

/*
  public void addList() {
    List l = new List(5);
    l.setBounds(320, 60, 45, 180);
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add("e");
    this.add(l);
  }
*/
  public static void main(String[] args) {
    MainFrame m = new MainFrame();





  }
}

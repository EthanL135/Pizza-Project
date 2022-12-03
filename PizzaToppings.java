import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaToppings implements ActionListener {
    JFrame frame = new JFrame();
    JPanel toppingsRow1 = new JPanel();
    JPanel toppingsRow2 = new JPanel();
    JPanel titlePanel = new JPanel();
    JLabel title = new JLabel("Toppings");
    JLabel numOfToppings = new JLabel("Select up to four toppings");
    JButton pepperoni = new JButton("Pepperoni");
    JButton sausage = new JButton("Sausage");
    JButton mushrooms = new JButton("Mushrooms");
    JButton olives = new JButton("Black Olives");
    JButton onions = new JButton("Red Onions");
    JButton peppers = new JButton("Green Peppers");
    JButton ham = new JButton("Ham");
    JButton spinach = new JButton("Spinach");
    JButton chicken = new JButton("Chicken");
    JButton bacon = new JButton("Bacon");
    JLabel pepperoniPrice = new JLabel("+ $0.50");
    JLabel sausagePrice = new JLabel("+ $1.00");
    JLabel mushroomsPrice = new JLabel("+ $0.50");
    JLabel olivesPrice = new JLabel("+ $0.50");
    JLabel onionsPrice = new JLabel("+ $0.50");
    JLabel peppersPrice = new JLabel("+ $0.50");
    JLabel hamPrice = new JLabel("+ $1.00");
    JLabel spinachPrice = new JLabel("+ $0.50");
    JLabel chickenPrice = new JLabel("+ $1.00");
    JLabel baconPrice = new JLabel("+ $1.00");
    JButton nextScreen = new JButton("Next");
    JButton previousScreen = new JButton("Previous");
    JButton clearToppings = new JButton("Clear Toppings");
    JLabel toppingsSelected = new JLabel("Toppings selected: ");
    JLabel maxToppings = new JLabel("Max toppings selected");

    public PizzaToppings(){
        //places panels, labels, and buttons on screen
        toppingsRow1.setBounds(40, 150, 900, 31);
        toppingsRow2.setBounds(40, 214, 900, 31);

        numOfToppings.setBounds(425, 80, 150, 30);

        nextScreen.setBounds(875, 400, 100, 30);
        previousScreen.setBounds(10, 400, 100, 30);
        clearToppings.setBounds(425, 400, 150, 30);

        toppingsSelected.setBounds(400, 365, 400, 30);
        maxToppings.setBounds(400, 335, 150, 30);
        maxToppings.setForeground(Color.RED);

        //adds first 5 toppings to row 1 panel
        toppingsRow1.add(pepperoni);
        toppingsRow1.add(sausage);
        toppingsRow1.add(mushrooms);
        toppingsRow1.add(olives);
        toppingsRow1.add(onions);

        //adds last 5 toppings to row 2 panel
        toppingsRow2.add(peppers);
        toppingsRow2.add(ham);
        toppingsRow2.add(spinach);
        toppingsRow2.add(chicken);
        toppingsRow2.add(bacon);

        //places prices of all toppings under their buttons
        pepperoniPrice.setBounds(260, 180, 50, 30);
        sausagePrice.setBounds(355, 180, 50, 30);
        mushroomsPrice.setBounds(450, 180, 50, 30);
        olivesPrice.setBounds(560, 180, 50, 30);
        onionsPrice.setBounds(670, 180, 50, 30);

        peppersPrice.setBounds(310, 245, 50, 30);
        hamPrice.setBounds(405, 245, 50, 30);
        spinachPrice.setBounds(480, 245, 50, 30);
        chickenPrice.setBounds(570, 245, 50, 30);
        baconPrice.setBounds(645, 245, 50, 30);

        //places title label that says "Toppings"
        titlePanel.setBounds(425, 40, 150, 50);
        titlePanel.add(title);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font(null,Font.PLAIN,25));

        //allows all buttons to do something when pressed
        pepperoni.addActionListener(this);
        sausage.addActionListener(this);
        mushrooms.addActionListener(this);
        olives.addActionListener(this);
        onions.addActionListener(this);
        peppers.addActionListener(this);
        ham.addActionListener(this);
        spinach.addActionListener(this);
        chicken.addActionListener(this);
        bacon.addActionListener(this);
        nextScreen.addActionListener(this);
        previousScreen.addActionListener(this);
        clearToppings.addActionListener(this);

        //adds all panels, labels, and buttons to frame
        frame.setSize(1000, 500);
        frame.add(toppingsRow1);
        frame.add(titlePanel);
        frame.add(toppingsRow2);
        frame.add(pepperoniPrice);
        frame.add(sausagePrice);
        frame.add(mushroomsPrice);
        frame.add(olivesPrice);
        frame.add(onionsPrice);
        frame.add(peppersPrice);
        frame.add(hamPrice);
        frame.add(spinachPrice);
        frame.add(chickenPrice);
        frame.add(baconPrice);
        frame.add(numOfToppings);
        frame.add(nextScreen);
        frame.add(previousScreen);
        frame.add(clearToppings);
        frame.add(toppingsSelected);
        frame.add(maxToppings);

        //set to false by default, will only show up when 4 toppings are selected
        maxToppings.setVisible(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //sets first available pizza topping in Order to selected button
        if(e.getSource() == pepperoni){
            toppingAvailable("pepperoni");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == sausage){
            toppingAvailable("sausage");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == mushrooms){
            toppingAvailable("mushrooms");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == olives){
            toppingAvailable("olives");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == onions){
            toppingAvailable("onions");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == peppers){
            toppingAvailable("peppers");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == ham){
            toppingAvailable("ham");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == spinach){
            toppingAvailable("spinach");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == chicken){
            toppingAvailable("chicken");
            toppingsSelected.setText(toppingsSelectedString());
        }
        if(e.getSource() == bacon){
            toppingAvailable("bacon");
            toppingsSelected.setText(toppingsSelectedString());
        }

        //closes toppings screen and goes to previous or next screen based on which button was pressed
        if(e.getSource() == nextScreen){
            frame.dispose();
            PizzaBeveragesPage b = new PizzaBeveragesPage();
        }
        if(e.getSource() == previousScreen){
            frame.dispose();
            CrustOptions c = new CrustOptions();
        }

        //clears all toppings selected
        if(e.getSource() == clearToppings){
            Order.pizzaTopping1 = null;
            Order.pizzaTopping2 = null;
            Order.pizzaTopping3 = null;
            Order.pizzaTopping4 = null;
            toppingsSelected.setText(toppingsSelectedString());
            maxToppings.setVisible(false);
        }

        //if a topping is selected when there are already 4 toppings selected a max toppings selected message shows up
        if(e.getSource() != nextScreen && e.getSource() != previousScreen && e.getSource() != clearToppings){
            if(Order.pizzaTopping4 != null){
                maxToppings.setVisible(true);
            }
        }
    }

    //checks for the first empty topping variable in Order and sets it to the string passed to the method
    void toppingAvailable(String t){
        if(Order.pizzaTopping1 == null){
            Order.pizzaTopping1 = t;
        }
        else if(Order.pizzaTopping2 == null){
            Order.pizzaTopping2 = t;
        }
        else if(Order.pizzaTopping3 == null){
            Order.pizzaTopping3 = t;
        }
        else if(Order.pizzaTopping4 == null){
            Order.pizzaTopping4 = t;
        }
    }

    //displays the toppings that are currently selected
    String toppingsSelectedString(){
        if(Order.pizzaTopping4 != null){
            return "Toppings selected: " + Order.pizzaTopping1 + ", " + Order.pizzaTopping2 + ", " + Order.pizzaTopping3 + ", " + Order.pizzaTopping4;
        }
        else if(Order.pizzaTopping3 != null){
            return "Toppings selected: " + Order.pizzaTopping1 + ", " + Order.pizzaTopping2 + ", " + Order.pizzaTopping3;
        }
        else if(Order.pizzaTopping2 != null){
            return "Toppings selected: " + Order.pizzaTopping1 + ", " + Order.pizzaTopping2;
        }
        else if(Order.pizzaTopping1 != null){
            return "Toppings selected: " + Order.pizzaTopping1;
        }
        else {
            return "Toppings selected: ";
        }
    }
}


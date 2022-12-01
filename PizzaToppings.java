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

    public PizzaToppings(){
        toppingsRow1.setBounds(40, 150, 900, 31);
        toppingsRow2.setBounds(40, 214, 900, 31);

        numOfToppings.setBounds(425, 80, 150, 30);

        nextScreen.setBounds(875, 400, 100, 30);
        previousScreen.setBounds(10, 400, 100, 30);

        toppingsRow1.add(pepperoni);
        toppingsRow1.add(sausage);
        toppingsRow1.add(mushrooms);
        toppingsRow1.add(olives);
        toppingsRow1.add(onions);

        toppingsRow2.add(peppers);
        toppingsRow2.add(ham);
        toppingsRow2.add(spinach);
        toppingsRow2.add(chicken);
        toppingsRow2.add(bacon);

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

        titlePanel.setBounds(425, 40, 150, 50);
        titlePanel.add(title);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setFont(new Font(null,Font.PLAIN,25));

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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == pepperoni){
            toppingAvailable("pepperoni");
        }
        if(e.getSource() == sausage){
            toppingAvailable("sausage");
        }
        if(e.getSource() == mushrooms){
            toppingAvailable("mushrooms");
        }
        if(e.getSource() == olives){
            toppingAvailable("olives");
        }
        if(e.getSource() == onions){
            toppingAvailable("onions");
        }
        if(e.getSource() == peppers){
            toppingAvailable("peppers");
        }
        if(e.getSource() == ham){
            toppingAvailable("ham");
        }
        if(e.getSource() == spinach){
            toppingAvailable("spinach");
        }
        if(e.getSource() == chicken){
            toppingAvailable("chicken");
        }
        if(e.getSource() == bacon){
            toppingAvailable("bacon");
        }
        if(e.getSource() == nextScreen){
            frame.dispose();
            PizzaBeveragesPage b = new PizzaBeveragesPage();
        }
        if(e.getSource() == previousScreen){
            frame.dispose();
            CrustOptions c = new CrustOptions();
        }
    }

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
}

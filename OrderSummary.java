import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderSummary implements ActionListener {

    JFrame frame = new JFrame();
    JLabel ordersumtitle = new JLabel("ORDER SUMMARY");

    JLabel pizzaSizeDefault = new JLabel("Pizza Size: ");
    JLabel toppingDefault = new JLabel("Topping(s): ");

    JLabel crustDefault = new JLabel("Crust Type: ");

    JLabel beverageDefault = new JLabel("Beverage: ");

    JPanel ordersumPanel = new JPanel();

    JLabel pizzaSize = new JLabel(Order.pizzaSize);
    JPanel pizzaSizePanel = new JPanel();

    JLabel pizzaTopping = new JLabel(Order.pizzaTopping1+" / "+Order.pizzaTopping2+" / "+Order.pizzaTopping3+" / "+Order.pizzaTopping4);
    JPanel pizzaToppingPanel = new JPanel();

    JPanel crustPanel = new JPanel();
    JLabel crust = new JLabel(Order.crustType);

    JPanel beveragePanel = new JPanel();

    JLabel beverageLabel = new JLabel(Order.beverageSize1+" "+Order.beverage1);

    JPanel defaultPizzaSizePanel = new JPanel();

    JPanel defaultToppingsPanel = new JPanel();

    JPanel defaultCrustPanel = new JPanel();

    JPanel defaultBeveragePanel = new JPanel();



    JPanel nextPanel = new JPanel();
    JPanel prePanel = new JPanel();

    JButton nextB = new JButton("NEXT");
    JButton previousB = new JButton("PREVIOUS");

    OrderSummary() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(pizzaSizePanel);
        frame.add(ordersumtitle);
        frame.add(ordersumPanel);
        frame.add(defaultPizzaSizePanel);
        frame.add(toppingDefault);
        frame.add(defaultToppingsPanel);
        frame.add(defaultCrustPanel);
        frame.add(defaultBeveragePanel);
        frame.add(nextPanel);
        frame.add(prePanel);
        frame.add(pizzaToppingPanel);
        frame.add(crustPanel);
        frame.add(beveragePanel);

        ordersumPanel.setBounds(15,0,399,35);
        ordersumtitle.setFont(new Font(null,Font.PLAIN,25));
        ordersumPanel.add(ordersumtitle);



        defaultPizzaSizePanel.setBounds(15,50,100,35);
        defaultPizzaSizePanel.setLayout(new GridLayout(5,2,10,-10));
        defaultPizzaSizePanel.add(pizzaSizeDefault);

        defaultCrustPanel.setBounds(15,100,85,35);
        defaultCrustPanel.setLayout(new GridLayout(5,2,10,-10));
        defaultCrustPanel.add(crustDefault);

        defaultToppingsPanel.setBounds(15,150,80,35);
        defaultToppingsPanel.setLayout(new GridLayout(5,2,10,-10));
        defaultToppingsPanel.add(toppingDefault);

        defaultBeveragePanel.setBounds(15,200,80,35);
        defaultBeveragePanel.setLayout(new GridLayout(5,2,10,-10));
        defaultBeveragePanel.add(beverageDefault);



        // Changing Sizes
        pizzaSizePanel.setBounds(100,50,100,35);
        pizzaSizePanel.setLayout(new GridLayout(5,2,10,-10));
        pizzaSizePanel.add(pizzaSize);

        pizzaToppingPanel.setBounds(100,150,300,35);
        pizzaToppingPanel.setLayout(new GridLayout(5,2,10,-10));
        pizzaToppingPanel.add(pizzaTopping);

        crustPanel.setBounds(100,100,300,35);
        crustPanel.setLayout(new GridLayout(5,2,10,-10));
        crustPanel.add(crust);

        beveragePanel.setBounds(100,200,300,35);
        beveragePanel.setLayout(new GridLayout(5,2,10,-10));
        beveragePanel.add(beverageLabel);



        //button
        //Next panel
        frame.add(nextPanel);
        nextPanel.setBounds(200,250,100, 75);
//        nextPanel.setBackground(Color.GREEN);
        nextPanel.setLayout(new BorderLayout());

        nextPanel.add(nextB);
        nextB.addActionListener(this);

        //Previous panel
        frame.add(prePanel);
        prePanel.setBounds(45,250,100, 75);
//        prePanel.setBackground(Color.GREEN);
        prePanel.setLayout(new BorderLayout());

        prePanel.add(previousB);
        previousB.addActionListener(this);


    }












    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==previousB) {
            frame.dispose();
            BeverageSizes beverageSizes = new BeverageSizes();
            //Load pizza toppings class
        }

        if(e.getSource()==nextB) {
            frame.dispose();
            Receipt receipt = new Receipt();
        }
    }
}
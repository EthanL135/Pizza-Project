import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeverageSizes implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel tPanel = new JPanel();
    JPanel nextPanel = new JPanel();
    JPanel prePanel = new JPanel();

    JLabel bevSizesTitle = new JLabel("Choose Your Beverage Size");

    JButton nextB = new JButton("NEXT");
    JButton previousB = new JButton("PREVIOUS");

    JButton ounce8B =new JButton("8 oz.");
    JButton ounce12B =new JButton("12 oz.");
    JButton ounce16B =new JButton("16 oz.");

    JLabel ounce8L =new JLabel("$1.00");
    JLabel ounce12L =new JLabel("$2.00");
    JLabel ounce16L =new JLabel("$3.00");



    BeverageSizes() {
        frame.setLayout(null);

        frame.add(panel);
        panel.setBounds(45,125,500,200);
//        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(2,3,5,10));

        panel.add(ounce8B);
        ounce8B.addActionListener(this);
        panel.add(ounce12B);
        ounce12B.addActionListener(this);
        panel.add(ounce16B);
        ounce16B.addActionListener(this);

        panel.add(ounce8L);
        panel.add(ounce12L);
        panel.add(ounce16L);

        ounce8L.setHorizontalAlignment(JLabel.CENTER);
        ounce8L.setVerticalAlignment(JLabel.CENTER);

        ounce12L.setHorizontalAlignment(JLabel.CENTER);
        ounce12L.setVerticalAlignment(JLabel.CENTER);

        ounce16L.setHorizontalAlignment(JLabel.CENTER);
        ounce16L.setVerticalAlignment(JLabel.CENTER);

        //Title panel
        frame.add(tPanel);
        tPanel.setBounds(45,20,500, 75);
//        tPanel.setBackground(Color.LIGHT_GRAY);
        tPanel.setLayout(new BorderLayout());

        tPanel.add(bevSizesTitle);
        bevSizesTitle.setFont(new Font(null,Font.BOLD,25));
        bevSizesTitle.setHorizontalAlignment(JLabel.CENTER);
        bevSizesTitle.setVerticalAlignment(JLabel.CENTER);

        //Next panel
        frame.add(nextPanel);
        nextPanel.setBounds(445,325,100, 75);
//        nextPanel.setBackground(Color.GREEN);
        nextPanel.setLayout(new BorderLayout());

        nextPanel.add(nextB);
        nextB.addActionListener(this);

        //Previous panel
        frame.add(prePanel);
        prePanel.setBounds(45,325,100, 75);
//        prePanel.setBackground(Color.GREEN);
        prePanel.setLayout(new BorderLayout());

        prePanel.add(previousB);
        previousB.addActionListener(this);

        //Creates the frame for the window
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==previousB) {
            frame.dispose();
            PizzaBeveragesPage pizzaBeveragesPage = new PizzaBeveragesPage();
            //Load pizza toppings class
        }

        if(e.getSource()==nextB) {
            frame.dispose();
            OrderSummary orderSummary = new OrderSummary();
            //Load next Screen
        }

        if(e.getSource()==ounce8B) {
            bevSizeAvailable("8 oz.");
        }

        if(e.getSource()==ounce12B) {
            bevSizeAvailable("12 oz.");
        }

        if(e.getSource()==ounce16B) {
            bevSizeAvailable("16 oz.");
        }
    }

    void bevSizeAvailable(String s){
        if(Order.beverage1 == null){
            Order.beverage1 = s;
        }
        else if(Order.beverage2 == null){
            Order.beverage2 = s;
        }
        else if(Order.beverage3 == null){
            Order.beverage3 = s;
        }
    }
}
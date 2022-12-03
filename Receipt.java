import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Receipt implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel tPanel = new JPanel();
    JPanel exitPanel = new JPanel();

    JLabel receiptTitle = new JLabel("Receipt");

    JLabel orderFNameL = new JLabel("Order First Name");
    JLabel orderLNameL = new JLabel("Order Last Name");
    JLabel cardNumL = new JLabel("Card");
    JLabel deliveryAddressL = new JLabel("Delivery Address");
    JLabel phoneNumL = new JLabel("Pickup Phone #");

    JTextField orderFNameF = new JTextField();
    JTextField orderLNameF = new JTextField();
    JTextField cardNumF = new JTextField();
    JTextField deliveryAddressF = new JTextField();
    JTextField phoneNumF = new JTextField();

    JLabel orderSummaryLabel = new JLabel("Order Summary");
    JLabel order1SumLabel = new JLabel("Item #1 Summary..");
    JLabel subTotal = new JLabel("Subtotal: $00.00");
    JLabel taxTotal = new JLabel("Tax: $00.00");
    JLabel total = new JLabel("Total: $00.00");

    JButton exitButton = new JButton("EXIT");
    
    File cDatabase = new File("/CSE 1322/Labs/GUI/src/Customer Info Database.txt");
    Scanner scan = new Scanner(cDatabase);
    String[] databaseArray;

    Receipt() {
        frame.setLayout(null);
        
        TotalCost t = new TotalCost();
        t.orderTotal();
        subTotal.setText("Subtotal: $" + String.valueOf(t.subtotal));
        taxTotal.setText("Tax: $" + String.valueOf(Math.round(t.tax * 100.0) / 100.0));
        total.setText("Total: $" + String.valueOf(Math.round(t.total * 100.0) / 100.0));

        //Panel 1
        frame.add(panel);
        panel.setBounds(45,125,250,250);
//        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(5,2,5,10));

        panel.add(orderFNameL);
        panel.add(orderFNameF);
        panel.add(orderLNameL);
        panel.add(orderLNameF);
        panel.add(cardNumL);
        panel.add(cardNumF);
        panel.add(deliveryAddressL);
        panel.add(deliveryAddressF);
        panel.add(phoneNumL);
        panel.add(phoneNumF);

        orderFNameL.setHorizontalAlignment(JLabel.CENTER);
        orderFNameL.setVerticalAlignment(JLabel.CENTER);

        orderLNameL.setHorizontalAlignment(JLabel.CENTER);
        orderLNameL.setVerticalAlignment(JLabel.CENTER);

        cardNumL.setHorizontalAlignment(JLabel.CENTER);
        cardNumL.setVerticalAlignment(JLabel.CENTER);

        deliveryAddressL.setHorizontalAlignment(JLabel.CENTER);
        deliveryAddressL.setVerticalAlignment(JLabel.CENTER);

        phoneNumL.setHorizontalAlignment(JLabel.CENTER);
        phoneNumL.setVerticalAlignment(JLabel.CENTER);
        
         if(scan.hasNextLine()) {
            databaseArray = scan.nextLine().split(",");

            orderFNameF.setText(databaseArray[0]);
            orderLNameF.setText(databaseArray[1]);
            cardNumF.setText(databaseArray[6]);
            deliveryAddressF.setText(databaseArray[5]);
            phoneNumF.setText(databaseArray[2]);
        }

        //Panel 2
        frame.add(panel2);
        panel2.setBounds(300,125,250,250);
//        panel2.setBackground(Color.CYAN);
        panel2.setLayout(new GridLayout(5,1,5,10));

        panel2.add(orderSummaryLabel);
        panel2.add(order1SumLabel);
        panel2.add(subTotal);
        panel2.add(taxTotal);
        panel2.add(total);

        orderSummaryLabel.setHorizontalAlignment(JLabel.CENTER);
        orderSummaryLabel.setVerticalAlignment(JLabel.CENTER);

        order1SumLabel.setHorizontalAlignment(JLabel.CENTER);
        order1SumLabel.setVerticalAlignment(JLabel.CENTER);

        subTotal.setHorizontalAlignment(JLabel.CENTER);
        subTotal.setVerticalAlignment(JLabel.CENTER);

        taxTotal.setHorizontalAlignment(JLabel.CENTER);
        taxTotal.setVerticalAlignment(JLabel.CENTER);

        total.setHorizontalAlignment(JLabel.CENTER);
        total.setVerticalAlignment(JLabel.CENTER);

        //Title panel
        frame.add(tPanel);
        tPanel.setBounds(45,20,500, 75);
//        tPanel.setBackground(Color.LIGHT_GRAY);
        tPanel.setLayout(new BorderLayout());

        tPanel.add(receiptTitle);
        receiptTitle.setFont(new Font(null,Font.BOLD,25));
        receiptTitle.setHorizontalAlignment(JLabel.CENTER);
        receiptTitle.setVerticalAlignment(JLabel.CENTER);

        //Previous panel
        frame.add(exitPanel);
        exitPanel.setBounds(250,380,100, 75);
//        prePanel.setBackground(Color.GREEN);
        exitPanel.setLayout(new BorderLayout());

        exitPanel.add(exitButton);
        exitButton.addActionListener(this);

        //Creates the frame for the window
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exitButton) {
            frame.dispose();
        }
    }
}

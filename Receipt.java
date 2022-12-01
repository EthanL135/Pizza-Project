import javax.swing.*;
import java.awt.*;

public class Receipt {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel tPanel = new JPanel();
    JPanel exitPanel = new JPanel();

    JLabel receiptTitle = new JLabel("Receipt");

    JLabel orderFName = new JLabel();
    JLabel orderFName = new JLabel();
    JLabel orderFName = new JLabel();
    JLabel orderFName = new JLabel();
    JLabel orderFName = new JLabel();

    Receipt() {
        frame.setLayout(null);

        frame.add(panel);
        panel.setBounds(45,125,500,200);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(5,2,5,10));



        //Creates the frame for the window
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

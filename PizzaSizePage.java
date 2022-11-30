import javax.swing.*;
import java.awt.*;

public class PizzaSizePage {

    JFrame frame = new JFrame();
    JLabel pToppingsLabel = new JLabel("PIZZA TOPPINGS");

    PizzaSizePage() {

        pToppingsLabel.setBounds(0,0,200,35);
        pToppingsLabel.setFont(new Font(null,Font.PLAIN,25));

        frame.add(pToppingsLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

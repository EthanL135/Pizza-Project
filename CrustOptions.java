import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CrustOptions implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel titlePanel = new JPanel();
    JLabel crustLabel = new JLabel("Pizza Crust");
    JLabel extraCost = new JLabel("+ $1.00");
    JLabel extraCost2 = new JLabel("+ $0.50");
    JLabel extraCost3 = new JLabel("+ $0.25");
    JLabel extraCost4 = new JLabel("+ $0.25");
    JButton regularCrust = new JButton("Regular");
    JButton thinCrust = new JButton("Thin");
    JButton thickCrust = new JButton("Thick");
    JButton cheeseCrust = new JButton("Cheese filled");
    JButton nextScreen = new JButton("Next");
    JButton previousScreen = new JButton("Previous");


    public CrustOptions(){
        //sets the "Pizza Crust" label to the top middle of the screen
        crustLabel.setBounds(50, 20, 400, 75);
        crustLabel.setLayout(new BorderLayout());
        crustLabel.setFont(new Font(null,Font.PLAIN,25));
        crustLabel.setHorizontalAlignment(JLabel.CENTER);
        crustLabel.setVerticalAlignment(JLabel.CENTER);

        //prices under all the crust options
        extraCost.setBounds(325, 275, 100, 30);
        extraCost2.setBounds(235, 275, 100, 30);
        extraCost3.setBounds(170, 275, 100, 30);
        extraCost4.setBounds(100, 275, 100, 30);

        //panel containing all the crust buttons
        panel.setBounds(40,250,400,31);

        //panel containing label saying "Pizza Crust"
        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(135,50,200,50);
        titlePanel.add(crustLabel);

        //allows all buttons to do something when pressed
        regularCrust.addActionListener(this);
        thinCrust.addActionListener(this);
        thickCrust.addActionListener(this);
        cheeseCrust.addActionListener(this);
        nextScreen.addActionListener(this);
        previousScreen.addActionListener(this);

        //places next and previous buttons at the bottom right and left of the screen
        nextScreen.setBounds(375, 400, 100, 30);
        previousScreen.setBounds(10, 400, 100, 30);

        //adds all crust buttons to panel
        panel.add(regularCrust);
        panel.add(thinCrust);
        panel.add(thickCrust);
        panel.add(cheeseCrust);

        //adds all panels, labels, and buttons to frame
        frame.add(panel);
        frame.add(titlePanel);
        frame.add(nextScreen);
        frame.add(previousScreen);
        frame.add(extraCost);
        frame.add(extraCost2);
        frame.add(extraCost3);
        frame.add(extraCost4);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //sets crustType in Order class based on which crust was selected
        if(e.getSource() == regularCrust){
            Order.crustType = "regular";
        }
        if(e.getSource() == thinCrust){
            Order.crustType = "thin";
        }
        if(e.getSource() == thickCrust){
            Order.crustType = "thick";
        }
        if(e.getSource() == cheeseCrust){
            Order.crustType = "cheese";
        }

        //closes crust options screen and goes to previous or next screen based on which button was pressed
        if(e.getSource() == nextScreen){
            frame.dispose();
            PizzaToppings p = new PizzaToppings();
        }
        if(e.getSource() == previousScreen){
            frame.dispose();
            PizzaSizePage p = new PizzaSizePage();
        }
    }
}

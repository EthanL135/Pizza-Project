import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzaBeveragesPage extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel tPanel = new JPanel();
    JPanel nextPanel = new JPanel();
    JPanel prePanel = new JPanel();

    JLabel bevTitle = new JLabel("Choose Your Beverage");

    JButton cokeB = new JButton("Coca-Cola");
    JButton waterB = new JButton("Water");
    JButton lemonadeB = new JButton("Lemonade");
    JButton sweetTeaB = new JButton("Sweet Tea");
    JButton rootBeerB = new JButton("Root Beer");

    JLabel cokeL = new JLabel("1");
    JLabel waterL = new JLabel("2");
    JLabel lemonadeL = new JLabel("3");
    JLabel sweetTeaL = new JLabel("4");
    JLabel rootBeerL = new JLabel("5");

    Image cokeI = new ImageIcon("Pizza.jpg").getImage();

    JButton nextB = new JButton("NEXT");
    JButton previousB = new JButton("PREVIOUS");

    PizzaBeveragesPage() {
        frame.setLayout(null);

        frame.add(panel);
        panel.setBounds(45,125,500,200);
//        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(2,5,5,10));

        panel.add(cokeB);
        panel.add(waterB);
        panel.add(lemonadeB);
        panel.add(sweetTeaB);
        panel.add(rootBeerB);

        panel.add(cokeL);
        panel.add(waterL);
        panel.add(lemonadeL);
        panel.add(sweetTeaL);
        panel.add(rootBeerL);

        cokeL.setHorizontalAlignment(JLabel.CENTER);
        cokeL.setVerticalAlignment(JLabel.CENTER);

        waterL.setHorizontalAlignment(JLabel.CENTER);
        waterL.setVerticalAlignment(JLabel.CENTER);

        lemonadeL.setHorizontalAlignment(JLabel.CENTER);
        lemonadeL.setVerticalAlignment(JLabel.CENTER);

        sweetTeaL.setHorizontalAlignment(JLabel.CENTER);
        sweetTeaL.setVerticalAlignment(JLabel.CENTER);

        rootBeerL.setHorizontalAlignment(JLabel.CENTER);
        rootBeerL.setVerticalAlignment(JLabel.CENTER);

        //Title panel
        frame.add(tPanel);
        tPanel.setBounds(45,20,500, 75);
//        tPanel.setBackground(Color.LIGHT_GRAY);
        tPanel.setLayout(new BorderLayout());

        tPanel.add(bevTitle);
        bevTitle.setFont(new Font(null,Font.BOLD,25));
        bevTitle.setHorizontalAlignment(JLabel.CENTER);
        bevTitle.setVerticalAlignment(JLabel.CENTER);

        //Next panel
        frame.add(nextPanel);
        nextPanel.setBounds(445,325,100, 75);
//        nextPanel.setBackground(Color.GREEN);
        nextPanel.setLayout(new BorderLayout());

        nextPanel.add(nextB);

        //Previous panel
        frame.add(prePanel);
        prePanel.setBounds(45,325,100, 75);
//        prePanel.setBackground(Color.GREEN);
        prePanel.setLayout(new BorderLayout());

        prePanel.add(previousB);

        //Creates the frame for the window
        frame.setSize(600,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(cokeI,0,0,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==previousB) {
            frame.dispose();
            //Load pizza toppings class
        }

        if(e.getSource()==nextB) {
            frame.dispose();
            BeverageSizes beverageSizes = new BeverageSizes();
        }

        if(e.getSource()==cokeB) {

        }

        if(e.getSource()==waterB) {

        }

        if(e.getSource()==lemonadeB) {

        }

        if(e.getSource()==sweetTeaB) {

        }

        if(e.getSource()==rootBeerB) {

        }
    }
}

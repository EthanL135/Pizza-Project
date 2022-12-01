import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PizzaSizePage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel pToppingsLabel = new JLabel("PIZZA SIZE");
    JPanel panelSmall = new JPanel();
    JPanel panelMedium = new JPanel();
    JPanel panelLarge = new JPanel();

    JPanel panelPersonal = new JPanel();

    JPanel panelSmallCost = new JPanel();
    JPanel panelMediumCost = new JPanel();

    JPanel panelLargeCost = new JPanel();

    JPanel panelPersonalCost = new JPanel();
    JLabel smallCostLabel = new JLabel("$10.99");
    JLabel mediumCostLabel = new JLabel("$14.99");
    JLabel largeCostLabel = new JLabel("$19.99");

    JLabel personalCostLabel = new JLabel("$7.99");

    JButton smallSizeButton = new JButton("Small");
    JButton mediumSizeButton = new JButton("Medium");
    JButton largeSizeButton = new JButton("Large");

    JButton personalSizeButton = new JButton("Personal");
    PizzaSizePage() {

        pToppingsLabel.setBounds(15,0,200,35);
        pToppingsLabel.setFont(new Font(null,Font.PLAIN,25));

        frame.add(pToppingsLabel);
        frame.add(panelSmall);
        frame.add(panelMedium);
        frame.add(panelSmallCost);
        frame.add(panelMediumCost);
        frame.add(panelLarge);
        frame.add(panelLargeCost);
        frame.add(personalSizeButton);
        frame.add(personalCostLabel);
        frame.add(panelPersonal);
        frame.add(panelPersonalCost);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        panelPersonal.setBounds(15,50,200,100);
        panelPersonal.setLayout(new GridLayout(5,2,10,5));


        panelSmall.setBounds(15,100,200,100);
        panelSmall.setLayout(new GridLayout(5,2,10,5));

        panelMedium.setBounds(15,150,200,100);
        panelMedium.setLayout(new GridLayout(5,2,10,5));

        panelLarge.setBounds(15,200,200,100);
        panelLarge.setLayout(new GridLayout(5,2,10,5));


        panelPersonal.add(personalSizeButton);
        personalSizeButton.setHorizontalAlignment(JLabel.CENTER);
        personalSizeButton.setVerticalAlignment(JLabel.CENTER);

        panelSmall.add(smallSizeButton);
        smallSizeButton.setHorizontalAlignment(JLabel.CENTER);
        smallSizeButton.setVerticalAlignment(JLabel.CENTER);

        panelMedium.add(mediumSizeButton);
        mediumSizeButton.setHorizontalAlignment(JLabel.CENTER);
        mediumSizeButton.setVerticalAlignment(JLabel.CENTER);

        panelLarge.add(largeSizeButton);
        largeSizeButton.setHorizontalAlignment(JLabel.CENTER);
        largeSizeButton.setVerticalAlignment(JLabel.CENTER);


        panelSmall.setBounds(15,100,200,100);
        panelSmall.setLayout(new GridLayout(5,2,10,5));

        panelSmallCost.setBounds(220,100,200,100);
        panelSmallCost.setLayout(new GridLayout(5,2,10,5));
        panelSmallCost.add(smallCostLabel);

        panelPersonalCost.setBounds(220,50,200,100);
        panelPersonalCost.setLayout(new GridLayout(5,2,10,5));
        panelPersonalCost.add(personalCostLabel);

        panelMediumCost.setBounds(220,150,200,100);
        panelMediumCost.setLayout(new GridLayout(5,2,10,5));
        panelMediumCost.add(mediumCostLabel);

        panelLargeCost.setBounds(220,200,200,100);
        panelLargeCost.setLayout(new GridLayout(5,2,10,5));
        panelLargeCost.add(largeCostLabel);


        personalSizeButton.addActionListener(this);
        smallSizeButton.addActionListener(this);
        mediumSizeButton.addActionListener(this);
        largeSizeButton.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==personalSizeButton) {
            Order.pizzaSize = "Personal";
            frame.dispose();
            CrustOptions crustOptions = new CrustOptions();
        }
        if (e.getSource()==smallSizeButton){
            Order.pizzaSize="Small";
            frame.dispose();
            CrustOptions crustOptions = new CrustOptions();
        }
        if (e.getSource()==mediumSizeButton){
            Order.pizzaSize="Medium";
            frame.dispose();
            CrustOptions crustOptions = new CrustOptions();
        }
        if (e.getSource()==largeSizeButton){
            Order.pizzaSize="Large";
            frame.dispose();
            CrustOptions crustOptions = new CrustOptions();
        }

    }
}

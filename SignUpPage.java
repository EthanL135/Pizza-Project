import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpPage implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel tPanel = new JPanel();
    JPanel signUpPanel = new JPanel();
    JPanel backToSignInPanel = new JPanel();

    JLabel signUpTitle = new JLabel("SIGN UP");

    JLabel fNameL = new JLabel("First Name");
    JLabel lNameL = new JLabel("Last Name");
    JLabel pNumL = new JLabel("Phone Number");
    JLabel passwordL = new JLabel("Password");
    JLabel reTypePassL = new JLabel("Re-Type Password");
    JLabel deliveryAddressL = new JLabel("Delivery Address");
    JLabel cardNumL = new JLabel("Visa/MasterCard Number");
    JLabel cardExpDateL = new JLabel("Expiration Date");
    JLabel cardCvvL = new JLabel("CVV");

    JTextField fNameF = new JTextField();
    JTextField lNameF = new JTextField();
    JTextField pNumF = new JTextField();
    JTextField passwordF = new JTextField();
    JTextField reTypePassF = new JTextField();
    JTextField deliveryAddressF = new JTextField();
    JTextField cardNumF = new JTextField();
    JTextField cardExpDateF = new JTextField();
    JTextField cardCvvF = new JTextField();

    JButton signInB = new JButton("Sign In?");
    JButton signUpB = new JButton("Sign Up/To Order");

    CustomerInfo customerInfo = new CustomerInfo();

    SignUpPage() {
        frame.setLayout(null);

        frame.add(panel);
        panel.setBounds(125,100,325,350);
//        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new GridLayout(9,2,5,10));

        panel.add(fNameL);
        panel.add(fNameF);

        panel.add(lNameL);
        panel.add(lNameF);

        panel.add(pNumL);
        panel.add(pNumF);

        panel.add(passwordL);
        panel.add(passwordF);

        panel.add(reTypePassL);
        panel.add(reTypePassF);

        panel.add(deliveryAddressL);
        panel.add(deliveryAddressF);

        panel.add(cardNumL);
        panel.add(cardNumF);

        panel.add(cardExpDateL);
        panel.add(cardExpDateF);

        panel.add(cardCvvL);
        panel.add(cardCvvF);

        fNameL.setHorizontalAlignment(JLabel.CENTER);
        fNameL.setVerticalAlignment(JLabel.CENTER);

        lNameL.setHorizontalAlignment(JLabel.CENTER);
        lNameL.setVerticalAlignment(JLabel.CENTER);

        pNumL.setHorizontalAlignment(JLabel.CENTER);
        pNumL.setVerticalAlignment(JLabel.CENTER);

        passwordL.setHorizontalAlignment(JLabel.CENTER);
        passwordL.setVerticalAlignment(JLabel.CENTER);

        reTypePassL.setHorizontalAlignment(JLabel.CENTER);
        reTypePassL.setVerticalAlignment(JLabel.CENTER);

        deliveryAddressL.setHorizontalAlignment(JLabel.CENTER);
        deliveryAddressL.setVerticalAlignment(JLabel.CENTER);

        cardNumL.setHorizontalAlignment(JLabel.CENTER);
        cardNumL.setVerticalAlignment(JLabel.CENTER);

        cardExpDateL.setHorizontalAlignment(JLabel.CENTER);
        cardExpDateL.setVerticalAlignment(JLabel.CENTER);

        cardCvvL.setHorizontalAlignment(JLabel.CENTER);
        cardCvvL.setVerticalAlignment(JLabel.CENTER);

        //Title panel
        frame.add(tPanel);
        tPanel.setBounds(45,20,500, 75);
//        tPanel.setBackground(Color.GREEN);
        tPanel.setLayout(new BorderLayout());

        tPanel.add(signUpTitle);
        signUpTitle.setFont(new Font(null,Font.BOLD,25));
        signUpTitle.setHorizontalAlignment(JLabel.CENTER);
        signUpTitle.setVerticalAlignment(JLabel.CENTER);

        //Back to sign in panel
        frame.add(backToSignInPanel);
        backToSignInPanel.setBounds(125,470,100, 75);
//        prePanel.setBackground(Color.GREEN);
        backToSignInPanel.setLayout(new BorderLayout());

        backToSignInPanel.add(signInB);
        signInB.addActionListener(this);


        //To order panel
        frame.add(signUpPanel);
        signUpPanel.setBounds(300,470,150, 75);
//        prePanel.setBackground(Color.GREEN);
        signUpPanel.setLayout(new BorderLayout());

        signUpPanel.add(signUpB);
        signUpB.addActionListener(this);


        //Creates the frame for the window
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signInB) {
            frame.dispose();
            LoginPage loginPage = new LoginPage(customerInfo.getSignInInfo());
        }

        if(e.getSource()==signUpB) {
            frame.dispose();
            //Load pizza size class
        }
    }
}

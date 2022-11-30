import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton signInButton = new JButton("Sign In");
    JButton clearButton = new JButton("Clear");

    JLabel customerPhoneNumLabel = new JLabel("Phone Number");
    JTextField customerPhoneNum = new JTextField();

    JLabel customerPassLabel = new JLabel("Password");
    JPasswordField customerPass = new JPasswordField();

    JLabel messageLabel = new JLabel("");


    HashMap<String,String> signInInfo = new HashMap<String,String>();

    LoginPage(HashMap<String,String> cSignInInfo) {
        signInInfo = cSignInInfo;

        //Sets Text Label Bounds
        customerPhoneNumLabel.setBounds(35,100,90,25);
        customerPassLabel.setBounds(35,150,90,25);
        messageLabel.setBounds(125,250,250,35);

        //Sets Text Field Bounds
        customerPhoneNum.setBounds(140,100,200,25);
        customerPass.setBounds(140,150,200,25);

        //Sets Button Bounds
        signInButton.setBounds(140,200,100,25);
        signInButton.addActionListener(this);
        clearButton.setBounds(240,200,100,25);
        clearButton.addActionListener(this);

        //Adds Text Labels
        frame.add(customerPhoneNumLabel);
        frame.add(customerPassLabel);
        frame.add(messageLabel);

        //Adds Text fields
        frame.add(customerPhoneNum);
        frame.add(customerPass);

        //Adds Buttons
        frame.add(signInButton);
        frame.add(clearButton);

        //Creates the frame for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clearButton) {
            customerPhoneNum.setText("");
            customerPass.setText("");
        }

        if(e.getSource()==signInButton) {
            String cPhoneNum = customerPhoneNum.getText();
            String cpassword = String.valueOf(customerPass.getPassword());

            if(signInInfo.containsKey(cPhoneNum)) {
                if(signInInfo.get(cPhoneNum).equals(cpassword)) {
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Sign In Successful");

                    frame.dispose();
                    PizzaSizePage pizzaSizePage = new PizzaSizePage();
                } else {
                    messageLabel.setForeground(Color.RED);
                    messageLabel.setText("Incorrect Password");
                }
            } else {
                messageLabel.setForeground(Color.RED);
                messageLabel.setText("Phone Number Not Found");
            }
        }
    }
}

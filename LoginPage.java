import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage extends JPanel implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JPanel title = new JPanel();

    JLabel titleLabel = new JLabel("Login Page");

//    Image pizzaBg = new ImageIcon("Pizza.jpg").getImage();

    JButton signInButton = new JButton("Sign In");
    JButton clearButton = new JButton("Clear");
    JButton signUpButton = new JButton("Sign Up");

    JLabel customerPhoneNumLabel = new JLabel("Phone Number");
    JTextField customerPhoneNum = new JTextField();

    JLabel customerPassLabel = new JLabel("Password");
    JPasswordField customerPass = new JPasswordField();

    JLabel messageLabel = new JLabel("");
    JLabel signUpLabel = new JLabel("New Customer? Sign up Here: ");


    HashMap<String,String> signInInfo;

    LoginPage(HashMap<String,String> cSignInInfo) {
        signInInfo = cSignInInfo;

        frame.setLayout(null);
        frame.setSize(500,350);
        frame.setBackground(Color.BLACK);
        frame.add(title);
        frame.add(panel);

        title.setLayout(new BorderLayout());
        title.setBounds(50,20,400,75);

        titleLabel.setFont(new Font(null,Font.BOLD,50));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setVerticalAlignment(JLabel.CENTER);
        title.add(titleLabel);

        panel.setBounds(50,125,400,150);
        panel.setLayout(new GridLayout(5,2,10,5));

        panel.add(customerPhoneNumLabel);
        panel.add(customerPhoneNum);

        panel.add(customerPassLabel);
        panel.add(customerPass);

        panel.add(signInButton);
        signInButton.addActionListener(this);
        panel.add(clearButton);
        clearButton.addActionListener(this);

        panel.add(signUpLabel);
        panel.add(signUpButton);
        panel.add(messageLabel);

        customerPhoneNumLabel.setHorizontalAlignment(JLabel.CENTER);
        customerPhoneNumLabel.setVerticalAlignment(JLabel.CENTER);

        customerPassLabel.setHorizontalAlignment(JLabel.CENTER);
        customerPassLabel.setVerticalAlignment(JLabel.CENTER);

        signUpLabel.setHorizontalAlignment(JLabel.CENTER);
        signUpLabel.setVerticalAlignment(JLabel.CENTER);

        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setVerticalAlignment(JLabel.CENTER);

        //Creates the frame for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //frame.pack();
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
//    public void paint(Graphics g) {
//        super.paint(g);
//        Graphics2D g2D = (Graphics2D) g;
//        g2D.drawImage(pizzaBg,0,0,null);
//    }
}

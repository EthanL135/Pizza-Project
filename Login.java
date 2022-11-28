import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel phoneNumberLabel, passwordLabel, success;
    private static JTextField phoneNumberText;
    private static JPasswordField passwordText;
    private static JButton signInButton;

    public static void main(String[] args) {
        frame = new JFrame();
        panel = new JPanel();

        //Sets frame size and centers it to the screen
        frame.setSize(1000, 600);
        centerFrame(frame);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberLabel.setBounds(10, 20, 80, 25);
        panel.add(phoneNumberLabel);

        phoneNumberText = new JTextField(20);
        phoneNumberText.setBounds(100, 20, 165, 25);
        panel.add(phoneNumberText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        signInButton = new JButton("Sign In");
        signInButton.setBounds(10, 80, 80, 25);
        signInButton.addActionListener(new Login());
        panel.add(signInButton);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String phoneNum = phoneNumberText.getText();
        String password = passwordText.getText();

        if(phoneNum.equals("4046958363") && password.equals("tioluis")) {
            success.setText("Sign In Successful!!");
        } else {
            success.setText(null);
        }
    }

    //Method centers the given frame to your screen
    public static void centerFrame(JFrame myFrame) {

        //Gets the size of the screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        //Determines the new location to center the frame
        int w = myFrame.getSize().width;
        int h = myFrame.getSize().height;
        int x = (dimension.width - w) / 2;
        int y = (dimension.height - h) / 2;

        //Moves the frame to the new location
        myFrame.setLocation(x, y);
    }
}

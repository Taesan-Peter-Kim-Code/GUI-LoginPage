
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JFrame frame;
    

    public static void main(String[] args) throws Exception {
        
        JPanel panel = new JPanel();
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 500, 25);
        panel.add(success);
        
        frame.setVisible(true);


    }
    @Override
    public void actionPerformed (ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Taesan") && password.equals("Taesancode123")) {
            success.setText("Login successful!");
            JOptionPane.showMessageDialog(frame, "You are successfully logined", "Login Succeed" , JOptionPane.YES_OPTION);
        } else {
            success.setText("Your username or password is wrong! Try it again!");
            JOptionPane.showMessageDialog(frame, "Invalid username or password", "Invalid login", JOptionPane.NO_OPTION);
        }

    }

}

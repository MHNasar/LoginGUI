import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The LoginGUI class extends JFrame to create a GUI window and implements ActionListener to handle button clicks.
public class LoginGUI extends JFrame implements ActionListener {
    // Private fields for the username text field, password field, and login button.
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Constructor for the LoginGUI class.
    public LoginGUI() {
        // Set the title and size of the window, and specify what happens when the
        // window is closed.
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with a grid layout to organize the components.
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Create labels and fields for the username and password.
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        // Create a login button and add an ActionListener to handle its clicks.
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        // Add the components to the panel.
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        // Add the panel to the frame and make the frame visible.
        add(panel);
        setVisible(true);
    }

    // The main method creates an instance of LoginGUI to start the application.
    public static void main(String[] args) {
        new LoginGUI();
    }

    // The actionPerformed method is called when the login button is clicked.
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text entered in the username and password fields.
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Check if the username and password match the expected values.
        if (username.equals("admin") && password.equals("admin")) {
            // If the login is successful, show a message dialog.
            JOptionPane.showMessageDialog(this, "Login successful");
        } else {
            // If the login fails, show a message dialog.
            JOptionPane.showMessageDialog(this, "Login failed");
        }
    }
}

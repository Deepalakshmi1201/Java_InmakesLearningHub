import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.HashMap;

public class BankingApplication extends JFrame {
    private HashMap<String, String> users; // User credentials storage (username, password)
    private String currentUser; // Current logged-in user
    private JTextArea textArea;
    private JFileChooser fileChooser;

    public BankingApplication() {
        setTitle("Banking Application");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        users = new HashMap<>();
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openAccountMenuItem = new JMenuItem("Open Account");
        openAccountMenuItem.addActionListener(new OpenAccountMenuItemListener());
        fileMenu.add(openAccountMenuItem);

        JMenuItem printBalanceMenuItem = new JMenuItem("Print Customer Balance");
        printBalanceMenuItem.addActionListener(new PrintBalanceMenuItemListener());
        fileMenu.add(printBalanceMenuItem);

        JMenuItem quitMenuItem = new JMenuItem("Quit Bank System");
        quitMenuItem.addActionListener(new QuitMenuItemListener());
        fileMenu.add(quitMenuItem);

        fileChooser = new JFileChooser();

        JPanel loginPanel = new JPanel(new GridLayout(3, 2));
        JLabel loginLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (users.containsKey(username) && users.get(username).equals(password)) {
                    JOptionPane.showMessageDialog(BankingApplication.this, "Login Successful!");
                    currentUser = username;
                    usernameField.setText("");
                    passwordField.setText("");
                    // Implement banking functionalities or switch to another panel here
                } else {
                    JOptionPane.showMessageDialog(BankingApplication.this, "Invalid Username or Password");
                }
            }
        });
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (!users.containsKey(username)) {
                    users.put(username, password);
                    JOptionPane.showMessageDialog(BankingApplication.this, "Account Created Successfully!");
                    currentUser = username;
                    usernameField.setText("");
                    passwordField.setText("");
                    // Implement banking functionalities or switch to another panel here
                } else {
                    JOptionPane.showMessageDialog(BankingApplication.this, "Username already exists!");
                }
            }
        });

        loginPanel.add(loginLabel);
        loginPanel.add(usernameField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(loginButton);
        loginPanel.add(registerButton);

        add(loginPanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private class OpenAccountMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(BankingApplication.this, "Open Account functionality is not implemented yet!");
        }
    }

    private class PrintBalanceMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = JOptionPane.showInputDialog(BankingApplication.this, "Enter customer username:");
            if (username != null && !username.isEmpty()) {
                if (users.containsKey(username)) {
                    // Here you can implement fetching and printing customer balance
                    JOptionPane.showMessageDialog(BankingApplication.this, "Balance of " + username + " is: $XXXX.XX"); // Replace XXXX.XX with actual balance
                } else {
                    JOptionPane.showMessageDialog(BankingApplication.this, "Customer not found!");
                }
            }
        }
    }

    private class QuitMenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(BankingApplication.this, "Exiting Bank System...");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BankingApplication();
            }
        });
    }
}


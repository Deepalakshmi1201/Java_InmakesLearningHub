import java.awt.*;
import java.awt.event.*;

public class UserRegistrationForm extends Frame {
    private Label lblFirstName, lblLastName, lblDOB, lblGender, lblPlace, lblContactNumber;
    private TextField txtFirstName, txtLastName, txtDOB, txtPlace, txtContactNumber;
    private CheckboxGroup genderCheckboxGroup;
    private Checkbox chkMale, chkFemale;
    private Button btnSubmit;

    public UserRegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 300);
        setLayout(new GridLayout(8, 2));

        lblFirstName = new Label("First Name:");
        txtFirstName = new TextField();

        lblLastName = new Label("Last Name:");
        txtLastName = new TextField();

        lblDOB = new Label("Date of Birth (YYYY-MM-DD):");
        txtDOB = new TextField();

        lblGender = new Label("Gender:");
        genderCheckboxGroup = new CheckboxGroup();
        chkMale = new Checkbox("Male", genderCheckboxGroup, false);
        chkFemale = new Checkbox("Female", genderCheckboxGroup, false);

        lblPlace = new Label("Place:");
        txtPlace = new TextField();

        lblContactNumber = new Label("Contact Number:");
        txtContactNumber = new TextField();

        btnSubmit = new Button("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                String dob = txtDOB.getText();
                String gender = chkMale.getState() ? "Male" : "Female";
                String place = txtPlace.getText();
                String contactNumber = txtContactNumber.getText();
                
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Date of Birth: " + dob);
                System.out.println("Gender: " + gender);
                System.out.println("Place: " + place);
                System.out.println("Contact Number: " + contactNumber);
            }
        });

        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblDOB);
        add(txtDOB);
        add(lblGender);
        add(chkMale);
        add(new Label());
        add(chkFemale);
        add(lblPlace);
        add(txtPlace);
        add(lblContactNumber);
        add(txtContactNumber);
        add(new Label());
        add(btnSubmit);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}

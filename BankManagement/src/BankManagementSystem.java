import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

public class BankManagementSystem extends JFrame {
    private JTextField idField, nameField, ageField, designationField, departmentField;
    private JButton registerButton, searchButton;

    public BankManagementSystem() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ajays\\Downloads\\icons8-bank-50.png"));
    	getContentPane().setBackground(new Color(153, 50, 204));
        setTitle("Bank Registration Form");
        setSize(408, 306);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        idField = new JTextField(10);
        nameField = new JTextField(10);
        ageField = new JTextField(10);
        designationField = new JTextField(10);
        departmentField = new JTextField(10);

        registerButton = new JButton("Register");
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 10));
        registerButton.setForeground(new Color(240, 255, 255));
        registerButton.setBackground(new Color(0, 0, 0));
        searchButton = new JButton("Search");
        searchButton.setFont(new Font("Tahoma", Font.BOLD, 10));
        searchButton.setForeground(new Color(240, 255, 255));
        searchButton.setBackground(new Color(0, 0, 0));

        JLabel label_4 = new JLabel("Bank Employee ID:");
        label_4.setForeground(Color.WHITE);
        label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
        getContentPane().add(label_4);
        getContentPane().add(idField);
        JLabel label_3 = new JLabel("Name:");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        getContentPane().add(label_3);
        getContentPane().add(nameField);
        JLabel label_2 = new JLabel("Age:");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        getContentPane().add(label_2);
        getContentPane().add(ageField);
        JLabel label_1 = new JLabel("Designation:");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        getContentPane().add(label_1);
        getContentPane().add(designationField);
        JLabel label = new JLabel("Department:");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        getContentPane().add(label);
        getContentPane().add(departmentField);
        getContentPane().add(registerButton);
        getContentPane().add(searchButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                registerEmployee();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchEmployee();
            }
        });
    }

    private Connection getConnection() throws SQLException {
    	
        String url = "jdbc:mysql://localhost:3306/bank_management_system";
        String username = "root";
        String password = "password";
        return DriverManager.getConnection(url, username, password);
    }

    private void registerEmployee() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String designation = designationField.getText();
            String department = departmentField.getText();

            String query = "INSERT INTO Bank VALUES (" + id + ", '" + name + "', " + age + ", '" + designation + "', '" + department + "')";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(this, "Employee registered successfully!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error registering employee!");
        }
    }

    private void searchEmployee() {
        try {
            Connection connection = getConnection();
            Statement statement = connection.createStatement();

            String criteria = JOptionPane.showInputDialog(this, "Enter name or department:");
            String query = "SELECT * FROM Bank WHERE Name LIKE '%" + criteria + "%' OR Department LIKE '%" + criteria + "%'";
            ResultSet resultSet = statement.executeQuery(query);

            StringBuilder result = new StringBuilder();
            while (resultSet.next()) {
                result.append("ID: ").append(resultSet.getInt("ID"))
                        .append(", Name: ").append(resultSet.getString("Name"))
                        .append(", Age: ").append(resultSet.getInt("Age"))
                        .append(", Designation: ").append(resultSet.getString("Designation"))
                        .append(", Department: ").append(resultSet.getString("Department"))
                        .append("\n");
            }

            if (result.length() > 0) {
                JOptionPane.showMessageDialog(this, "Search Results:\n" + result.toString());
            } else {
                JOptionPane.showMessageDialog(this, "No results found.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error searching for employee!");
        }
    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BankManagementSystem bankManagementSystem = new BankManagementSystem();
            bankManagementSystem.setVisible(true);
        });
    }
}

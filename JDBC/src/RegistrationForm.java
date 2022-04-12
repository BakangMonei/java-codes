import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegistrationForm {
    private JPanel panel1;
    private JPanel WestJpanel;
    private JPanel centreJPanel;
    private JPanel EastJPanel;
    private JPanel SouthJPanel;
    private JLabel SID;
    private JButton ADDButton;
    private JButton UPDATEButton;
    private JButton DELETEButton;
    private JButton LISTButton;
    private JTextArea listTextArea1;
    private JTextField sidTextField;
    private JTextField firstTextField;
    private JTextField lastTextField;
    private JTextField emailTextField;

    private JDBCExample jdbc;

    public RegistrationForm(JDBCExample jdbc)
    {      this.jdbc = jdbc;
        // Create frame with title Registration Demo
        JFrame frame= new JFrame();
        frame.setTitle(" Registration Demo");
        // Add panel to frame
        frame.add(panel1);
        frame.pack();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)  {
                try {
                    int sid = Integer.parseInt(sidTextField.getText());
                    String firstname = firstTextField.getText();
                    String lastname = lastTextField.getText();
                    String email = emailTextField.getText();
                    int i =jdbc.addStudent(sid, firstname, lastname, email);
                    if(i >0)
                        JOptionPane.showMessageDialog(null,"Successfully Added.","Alert",JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"Failed to add Student.","Alert",JOptionPane.WARNING_MESSAGE);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }

            }
        });
        UPDATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                int sid = Integer.parseInt(sidTextField.getText());
                String firstname = firstTextField.getText();
                String lastname = lastTextField.getText();
                String email = emailTextField.getText();
                int i = jdbc.updateStudent(sid, firstname, lastname, email);
                    if(i >0)
                        JOptionPane.showMessageDialog(null,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"Failed to update Student.","Alert",JOptionPane.WARNING_MESSAGE);
            }catch(Exception ex)
            {
                ex.printStackTrace();
            }

            }
        });
        DELETEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    String firstname = firstTextField.getText();
                    String lastname = lastTextField.getText();

                    int i = jdbc.deleteStudent( firstname, lastname);
                    if(i >0)
                        JOptionPane.showMessageDialog(null,"Successfully Deleted.","Alert",JOptionPane.WARNING_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"Failed to delete Student.","Alert",JOptionPane.WARNING_MESSAGE);
                }catch(Exception ex)
                {
                    ex.printStackTrace();
                }

            }


        });
        LISTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hatsa");
                try {
                    ArrayList<Student> list = jdbc.listStudents();
                    listTextArea1.setText("");
                    for(int i =0; i< list.size(); i++)
                        listTextArea1.append(list.get(i).toString()+"\n");

                }catch(Exception re)
                {
                    re.printStackTrace();
                }

            }
        });
    }
}

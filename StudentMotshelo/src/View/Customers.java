package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customers extends JFrame{

    private JPanel panel1;
    private JTable table1;
    private JButton BACKButton;

    public Customers() throws HeadlessException {
        JFrame frame= new JFrame();
        frame.setTitle("Customers");
        frame.add(panel1);
        frame.pack();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        BACKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterCustomer registerCustomer = new RegisterCustomer();
                registerCustomer.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}

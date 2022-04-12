import javax.swing.*;
import java.awt.*;

public class Table
{
    Table()
    {
        DataManager dataManager = new DataManager();
        JTable tafole;
        JScrollPane empTableScrollPane;

        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Table TABLE
        String data[][]={ {dataManager.tokenManager()[0],dataManager.tokenManager()[1],dataManager.tokenManager()[2]},
                {dataManager.tokenManager()[13],dataManager.tokenManager()[14],dataManager.tokenManager()[15]},
                {dataManager.tokenManager()[26],dataManager.tokenManager()[27],dataManager.tokenManager()[28]}};
        String column[]={"ID","NAME","SURNAME"};

        tafole = new JTable(data, column)
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tafole.getTableHeader().setReorderingAllowed(false);
        empTableScrollPane = new JScrollPane(tafole);
        empTableScrollPane.setPreferredSize(new Dimension(600, 400));

        frame.add(panel);
        panel.add(tafole);

        frame.setVisible(true);
    }

    /*public static void main(String[] args) {
        new Table();
    }*/
}

package BankingApplication;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class HelpUI extends JFrame {
    private JButton btnBack;
    private JButton btnClose;
    private JLabel jLabel16;
    private JPanel jPanel1;

    public HelpUI() {
        super("Student Information System");
        this.initComponents();
        this.setLocationRelativeTo((Component)null);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel16 = new JLabel();
        this.btnBack = new JButton();
        this.btnClose = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(0, 153, 153));
        this.jLabel16.setFont(new Font("Narkisim", 1, 48));
        this.jLabel16.setForeground(new Color(255, 255, 255));
        this.jLabel16.setText("Student Information System Help");
        this.btnBack.setFont(new Font("Narkisim", 1, 36));
        this.btnBack.setText("Back");
        this.btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HelpUI.this.btnBackActionPerformed(evt);
            }
        });
        this.btnClose.setFont(new Font("Narkisim", 1, 36));
        this.btnClose.setText("Close");
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HelpUI.this.btnCloseActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(155, 32767).addComponent(this.jLabel16).addGap(41, 41, 41)).addGroup(jPanel1Layout.createSequentialGroup().addGap(320, 320, 320).addComponent(this.btnClose).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btnBack, -2, 117, -2).addContainerGap(-1, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(48, 48, 48).addComponent(this.jLabel16).addGap(149, 149, 149).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.btnClose, -2, 39, -2).addComponent(this.btnBack, -2, 39, -2)).addContainerGap(249, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -2, -1, -2));
        this.pack();
    }

    private void btnBackActionPerformed(ActionEvent evt) {
        WelcomeScreen ws = new WelcomeScreen();
        ws.setVisible(true);
        this.dispose();
    }

    private void btnCloseActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(HelpUI.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(HelpUI.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(HelpUI.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(HelpUI.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new HelpUI()).setVisible(true);
            }
        });
    }
}

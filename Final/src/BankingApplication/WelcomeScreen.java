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

public class WelcomeScreen extends JFrame {
    private JButton btnClose;
    private JButton btnCont;
    private JButton btnHelp;
    private JLabel jLabel16;
    private JPanel jPanel1;

    public WelcomeScreen() {
        super("Banking System");
        this.initComponents();
        this.setLocationRelativeTo((Component)null);
    }

    private void initComponents() {
        this.jPanel1 = new JPanel();
        this.jLabel16 = new JLabel();
        this.btnCont = new JButton();
        this.btnClose = new JButton();
        this.btnHelp = new JButton();
        this.setDefaultCloseOperation(3);
        this.jPanel1.setBackground(new Color(0, 153, 153));
        this.jLabel16.setFont(new Font("Narkisim", 1, 48));
        this.jLabel16.setForeground(new Color(255, 255, 255));
        this.jLabel16.setText("Welcome to  The Banking System");
        this.btnCont.setFont(new Font("Narkisim", 1, 36));
        this.btnCont.setForeground(new Color(255, 0, 255));
        this.btnCont.setText("Continue");
        this.btnCont.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WelcomeScreen.this.btnContActionPerformed(evt);
            }
        });
        this.btnClose.setFont(new Font("Narkisim", 1, 36));
        this.btnClose.setForeground(new Color(255, 0, 255));
        this.btnClose.setText("Close");
        this.btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WelcomeScreen.this.btnCloseActionPerformed(evt);
            }
        });
        this.btnHelp.setFont(new Font("Narkisim", 1, 36));
        this.btnHelp.setForeground(new Color(255, 0, 255));
        this.btnHelp.setText("Help");
        this.btnHelp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WelcomeScreen.this.btnHelpActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(335, 335, 335).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.btnCont, -1, -1, 32767).addComponent(this.btnClose, -1, -1, 32767).addComponent(this.btnHelp, Alignment.TRAILING, -1, -1, 32767))).addGroup(jPanel1Layout.createSequentialGroup().addGap(30, 30, 30).addComponent(this.jLabel16))).addContainerGap(12, 32767)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(50, 50, 50).addComponent(this.jLabel16).addGap(88, 88, 88).addComponent(this.btnCont, -2, 39, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btnClose, -2, 39, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.btnHelp, -2, 39, -2).addContainerGap(218, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
        this.pack();
    }

    private void btnContActionPerformed(ActionEvent evt) {
        ApplicationMainMenu amm = new ApplicationMainMenu();
        amm.setVisible(true);
        this.dispose();
    }

    private void btnCloseActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void btnHelpActionPerformed(ActionEvent evt) {
        HelpUI h = new HelpUI();
        h.setVisible(true);
        this.dispose();
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
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new WelcomeScreen()).setVisible(true);
            }
        });
    }
}

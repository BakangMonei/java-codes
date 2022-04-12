package BankingApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ApplicationMainMenu extends javax.swing.JFrame {

    static final String DRIVER = "com.mysql.jdbc.Driver"; //Driver
    //static final String DATABASE_URL1 = "jdbc:oracle:thin:@localhost:1521:orcl", "gebre", "gebre12";
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/System"; //JDBC
    Connection conn = null; // Manages connion
    Statement statement = null; // Query statement
    PreparedStatement ps; //Prepared statement
    ResultSet rs; //Result set

    /**
     * Creates new form BankInfoSyst
     */
    public ApplicationMainMenu() {
        // super(Title)
        super("Banking Information System");
        initComponents();
        setLocationRelativeTo(null);
        txtCustomerName1.setEditable(false);
        txtCurrBal1.setEditable(false);
        txtCustomerName2.setEditable(false);
        txtCurrBal2.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        cboSex = new javax.swing.JComboBox();
        btnOpenAcct = new javax.swing.JButton();
        btnModifyAcct = new javax.swing.JButton();
        btnDeleteAcct = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearchAcct = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtSearchAcctNo = new javax.swing.JTextField();
        txtAcctNo = new javax.swing.JTextField();
        txtInitialBalance = new javax.swing.JTextField();
        cboBranch = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtWithAmt1 = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtSearchAcctNo1 = new javax.swing.JTextField();
        txtCurrBal1 = new javax.swing.JTextField();
        txtCustomerName1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnRegister3 = new javax.swing.JButton();
        btnClear3 = new javax.swing.JButton();
        btnSearch4 = new javax.swing.JButton();
        txtSearchAcctNo2 = new javax.swing.JTextField();
        txtCustomerName2 = new javax.swing.JTextField();
        txtCurrBal2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtWithAmt2 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtSearchAcctNo3 = new javax.swing.JTextField();
        btnSearch2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        btnViewAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Eras Demi ITC", 1, 26)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Open Bank Account");

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Acct No:");

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Customer Name:");

        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Sex:");

        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Branch:");

        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Initial Balance:");

        txtCustomerName.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtCustomerName.setForeground(new java.awt.Color(0, 153, 153));

        cboSex.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        cboSex.setForeground(new java.awt.Color(0, 153, 153));
        cboSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Sex", "Male", "Female" }));

        btnOpenAcct.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnOpenAcct.setForeground(new java.awt.Color(0, 153, 153));
        btnOpenAcct.setText("Open");
        btnOpenAcct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenAcctActionPerformed(evt);
            }
        });

        btnModifyAcct.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnModifyAcct.setForeground(new java.awt.Color(0, 153, 153));
        btnModifyAcct.setText("Modify");
        btnModifyAcct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyAcctActionPerformed(evt);
            }
        });

        btnDeleteAcct.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnDeleteAcct.setForeground(new java.awt.Color(0, 153, 153));
        btnDeleteAcct.setText("Delete");
        btnDeleteAcct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAcctActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 153));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearchAcct.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnSearchAcct.setForeground(new java.awt.Color(0, 153, 153));
        btnSearchAcct.setText("Search");
        btnSearchAcct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAcctActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Enter Acct No:");

        txtSearchAcctNo.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtSearchAcctNo.setForeground(new java.awt.Color(0, 153, 153));
        txtSearchAcctNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAcctNoActionPerformed(evt);
            }
        });

        txtAcctNo.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtAcctNo.setForeground(new java.awt.Color(0, 153, 153));

        txtInitialBalance.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtInitialBalance.setForeground(new java.awt.Color(0, 153, 153));

        cboBranch.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        cboBranch.setForeground(new java.awt.Color(0, 153, 153));
        cboBranch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Branch", "Adama", "Addis Ababa", "Assosa", "Bahr Dar", "Dire Dawa", "Gondar", "Jimma", "Mekele", "Wolayita Sodo" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel9)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel14)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel15))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(cboSex, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                        .addComponent(txtSearchAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnSearchAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(cboBranch, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(txtInitialBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(65, 65, 65)
                                                .addComponent(btnOpenAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnModifyAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDeleteAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(441, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSearchAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtSearchAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(txtAcctNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(cboBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(txtInitialBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnOpenAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnModifyAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeleteAcct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Open Account", jPanel3);

        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Deposit Money");

        jLabel19.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setText("Current Balance:");

        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 153));
        jLabel20.setText("Amount:");

        jLabel22.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setText("Customer Name:");

        txtWithAmt1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtWithAmt1.setForeground(new java.awt.Color(0, 153, 153));

        btnDeposit.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(0, 153, 153));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnClear1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(0, 153, 153));
        btnClear1.setText("Clear");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnSearch1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(0, 153, 153));
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 153));
        jLabel26.setText("Enter Acct No:");

        txtSearchAcctNo1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtSearchAcctNo1.setForeground(new java.awt.Color(0, 153, 153));
        txtSearchAcctNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAcctNo1ActionPerformed(evt);
            }
        });

        txtCurrBal1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtCurrBal1.setForeground(new java.awt.Color(0, 153, 153));

        txtCustomerName1.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtCustomerName1.setForeground(new java.awt.Color(0, 153, 153));
        txtCustomerName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerName1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel18)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(txtSearchAcctNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(438, Short.MAX_VALUE))))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCustomerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel20))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtCurrBal1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtWithAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(btnDeposit)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSearchAcctNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26)
                                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(txtCustomerName1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCurrBal1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtWithAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposit Money", jPanel5);

        jLabel27.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 153));
        jLabel27.setText("Withdraw Money");

        btnRegister3.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnRegister3.setForeground(new java.awt.Color(0, 153, 153));
        btnRegister3.setText("Withdrwaw");
        btnRegister3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister3ActionPerformed(evt);
            }
        });

        btnClear3.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnClear3.setForeground(new java.awt.Color(0, 153, 153));
        btnClear3.setText("Clear");
        btnClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear3ActionPerformed(evt);
            }
        });

        btnSearch4.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnSearch4.setForeground(new java.awt.Color(0, 153, 153));
        btnSearch4.setText("Search");
        btnSearch4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch4ActionPerformed(evt);
            }
        });

        txtSearchAcctNo2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtSearchAcctNo2.setForeground(new java.awt.Color(0, 153, 153));
        txtSearchAcctNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAcctNo2ActionPerformed(evt);
            }
        });

        txtCustomerName2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtCustomerName2.setForeground(new java.awt.Color(0, 153, 153));
        txtCustomerName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerName2ActionPerformed(evt);
            }
        });

        txtCurrBal2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtCurrBal2.setForeground(new java.awt.Color(0, 153, 153));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setText("Amount:");

        txtWithAmt2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        txtWithAmt2.setForeground(new java.awt.Color(0, 153, 153));

        jLabel34.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setText("Current Balance:");

        jLabel35.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 153));
        jLabel35.setText("Customer Name:");

        jLabel36.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 153));
        jLabel36.setText("Enter Acct No:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel34)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel35))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCurrBal2, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                                        .addComponent(txtWithAmt2)
                                                        .addComponent(txtCustomerName2)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(159, 159, 159)
                                                .addComponent(jLabel27))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(172, 172, 172)
                                                .addComponent(btnRegister3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtSearchAcctNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(426, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSearchAcctNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36)
                                        .addComponent(btnSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel35)
                                        .addComponent(txtCustomerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel34)
                                        .addComponent(txtCurrBal2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtWithAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegister3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Withdraw Money", jPanel6);

        jLabel17.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setText("Bank Transactions");

        txtSearchAcctNo3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N

        btnSearch2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnSearch2.setForeground(new java.awt.Color(0, 153, 153));
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setText("Search Acct No:");

        btnViewAll.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        btnViewAll.setForeground(new java.awt.Color(0, 153, 153));
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        tblTransactions.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tblTransactions.setForeground(new java.awt.Color(0, 153, 153));
        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Bank Account", "Customer Name", "Deposit", "Withdrawal", "Current Balance", "Date"
                }
        ));
        jScrollPane1.setViewportView(tblTransactions);

        jLabel24.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 153));
        jLabel24.setText("Transactions:");

        lblTotal.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 153, 153));
        lblTotal.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblTotal))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel17)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel23)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtSearchAcctNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(2, 2, 2)
                                                .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtSearchAcctNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23)
                                        .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(lblTotal))
                                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Bank Transactions", jPanel4);

        jLabel16.setFont(new java.awt.Font("Eras Medium ITC", 1, 60)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Banking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jLabel16)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtSearchAcctNo.setText("");
        txtAcctNo.setText("");
        txtCustomerName.setText("");
        cboSex.setSelectedIndex(0);
        cboBranch.setSelectedIndex(0);
        txtInitialBalance.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        //ArrayList array = new ArrayList();
        DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
        ResultSetMetaData rsmdata;
        int total = 0;
        try {
            Class.forName(DRIVER);
            // Establish conn to database
            conn = DriverManager.getConnection(DATABASE_URL, "root", "");
            statement = conn.createStatement();
            String sql = "SELECT acct_no, customer_name, deposit, withdraw, balance, date FROM transactions ORDER BY date DESC";
            statement.execute(sql);
            rs = statement.getResultSet();
            rsmdata = rs.getMetaData();
            int row = 0;
            while (rs.next()) {
                model.setValueAt(rs.getString(1), row, 0);
                model.setValueAt(rs.getString(2), row, 1);
                model.setValueAt(rs.getString(3), row, 2);
                model.setValueAt(rs.getString(4), row, 3);
                model.setValueAt(rs.getString(5), row, 4);
                model.setValueAt(rs.getString(6), row, 5);
                row++;
                total = row;
            }
            rs.close();
            statement.close();
            String tot = String.valueOf(total);
            lblTotal.setText(tot);
            if (total == 0) {
                JOptionPane.showMessageDialog(this, "There are No Records in the Database!", "Banking System - No Record Found.", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnOpenAcctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenAcctActionPerformed
        // TODO add your handling code here:
        try {
            String AcctNumber = "";
            String acctNo = txtAcctNo.getText();
            String customerName = txtCustomerName.getText();
            String sex = (String) cboSex.getSelectedItem();
            String branch = (String) cboBranch.getSelectedItem();

            String initial_balance = txtInitialBalance.getText();
            int se = cboSex.getSelectedIndex();
            int br = cboBranch.getSelectedIndex();

            if (acctNo.isEmpty() || customerName.isEmpty() || se == 0 || br == 0 || initial_balance.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill in All Required Information!", "Banking SYstem - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                double initial_balance1 = Double.parseDouble(initial_balance);
                String query = "SELECT *FROM tblAccount WHERE acct_no ='" + acctNo + "'";
                ps = (PreparedStatement) conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    AcctNumber = rs.getString("acct_no");
                }
                if (acctNo.intern().equals(AcctNumber.intern())) {
                    //Info Already Exist (Must Not Insert Duplicate Info)
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + acctNo + " Already Exist!", "Banking System - Bank Already Exist.", JOptionPane.INFORMATION_MESSAGE);
                } else if (!acctNo.intern().equals(AcctNumber.intern())) {
                    statement = conn.createStatement();
                    String sql = "INSERT INTO tblAccount(acct_no, customer_name, sex, branch, initial_balance) VALUES ('" + acctNo + "' , '" + customerName + "', '" + sex + "', '" + branch + "', '" + initial_balance1 + "')";
                    statement.executeUpdate(sql);
                    // Successfully Registered
                    JOptionPane.showMessageDialog(this, "Bank Account has been Created Successfully!", "Banking System - Bank Account Created.", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOpenAcctActionPerformed

    private void btnSearchAcctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAcctActionPerformed
        // TODO add your handling code here:
        ArrayList array = new ArrayList();
        try {
            String acctNo = txtSearchAcctNo.getText();

            if (acctNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Bank Account Number to Search!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                // Establish conn to database
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                String sql = "SELECT * FROM tblAccount WHERE acct_no='" + acctNo + "'";
                rs = statement.executeQuery(sql);
                while (rs.next()) {
                    // Add 5 elements to the array list
                    for (int i = 0; i < 5; i++) {
                        array.add(rs.getString(i + 1));
                    }
                }
                if (!array.isEmpty()) {
                    txtAcctNo.setText(array.get(0).toString());
                    txtCustomerName.setText(array.get(1).toString());
                    cboSex.setSelectedItem(array.get(2).toString());
                    cboBranch.setSelectedItem(array.get(3).toString());
                    txtInitialBalance.setText(array.get(4).toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + txtSearchAcctNo.getText() + " Not Found!", "Banking System - Bank Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchAcctActionPerformed

    private void btnModifyAcctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyAcctActionPerformed
        // TODO add your handling code here:
        try {
            String AcctNumber = "";
            String acctNo = txtAcctNo.getText();
            String customerName = txtCustomerName.getText();
            String sex = (String) cboSex.getSelectedItem();
            String branch = (String) cboBranch.getSelectedItem();
            String initial_balance = txtInitialBalance.getText();
            int se = cboSex.getSelectedIndex();
            int bra = cboBranch.getSelectedIndex();

            if (acctNo.isEmpty() || customerName.isEmpty() || se == 0 || bra == 0 || initial_balance.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill in All Required Information!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                double initial_balance1 = Double.parseDouble(initial_balance);
                Class.forName(DRIVER);
                // Establish conn to database
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                String query = "SELECT *FROM tblAccount WHERE acct_no ='" + acctNo + "'";
                ps = (PreparedStatement) conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    AcctNumber = rs.getString("acct_no");
                }
                if (!acctNo.intern().equals(AcctNumber.intern())) {
                    //Info Doesn't Exist
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + acctNo + " Doesn't Exist!", "Banking System - Bank Acct Doesn't Exist.", JOptionPane.INFORMATION_MESSAGE);
                } else if (acctNo.intern().equals(AcctNumber.intern())) {
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET customer_name ='" + customerName + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET sex ='" + sex + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET branch ='" + branch + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET initial_balance ='" + initial_balance1 + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    //Successfully Updated
                    JOptionPane.showMessageDialog(this, "Bank Acct Information has been Updated Successfully!", "Banking System - Bank Acct Updated.", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnModifyAcctActionPerformed

    private void btnDeleteAcctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAcctActionPerformed
        // TODO add your handling code here:
        try {
            String AcctNumber = "";
            String acctNo = txtSearchAcctNo.getText();
            String acctNo1 = txtAcctNo.getText();

            if (acctNo.isEmpty() && acctNo1.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Account Number to Delete!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Show a Confirmation Dialog.
                int reply = JOptionPane.showConfirmDialog(this,
                        "Are you Sure You Want to Delete the Bank Information With Account Number " + acctNo + " from the Database?",
                        "Banking System - Confirm Deletion?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                //Check the User Selection.
                if (reply == JOptionPane.YES_OPTION) {
                    Class.forName(DRIVER);
                    // Establish conn to database
                    conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                    // Create Statement for querying database
                    String query = "SELECT *FROM tblAccount WHERE acct_no='" + acctNo + "'";
                    ps = (PreparedStatement) conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        AcctNumber = rs.getString("acct_no");
                    }
                    if (!acctNo.intern().equals(AcctNumber.intern())) {
                        //Stud Info Not Found
                        JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + acctNo + " Doesn't Exist!", "Banking System - Bank Doesn't Exist.", JOptionPane.INFORMATION_MESSAGE);
                    } else if (acctNo.intern().equals(AcctNumber.intern())) {
                        ps = (PreparedStatement) conn.prepareStatement("DELETE FROM  tblAccount WHERE acct_no = '" + acctNo + "'");
                        ps.executeUpdate();
                        //Bank Successfully Deleted
                        JOptionPane.showMessageDialog(this, "Bank Information has been Deleted Successfully!", "Banking System - Bank Deleted.", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else if (reply == JOptionPane.NO_OPTION) {
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteAcctActionPerformed

    private void txtSearchAcctNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAcctNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAcctNoActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        ArrayList array = new ArrayList();

        DefaultTableModel model = (DefaultTableModel) tblTransactions.getModel();
        ResultSetMetaData rsmd;
        try {
            String acctNo = txtSearchAcctNo3.getText();
            int total = 0;
            if (acctNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Bank Account Number to Search!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                for (int i = 0; i < 5; i++) {
                    Class.forName(DRIVER);
                    // establish conn to database
                    conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                    statement = conn.createStatement();
                    String sql = "SELECT acct_no, customer_name, deposit, withdraw, balance, date FROM transactions WHERE acct_no = '" + acctNo + "'";
                    statement.execute(sql);
                    rs = statement.getResultSet();
                    rsmd = rs.getMetaData();
                    int rows = 0;
                    while (rs.next()) {
                        model.setValueAt(rs.getString(1), rows, 0);
                        model.setValueAt(rs.getString(2), rows, 1);
                        model.setValueAt(rs.getString(3), rows, 2);
                        model.setValueAt(rs.getString(4), rows, 3);
                        model.setValueAt(rs.getString(5), rows, 4);
                        model.setValueAt(rs.getString(6), rows, 5);
                        rows++;
                        total = rows;
                    }
                    String tot = String.valueOf(rows);
                    lblTotal.setText(tot);
                }
                if (total == 0) {
                    JOptionPane.showMessageDialog(this, "No Record Found Matching Your Search Criteria " + acctNo + "", "Banking System - No Record Found.", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed

        try {
            String AcctNumber = "";
            String acctNo = txtSearchAcctNo1.getText();
            String customerName = txtCustomerName1.getText();
            String currbal = txtCurrBal1.getText();
            String amount = txtWithAmt1.getText();

            if (acctNo.isEmpty() || customerName.isEmpty() || currbal.isEmpty() || amount.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill in All Required Information!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                double currbal1 = Double.parseDouble(currbal);
                double deposit = Double.parseDouble(amount);

                double bal = currbal1 + deposit; //deposit
                double withdraw = 0;

                String query = "SELECT *FROM tblAccount WHERE acct_no ='" + acctNo + "'";
                ps = (PreparedStatement) conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    AcctNumber = rs.getString("acct_no");
                }
                if (!acctNo.intern().equals(AcctNumber.intern())) {
                    //Info Already Exist (Must Not Insert Duplicate Info)
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + acctNo + " Already Exist!", "Banking System - Bank Already Exist.", JOptionPane.INFORMATION_MESSAGE);
                } else if (acctNo.intern().equals(AcctNumber.intern())) {
                    statement = conn.createStatement();
                    String sql = "INSERT INTO transactions(acct_no, customer_name, deposit, withdraw, balance, date) VALUES ('" + acctNo + "' , '" + customerName + "', '" + deposit + "', '" + withdraw + "','" + bal + "', CURDATE())";
                    statement.executeUpdate(sql);
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET initial_balance ='" + bal + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    // Successfully Registered
                    JOptionPane.showMessageDialog(this, "Bank Information has been Deposited Successfully!", "Banking System - Bank Deposited.", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        ArrayList array = new ArrayList();
        try {
            String acctNo = txtSearchAcctNo1.getText();

            if (acctNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Bank Account Number to Search!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                // Establish conn to database
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                String sql = "SELECT * FROM tblAccount WHERE acct_no='" + acctNo + "'";
                rs = statement.executeQuery(sql);
                while (rs.next()) {
                    // Add 5 elements to the array list
                    for (int i = 0; i < 5; i++) {
                        array.add(rs.getString(i + 1));
                    }
                }
                if (!array.isEmpty()) {
                    txtSearchAcctNo1.setText(array.get(0).toString());
                    txtCustomerName1.setText(array.get(1).toString());
                    txtCurrBal1.setText(array.get(4).toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + txtSearchAcctNo.getText() + " Not Found!", "Banking System - Bank Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void txtSearchAcctNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAcctNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAcctNo1ActionPerformed

    private void txtCustomerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerName1ActionPerformed

    private void btnRegister3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister3ActionPerformed
        // TODO add your handling code here:
        try {
            String AcctNumber = "", balance = "";
            String acctNo = txtSearchAcctNo2.getText();
            String customerName = txtCustomerName2.getText();
            String currbal = txtCurrBal2.getText();
            String amount = txtWithAmt2.getText();

            if (acctNo.isEmpty() || customerName.isEmpty() || currbal.isEmpty() || amount.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Fill in All Required Information!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                double currbal1 = Double.parseDouble(currbal);
                double withdraw = Double.parseDouble(amount);

                double bal = currbal1 - withdraw; //deposit
                double deposit = 0;

                String query = "SELECT *FROM tblAccount WHERE acct_no ='" + acctNo + "'";
                ps = (PreparedStatement) conn.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    AcctNumber = rs.getString("acct_no");
                }

                if (!acctNo.intern().equals(AcctNumber.intern())) {
                    //Info Already Exist (Must Not Insert Duplicate Info)
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + acctNo + " Already Exist!", "Banking System - Bank Already Exist.", JOptionPane.INFORMATION_MESSAGE);
                } else if (currbal1 <= withdraw) {
                    //Info Already Exist (Must Not Insert Duplicate Info)
                    JOptionPane.showMessageDialog(this, "Insufficient Balance in Account Number ", "Banking System - Insufficient Balance.", JOptionPane.INFORMATION_MESSAGE);
                } else if (acctNo.intern().equals(AcctNumber.intern())) {
                    statement = conn.createStatement();
                    String sql = "INSERT INTO transactions(acct_no, customer_name, deposit, withdraw, balance, date) VALUES ('" + acctNo + "' , '" + customerName + "', '" + deposit + "', '" + withdraw + "','" + bal + "', CURDATE())";
                    statement.executeUpdate(sql);
                    ps = (PreparedStatement) conn.prepareStatement("UPDATE  tblAccount SET initial_balance ='" + bal + "' WHERE acct_no ='" + acctNo + "'");
                    ps.executeUpdate();
                    // Successfully Registered
                    JOptionPane.showMessageDialog(this, "Bank Information has been Withdrawn Successfully!", "Banking System - Bank Registered.", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegister3ActionPerformed

    private void btnClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClear3ActionPerformed

    private void btnSearch4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch4ActionPerformed
        // TODO add your handling code here:
        ArrayList array = new ArrayList();
        try {
            String acctNo = txtSearchAcctNo2.getText();

            if (acctNo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter Bank Account Number to Search!", "Banking System - Required Information.", JOptionPane.INFORMATION_MESSAGE);
            } else {
                Class.forName(DRIVER);
                // Establish conn to database
                conn = DriverManager.getConnection(DATABASE_URL, "root", "");
                statement = conn.createStatement();
                String sql = "SELECT * FROM tblAccount WHERE acct_no='" + acctNo + "'";
                rs = statement.executeQuery(sql);
                while (rs.next()) {
                    // Add 5 elements to the array list
                    for (int i = 0; i < 5; i++) {
                        array.add(rs.getString(i + 1));
                    }
                }
                if (!array.isEmpty()) {
                    txtAcctNo.setText(array.get(0).toString());
                    txtCustomerName2.setText(array.get(1).toString());
                    txtCurrBal2.setText(array.get(4).toString());
                } else {
                    JOptionPane.showMessageDialog(this, "Bank Information With Account Number " + txtSearchAcctNo.getText() + " Not Found!", "Banking System - Bank Not Found", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error! Can't Connect be to Database! Please Contact System Administrator.", "Banking System - Connection Error.", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSearch4ActionPerformed

    private void txtSearchAcctNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAcctNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAcctNo2ActionPerformed

    private void txtCustomerName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerName2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ApplicationMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationMainMenu.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationMainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnDeleteAcct;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnModifyAcct;
    private javax.swing.JButton btnOpenAcct;
    private javax.swing.JButton btnRegister3;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch4;
    private javax.swing.JButton btnSearchAcct;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox cboBranch;
    private javax.swing.JComboBox cboSex;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblTransactions;
    private javax.swing.JTextField txtAcctNo;
    private javax.swing.JTextField txtCurrBal1;
    private javax.swing.JTextField txtCurrBal2;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerName1;
    private javax.swing.JTextField txtCustomerName2;
    private javax.swing.JTextField txtInitialBalance;
    private javax.swing.JTextField txtSearchAcctNo;
    private javax.swing.JTextField txtSearchAcctNo1;
    private javax.swing.JTextField txtSearchAcctNo2;
    private javax.swing.JTextField txtSearchAcctNo3;
    private javax.swing.JTextField txtWithAmt1;
    private javax.swing.JTextField txtWithAmt2;
    // End of variables declaration//GEN-END:variables
}

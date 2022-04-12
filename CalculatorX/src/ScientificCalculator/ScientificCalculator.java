package ScientificCalculator;

// % is not done

import java.awt.event.KeyEvent;

public class ScientificCalculator extends javax.swing.JFrame {
    double firstnum;
    double secondnum;
    double result;
    String operations;
    private Object math;
    String answer;

    public ScientificCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        textbox = new javax.swing.JTextField();
        btneight = new javax.swing.JButton();
        btnnine = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnseven = new javax.swing.JButton();
        btnfour = new javax.swing.JButton();
        btnfive = new javax.swing.JButton();
        btnsix = new javax.swing.JButton();
        btnsubtr = new javax.swing.JButton();
        btnone = new javax.swing.JButton();
        btntwo = new javax.swing.JButton();
        btnthree = new javax.swing.JButton();
        btndivide = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnroot = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnsin = new javax.swing.JButton();
        btnsinh = new javax.swing.JButton();
        btnlog = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btncosh = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        btnxy = new javax.swing.JButton();
        btntanh = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btnx2 = new javax.swing.JButton();
        btnround = new javax.swing.JButton();
        btncbr = new javax.swing.JButton();
        btnx3 = new javax.swing.JButton();
        btnhex = new javax.swing.JButton();
        btnbinary = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProfessorMonei Calculator");
        setAlwaysOnTop(getFocusableWindowState());
        setBackground(new java.awt.Color(111, 111, 111));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(13, 11, 31));
        setIconImages(null);
        setLocationByPlatform(getFocusableWindowState());
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        textbox.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        textbox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textbox.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textboxActionPerformed(evt);
            }
        });
        textbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textboxKeyTyped(evt);
            }
        });

        btneight.setBackground(new java.awt.Color(102, 102, 102));
        btneight.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btneight.setForeground(new java.awt.Color(255, 255, 255));
        btneight.setText("8");
        btneight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btneight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneightActionPerformed(evt);
            }
        });

        btnnine.setBackground(new java.awt.Color(102, 102, 102));
        btnnine.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnnine.setForeground(new java.awt.Color(255, 255, 255));
        btnnine.setText("9");
        btnnine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnineActionPerformed(evt);
            }
        });

        btnmulti.setBackground(new java.awt.Color(102, 102, 102));
        btnmulti.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnmulti.setForeground(new java.awt.Color(255, 255, 255));
        btnmulti.setText("*");
        btnmulti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btnseven.setBackground(new java.awt.Color(102, 102, 102));
        btnseven.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnseven.setForeground(new java.awt.Color(255, 255, 255));
        btnseven.setText("7");
        btnseven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsevenActionPerformed(evt);
            }
        });

        btnfour.setBackground(new java.awt.Color(102, 102, 102));
        btnfour.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnfour.setForeground(new java.awt.Color(255, 255, 255));
        btnfour.setText("4");
        btnfour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfourActionPerformed(evt);
            }
        });

        btnfive.setBackground(new java.awt.Color(102, 102, 102));
        btnfive.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnfive.setForeground(new java.awt.Color(255, 255, 255));
        btnfive.setText("5");
        btnfive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiveActionPerformed(evt);
            }
        });

        btnsix.setBackground(new java.awt.Color(102, 102, 102));
        btnsix.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnsix.setForeground(new java.awt.Color(255, 255, 255));
        btnsix.setText("6");
        btnsix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsixActionPerformed(evt);
            }
        });

        btnsubtr.setBackground(new java.awt.Color(102, 102, 102));
        btnsubtr.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnsubtr.setForeground(new java.awt.Color(255, 255, 255));
        btnsubtr.setText("-");
        btnsubtr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnsubtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubtrActionPerformed(evt);
            }
        });

        btnone.setBackground(new java.awt.Color(102, 102, 102));
        btnone.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnone.setForeground(new java.awt.Color(255, 255, 255));
        btnone.setText("1");
        btnone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoneActionPerformed(evt);
            }
        });

        btntwo.setBackground(new java.awt.Color(102, 102, 102));
        btntwo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btntwo.setForeground(new java.awt.Color(255, 255, 255));
        btntwo.setText("2");
        btntwo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btntwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntwoActionPerformed(evt);
            }
        });

        btnthree.setBackground(new java.awt.Color(102, 102, 102));
        btnthree.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnthree.setForeground(new java.awt.Color(255, 255, 255));
        btnthree.setText("3");
        btnthree.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreeActionPerformed(evt);
            }
        });

        btndivide.setBackground(new java.awt.Color(102, 102, 102));
        btndivide.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btndivide.setForeground(new java.awt.Color(255, 255, 255));
        btndivide.setText("/");
        btndivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivideActionPerformed(evt);
            }
        });

        btnzero.setBackground(new java.awt.Color(102, 102, 102));
        btnzero.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnzero.setForeground(new java.awt.Color(255, 255, 255));
        btnzero.setText("0");
        btnzero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        btndot.setBackground(new java.awt.Color(102, 102, 102));
        btndot.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btndot.setForeground(new java.awt.Color(255, 255, 255));
        btndot.setText(".");
        btndot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });

        btnplus.setBackground(new java.awt.Color(102, 102, 102));
        btnplus.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnplus.setForeground(new java.awt.Color(255, 255, 255));
        btnplus.setText("±");
        btnplus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnequal.setBackground(new java.awt.Color(102, 102, 102));
        btnequal.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnequal.setForeground(new java.awt.Color(255, 255, 255));
        btnequal.setText("=");
        btnequal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(102, 102, 102));
        btnclear.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("C");
        btnclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnroot.setBackground(new java.awt.Color(102, 102, 102));
        btnroot.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnroot.setForeground(new java.awt.Color(255, 255, 255));
        btnroot.setText("√");
        btnroot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrootActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(102, 102, 102));
        btnadd.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("+");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnback.setBackground(new java.awt.Color(102, 102, 102));
        btnback.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("B");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnsin.setBackground(new java.awt.Color(102, 102, 102));
        btnsin.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnsin.setForeground(new java.awt.Color(255, 255, 255));
        btnsin.setText("Sin");
        btnsin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });

        btnsinh.setBackground(new java.awt.Color(102, 102, 102));
        btnsinh.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnsinh.setForeground(new java.awt.Color(255, 255, 255));
        btnsinh.setText("Sin-1");
        btnsinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnsinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinhActionPerformed(evt);
            }
        });

        btnlog.setBackground(new java.awt.Color(102, 102, 102));
        btnlog.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnlog.setForeground(new java.awt.Color(255, 255, 255));
        btnlog.setText("Log");
        btnlog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btncos.setBackground(new java.awt.Color(102, 102, 102));
        btncos.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btncos.setForeground(new java.awt.Color(255, 255, 255));
        btncos.setText("Cos");
        btncos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btncosh.setBackground(new java.awt.Color(102, 102, 102));
        btncosh.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btncosh.setForeground(new java.awt.Color(255, 255, 255));
        btncosh.setText("Cos-1");
        btncosh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btncosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncoshActionPerformed(evt);
            }
        });

        btnx.setBackground(new java.awt.Color(102, 102, 102));
        btnx.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnx.setForeground(new java.awt.Color(255, 255, 255));
        btnx.setText("Pi");
        btnx.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxActionPerformed(evt);
            }
        });

        btnxy.setBackground(new java.awt.Color(102, 102, 102));
        btnxy.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnxy.setForeground(new java.awt.Color(255, 255, 255));
        btnxy.setText("X^Y");
        btnxy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnxy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxyActionPerformed(evt);
            }
        });

        btntanh.setBackground(new java.awt.Color(102, 102, 102));
        btntanh.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btntanh.setForeground(new java.awt.Color(255, 255, 255));
        btntanh.setText("Tan-1");
        btntanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btntanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanhActionPerformed(evt);
            }
        });

        btntan.setBackground(new java.awt.Color(102, 102, 102));
        btntan.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btntan.setForeground(new java.awt.Color(255, 255, 255));
        btntan.setText("Tan");
        btntan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });

        btnx2.setBackground(new java.awt.Color(102, 102, 102));
        btnx2.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnx2.setForeground(new java.awt.Color(255, 255, 255));
        btnx2.setText("X^2");
        btnx2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx2ActionPerformed(evt);
            }
        });

        btnround.setBackground(new java.awt.Color(102, 102, 102));
        btnround.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnround.setForeground(new java.awt.Color(255, 255, 255));
        btnround.setText("Run");
        btnround.setActionCommand("");
        btnround.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnround.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnroundActionPerformed(evt);
            }
        });

        btncbr.setBackground(new java.awt.Color(102, 102, 102));
        btncbr.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btncbr.setForeground(new java.awt.Color(255, 255, 255));
        btncbr.setText("Cbr");
        btncbr.setActionCommand("");
        btncbr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btncbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncbrActionPerformed(evt);
            }
        });

        btnx3.setBackground(new java.awt.Color(102, 102, 102));
        btnx3.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnx3.setForeground(new java.awt.Color(255, 255, 255));
        btnx3.setText("X^3");
        btnx3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnx3ActionPerformed(evt);
            }
        });

        btnhex.setBackground(new java.awt.Color(102, 102, 102));
        btnhex.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnhex.setForeground(new java.awt.Color(255, 255, 255));
        btnhex.setText("Hex");
        btnhex.setActionCommand("");
        btnhex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnhex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhexActionPerformed(evt);
            }
        });

        btnbinary.setBackground(new java.awt.Color(102, 102, 102));
        btnbinary.setFont(new java.awt.Font("Rockwell", 1, 11)); // NOI18N
        btnbinary.setForeground(new java.awt.Color(255, 255, 255));
        btnbinary.setText("Bry");
        btnbinary.setActionCommand("");
        btnbinary.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnbinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbinaryActionPerformed(evt);
            }
        });

        jMenu1.setText("HELP");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Standard");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Scincetific");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnone, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btntwo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnthree, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnfour, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnfive, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnsix, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btnseven, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btnnine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(btnsubtr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(btnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(btntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnbinary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btncbr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnround, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnhex, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(61, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btntanh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnxy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btncbr, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnround, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnx2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGap(2, 2, 2)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btneight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnseven, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnnine, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnsubtr, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(btncosh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(44, 44, 44)))
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnfive, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnfour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnsix, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btntwo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(btnthree, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnbinary, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnhex, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnx3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btndot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.setResizable(true);
        this.setSize(440,350);
        textbox.setSize(400,30);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setResizable(true);
        this.setSize(225, 350);
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setResizable(true);
        this.setSize(225, 350);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btntanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanhActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.tanh(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btntanhActionPerformed

    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.tan(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btntanActionPerformed

    private void btnroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnroundActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.round(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnroundActionPerformed

    private void btncbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncbrActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.cbrt(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btncbrActionPerformed

    private void btnhexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhexActionPerformed
        int a = Integer.parseInt(textbox.getText()); //Hexadecimal.
        textbox.setText(Integer.toString(a,2));
    }//GEN-LAST:event_btnhexActionPerformed

    private void btnbinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbinaryActionPerformed
        int a = Integer.parseInt(textbox.getText()); //Binary.
        textbox.setText(Integer.toString(a,2));

    }//GEN-LAST:event_btnbinaryActionPerformed

    private void btnsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsevenActionPerformed
        // TODO add your handling code here:

        String iNum=textbox.getText()+ btnseven.getText();
        textbox.setText(iNum);

    }//GEN-LAST:event_btnsevenActionPerformed

    private void btneightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneightActionPerformed
        // TODO add your handling code here:
        String iNum=textbox.getText()+ btneight.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btneightActionPerformed

    private void btnnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnineActionPerformed
        // TODO add your handling code here:
        String iNum=textbox.getText()+ btnnine.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnnineActionPerformed

    private void btnfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfourActionPerformed
        // TODO add your handling code here:
        String iNum=textbox.getText()+ btnfour.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnfourActionPerformed

    private void btnfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiveActionPerformed
        // TODO add your handling code here:

        String iNum=textbox.getText()+ btnfive.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnfiveActionPerformed

    private void btnsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsixActionPerformed
        // TODO add your handling code here:

        String iNum=textbox.getText()+ btnsix.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnsixActionPerformed

    private void btnoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoneActionPerformed
        // TODO add your handling code here:

        String iNum=textbox.getText()+ btnone.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnoneActionPerformed

    private void btntwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntwoActionPerformed
        // TODO add your handling code here:

        String iNum=textbox.getText()+ btntwo.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btntwoActionPerformed

    private void btnthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreeActionPerformed
        // TODO add your handling code here:
        String iNum=textbox.getText()+ btnthree.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnthreeActionPerformed

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed
        // TODO add your handling code here:
        String iNum=textbox.getText()+ btnzero.getText();
        textbox.setText(iNum);
    }//GEN-LAST:event_btnzeroActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        textbox.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        String bsp = null;


        if(textbox.getText().length() <= 0) {
        } else {
        }      {
            StringBuilder strB = new StringBuilder(textbox.getText());
            strB.deleteCharAt(textbox.getText().length() - 1);
            bsp = strB.toString();
            textbox.setText(bsp);

        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if(!textbox.getText().contains("."));

        {
            textbox.setText(textbox.getText() + btndot.getText());
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=ops * (-1);
        textbox. setText(String.valueOf(ops));

    }//GEN-LAST:event_btnplusActionPerformed

    private void textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textboxActionPerformed

    private void btnrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrootActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.sqrt(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnrootActionPerformed

    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.log(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnlogActionPerformed

    private void btnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.sin(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnsinActionPerformed

    private void btnsinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinhActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.sinh(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnsinhActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.cos(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btncosActionPerformed

    private void btncoshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncoshActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.cosh(ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btncoshActionPerformed

    private void btnxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxActionPerformed
        double ops ;
        ops= (3.1415926535897932384626433832795);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnxActionPerformed

    private void btnxyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxyActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=Math.pow(ops, ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnxyActionPerformed

    private void btnx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx2ActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=(ops * ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnx2ActionPerformed

    private void btnx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnx3ActionPerformed
        double ops = Double.parseDouble(String.valueOf(textbox.getText()));
        ops=(ops * ops * ops);
        textbox. setText(String.valueOf(ops));
    }//GEN-LAST:event_btnx3ActionPerformed

    private void textboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textboxKeyTyped
        char c =evt.getKeyChar();
        if(!((c == KeyEvent.VK_DELETE) || Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_textboxKeyTyped

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed


        if (operations == "+")
        {
            secondnum = Double.parseDouble(textbox.getText());
            result = firstnum + secondnum;
            answer = answer.valueOf(result);
            textbox.setText(answer);
        }
        if (operations == "*")
        {
            secondnum = Double.parseDouble(textbox.getText());
            result = firstnum * secondnum;
            answer = answer.valueOf(result);
            textbox.setText(answer);
        }
        if (operations == "/")
        {
            secondnum = Double.parseDouble(textbox.getText());
            result = firstnum / secondnum;
            answer = answer.valueOf(result);
            textbox.setText(answer);
        }
        if (operations == "-")
        {
            secondnum = Double.parseDouble(textbox.getText());
            result = firstnum - secondnum;
            answer = answer.valueOf(result);
            textbox.setText(answer);
        }





    }//GEN-LAST:event_btnequalActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        firstnum = Double.parseDouble(textbox.getText());
        textbox.setText("");
        operations=("+");
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsubtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubtrActionPerformed
        firstnum = Double.parseDouble(textbox.getText());
        textbox.setText("");
        operations=("-");
    }//GEN-LAST:event_btnsubtrActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        firstnum = Double.parseDouble(textbox.getText());
        textbox.setText("");
        operations=("*");
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivideActionPerformed
        firstnum = Double.parseDouble(textbox.getText());
        textbox.setText("");
        operations=("/");
    }//GEN-LAST:event_btndivideActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScientificCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ScientificCalculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbinary;
    private javax.swing.JButton btncbr;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btncosh;
    private javax.swing.JButton btndivide;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btneight;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnfive;
    private javax.swing.JButton btnfour;
    private javax.swing.JButton btnhex;
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnnine;
    private javax.swing.JButton btnone;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnroot;
    private javax.swing.JButton btnround;
    private javax.swing.JButton btnseven;
    private javax.swing.JButton btnsin;
    private javax.swing.JButton btnsinh;
    private javax.swing.JButton btnsix;
    private javax.swing.JButton btnsubtr;
    private javax.swing.JButton btntan;
    private javax.swing.JButton btntanh;
    private javax.swing.JButton btnthree;
    private javax.swing.JButton btntwo;
    private javax.swing.JButton btnx;
    private javax.swing.JButton btnx2;
    private javax.swing.JButton btnx3;
    private javax.swing.JButton btnxy;
    private javax.swing.JButton btnzero;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField textbox;
    // End of variables declaration//GEN-END:variables
}


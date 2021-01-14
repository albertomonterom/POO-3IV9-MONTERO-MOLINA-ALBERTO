package gato;

import java.awt.Color;
import javax.swing.*;

public class Tablero extends javax.swing.JFrame {

    
    static boolean ganador = false;
    static int empate = 1;
    static boolean turno = true;
    static String nombre1 = "", nombre2 = "";
    static int ganaj1 = 0, ganaj2 = 0;

    public Tablero() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        j1 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        r2 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        t3 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        t2 = new javax.swing.JLabel();
        p11 = new javax.swing.JPanel();
        t1 = new javax.swing.JLabel();
        p9 = new javax.swing.JPanel();
        t9 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        t6 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        t5 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        t4 = new javax.swing.JLabel();
        p8 = new javax.swing.JPanel();
        t8 = new javax.swing.JLabel();
        p7 = new javax.swing.JPanel();
        t7 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        tg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setMaximumSize(new java.awt.Dimension(2000, 2000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("-----------------------");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("-----------------------");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("|");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setText("|");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setText("|");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("|");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setText("|");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel8.setText("|");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        j1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 0, 0));
        j1.setText("Jugador 1:");

        r1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        r1.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        r2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        r2.setText("0");

        j2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        j2.setForeground(new java.awt.Color(0, 0, 204));
        j2.setText("Jugador 2: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setPreferredSize(new java.awt.Dimension(95, 62));

        t3.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t3.setText("3");
        t3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(t3))
        );

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setPreferredSize(new java.awt.Dimension(95, 62));

        t2.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t2.setText("2");
        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p11.setBackground(new java.awt.Color(255, 255, 255));
        p11.setPreferredSize(new java.awt.Dimension(95, 62));

        t1.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t1.setText("1");
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p11Layout = new javax.swing.GroupLayout(p11);
        p11.setLayout(p11Layout);
        p11Layout.setHorizontalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        p11Layout.setVerticalGroup(
            p11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p11Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(t1))
        );

        p9.setBackground(new java.awt.Color(255, 255, 255));

        t9.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t9.setText("9");
        t9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p9Layout = new javax.swing.GroupLayout(p9);
        p9.setLayout(p9Layout);
        p9Layout.setHorizontalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        p9Layout.setVerticalGroup(
            p9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p9Layout.createSequentialGroup()
                .addComponent(t9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p6.setBackground(new java.awt.Color(255, 255, 255));

        t6.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t6.setText("6");
        t6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(t6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        p5.setBackground(new java.awt.Color(255, 255, 255));

        t5.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t5.setText("5");
        t5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(t5)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        p4.setBackground(new java.awt.Color(255, 255, 255));

        t4.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t4.setText("4");
        t4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p8.setBackground(new java.awt.Color(255, 255, 255));

        t8.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t8.setText("8");
        t8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p8Layout = new javax.swing.GroupLayout(p8);
        p8.setLayout(p8Layout);
        p8Layout.setHorizontalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p8Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(t8)
                .addGap(22, 22, 22))
        );
        p8Layout.setVerticalGroup(
            p8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p8Layout.createSequentialGroup()
                .addComponent(t8)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        p7.setBackground(new java.awt.Color(255, 255, 255));

        t7.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        t7.setText("7");
        t7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p7Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addComponent(t7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        t.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        tg.setBackground(new java.awt.Color(255, 255, 255));
        tg.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(16, 16, 16)
                        .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(p11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel6))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31))))
                            .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(t)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3)
                    .addComponent(p11, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p8, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(p9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(p7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        jButton2.setText("Limpiar mesa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nuevo juego");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addGap(53, 53, 53))
        );

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("GATO (3 en raya)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel9)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        
        if (t2.getText().equals("2")) {
            if (turno) {               
                t2.setText("X");               
                t2.setForeground(Color.red);               
                hayGanador();       
                empate++;
               
                turno = false;
                //si no 
            } else {
                t2.setText("O");
                t2.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t2MouseClicked

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
        if (t1.getText().equals("1")) {
            if (turno) {
                t1.setText("X");
                t1.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t1.setText("O");
                t1.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t1MouseClicked

    private void t3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t3MouseClicked
        if (t3.getText().equals("3")) {
            if (turno) {
                t3.setText("X");
                t3.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t3.setText("O");
                t3.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }

    }//GEN-LAST:event_t3MouseClicked

    private void t4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t4MouseClicked
        if (t4.getText().equals("4")) {
            if (turno) {
                t4.setText("X");
                t4.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t4.setText("O");
                t4.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t4MouseClicked

    private void t5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t5MouseClicked
        if (t5.getText().equals("5")) {
            if (turno) {
                t5.setText("X");
                t5.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t5.setText("O");
                t5.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t5MouseClicked

    private void t6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t6MouseClicked
        if (t6.getText().equals("6")) {
            if (turno) {
                t6.setText("X");
                t6.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t6.setText("O");
                t6.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t6MouseClicked

    private void t7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t7MouseClicked
        if (t7.getText().equals("7")) {
            if (turno) {
                t7.setText("X");
                t7.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t7.setText("O");
                t7.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t7MouseClicked

    private void t9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t9MouseClicked
        if (t9.getText().equals("9")) {
            if (turno) {
                t9.setText("X");
                t9.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t9.setText("O");
                t9.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t9MouseClicked

    //al dar clik a el boton limpirar mesa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // metodo que limpia la mesa o tablero
        LimpiarTablero();

    }//GEN-LAST:event_jButton2ActionPerformed

    //si da clik sobre el boton nueva partdida
    // la nueva partida borra todos los datos
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //pregunto si la persona esta segura de cargar una nueva partida
        int seleccion = JOptionPane.showConfirmDialog(null, "Si carga una nueva partida los datos de la partida actual se perderan"
                + "\n¿Desea continuar con esta accion?",
                "mensaje",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

        // los JOptionPane.showConfirmDialog irven para confirma una accion o preguntar si se quiere realizar algo
        // manejan en este programa dos opciones
        // YES_NO_OPTION yes = 0 y no = 1

        // si esta segura
        if (seleccion == 0) {
            // borro los Jjlabel de los resultados r2 y r1;
            // y los de los jugadores j1 y j2;
            j1.setText("");
            j2.setText("");
            r1.setText("0");
            r2.setText("0");
            tg.setText("");

            //pido que ingresen los nuevos nombres de losjuadores
            nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 1");
            j1.setText(nombre1);
            while (j1.getText().equals("")) {
                nombre1 = JOptionPane.showInputDialog("Debe ingresar un nombre");
                j1.setText(nombre1);
            }
            nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 2");
            j2.setText(nombre2);
            while (j2.getText().equals("")) {
                nombre2 = JOptionPane.showInputDialog("Debe ingresar un nombre");
                j2.setText(nombre2);
            }
            JOptionPane.showMessageDialog(null, "A jugar");
            LimpiarTablero();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void t8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t8MouseClicked
        if (t8.getText().equals("8")) {
            if (turno) {
                t8.setText("X");
                t8.setForeground(Color.red);
                hayGanador();
                empate++;
                turno = false;
            } else {
                t8.setText("O");
                t8.setForeground(Color.blue);
                hayGanador();
                empate++;
                turno = true;
            }
            validarTurno();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla esta ocupada, intente con otra");
        }
    }//GEN-LAST:event_t8MouseClicked

   // boton "salir" del juego
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // pregunta
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea abandordar el juego?", "mensaje",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);

        if (seleccion == 0) {
            JOptionPane.showMessageDialog(null, "Muchas gracias por jugar");
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // metodo hay ganador busca si hay un ganador

    public static void hayGanador() {

        boolean sw = false; // es falso q hay ganadores
        // si sw = true no puede haber empate


        // se compara si hay alineados de forma vertical
        // tres figuras iguales


        //----comparaciones horizontales

        //son estas
        //    xxx   ooo

        //comparamos figuras en los jlabel
        if (t1.getText().equals(t2.getText()) && t1.getText().equals(t3.getText())) {
            //pintamos de marillo la terna como ganaron
            p11.setBackground(Color.yellow);
            p2.setBackground(Color.yellow);
            p1.setBackground(Color.yellow);
            // invocamos el metodo de danador
            ganador();
            // es verdadero que hubo un ganador
            sw = true;
        }
        if (t4.getText().equals(t5.getText()) && t4.getText().equals(t6.getText())) {
            p4.setBackground(Color.yellow);
            p5.setBackground(Color.yellow);
            p6.setBackground(Color.yellow);
            ganador();
            sw = true;
        }
        if (t7.getText().equals(t8.getText()) && t7.getText().equals(t9.getText())) {
            p7.setBackground(Color.yellow);
            p8.setBackground(Color.yellow);
            p9.setBackground(Color.yellow);
            ganador();
            sw = true;
        }

        // -----comparaciones verticales

        //  o  x
        //  o  x
        //  o  x

        if (t1.getText().equals(t4.getText()) && t1.getText().equals(t7.getText())) {
            p11.setBackground(Color.yellow);
            p4.setBackground(Color.yellow);
            p7.setBackground(Color.yellow);
            ganador();
            sw = true;
        }
        if (t2.getText().equals(t5.getText()) && t2.getText().equals(t8.getText())) {
            p2.setBackground(Color.yellow);
            p5.setBackground(Color.yellow);
            p8.setBackground(Color.yellow);
            ganador();
            sw = true;
        }
        if (t3.getText().equals(t6.getText()) && t3.getText().equals(t9.getText())) {
            p1.setBackground(Color.yellow);
            p6.setBackground(Color.yellow);
            p9.setBackground(Color.yellow);
            ganador();
            sw = true;
        }

        // compaciones diagonales

        //  x       o
        //   x     o
        //    x   o

        if (t1.getText().equals(t5.getText()) && t1.getText().equals(t9.getText())) {
            p11.setBackground(Color.yellow);
            p5.setBackground(Color.yellow);
            p9.setBackground(Color.yellow);
            ganador();
            sw = true;
        }
        if (t7.getText().equals(t5.getText()) && t7.getText().equals(t3.getText())) {
            p7.setBackground(Color.yellow);
            p5.setBackground(Color.yellow);
            p1.setBackground(Color.yellow);
            ganador();
            sw = true;
        }

        // si el empate 9 y falso que hay ganadores
        // si hubieron nueve cliks en los numeros y no hubo ganador de la partida
        if (empate == 9 && sw == false) {
            tg.setText("Empataron");

            // empiesa la nueva partida el jugador contraio al que la termino
            if (turno) {
                turno = false;
            } else {
                turno = true;
            }

            // pregunto si quieren jugar otra partida
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Quieren jugar otra partida?", "mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
            if (seleccion == 0) {
                LimpiarTablero();
            } else {
                // si no hubo empate el el resultado final y el turno es verdadero
                if (turno && !validarEmpate()) {
                    // muestro el resultado final y el ganador es el jugador1
                    JOptionPane.showMessageDialog(null, "Resultado final."
                            + "\n" + nombre1 + ": " + r1.getText()
                            + "\n" + nombre2 + ": " + r2.getText()
                            + "\nFelicidades" + nombre1
                            + "\nEres el ganador");
                } else {
                    // si no hubo empate el el resultado final y el turno falso
                    if (!turno && !validarEmpate()) {
                        // muestro el resultado final y el ganador es el jugador2
                        JOptionPane.showMessageDialog(null, "Resultado final."
                                + "\n" + nombre1 + ": " + r1.getText()
                                + "\n" + nombre2 + ": " + r2.getText()
                                + "\nFelicidades" + nombre2
                                + "\nEres el ganador");
                    } else {
                        //en otro caso resultado final empate
                        JOptionPane.showMessageDialog(null, "Resultado final"
                                + "\n" + nombre1 + ": " + r1.getText()
                                + "\n" + nombre2 + ": " + r2.getText()
                                + "\nEmpataron");
                    }
                }
                // intruciion que cierra aplicaciones
                System.exit(0);
            }
        }


    }
    // metodo que se ejecuta si hubo un ganador

    public static void ganador() {
        int seleccion = 2; // para el JOptionPane.showConfirmDialog
        // si hubo un ganador en turno verdadero (gano jugador 1)
        if (turno) {
            // muestro el nombre del jugador ganador en con el color de la ficah que le corresponde
            tg.setForeground(Color.red);
            tg.setText(nombre1 + "GANASTE");
            // aumento el puntaje del jugaor 1
            ganaj1++;

            //esta intruccion convierte numeros a String
            //por q los jlabel solo aceptan string
            //convieryo el resultado del jugador uno "ganaj1" en string y lo guardo en un String "auxganaj1"
            String auxganaj1 = Integer.toString(ganaj1);
            //muestro el resultado en el tablero con jlabel llmado r1
            r1.setText(auxganaj1);
            // pregunto si quieren jugar otra partida
            seleccion = JOptionPane.showConfirmDialog(p1, "¿Quieren jugar otra partida?", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
            // en otro caso Si(ganador en posicion falso"ganador jugador 1")
        } else {
            // muestro el nombre del jugador ganador en con el color de la ficah que le corresponde
            tg.setForeground(Color.blue);
            tg.setText(nombre2 + "GANASTE");
            // aumento el puntaje del jugaor 1
            ganaj2++;

            //esta intruccion convierte numeros a String
            //por q los jlabel solo aceptan string
            //convieryo el resultado del jugador uno "ganaj1" en string y lo guardo en un String "auxganaj1"
            String auxganaj2 = Integer.toString(ganaj2);
            //muestro el resultado en el tablero con jlabel llmado r2
            r2.setText(auxganaj2);
            // pregunto si quieren jugar otra partida
            seleccion = JOptionPane.showConfirmDialog(null, "¿Quieren jugar otra partida?", "mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        }
        // si sellecion es 0
        // quieren seguir jugando
        if (seleccion == 0) {
            // limpio el tablero
            LimpiarTablero();
            // en otro caso (si seleccion = 1)
            // no quieren jugar mas
        } else {
            // muestro resultado final
            if (turno && !validarEmpate()) {
                JOptionPane.showMessageDialog(null, "Resultado final"
                        + "\n" + nombre1 + ": " + r1.getText()
                        + "\n" + nombre2 + ": " + r2.getText()
                        + "\nFelicidades" + nombre1
                        + "\nEres el ganador");
            } else {
                if (!turno && !validarEmpate()) {
                    JOptionPane.showMessageDialog(null, "Resultado final."
                            + "\n" + nombre1 + ": " + r1.getText()
                            + "\n" + nombre2 + ": " + r2.getText()
                            + "\nFelicidades" + nombre2
                            + "\nEres el ganador");
                } else {
                    JOptionPane.showMessageDialog(null, "Resultado final"
                            + "\n" + nombre1 + ": " + r1.getText()
                            + "\n" + nombre2 + ": " + r2.getText()
                            + "\nEmpataron");
                }
            }
            // ncierro la aplicacion
            System.exit(0);
        }

    }

    // limpia el tablero
    public static void LimpiarTablero() {

        // limpio el jlabel que muestra en turno
        tg.setText("");
        // cambioe el color a negro del jlabel que muestra el turno
        tg.setForeground(Color.black);
        t.setText("");

        // limpio las x y o por los numeros
        t1.setText("1");
        t2.setText("2");
        t3.setText("3");
        t4.setText("4");
        t5.setText("5");
        t6.setText("6");
        t7.setText("7");
        t8.setText("8");
        t9.setText("9");

        // reamplazo los colores rojo y negro del los jlabel
        t1.setForeground(Color.black);
        t2.setForeground(Color.black);
        t3.setForeground(Color.black);
        t4.setForeground(Color.black);
        t5.setForeground(Color.black);
        t6.setForeground(Color.black);
        t7.setForeground(Color.black);
        t8.setForeground(Color.black);
        t9.setForeground(Color.black);

        // cambio los colores de amariilo  blanco de los paneles
        // estos son los q se pintan de amarillo
        // cuando hay un ganador
        p11.setBackground(Color.white);
        p2.setBackground(Color.white);
        p1.setBackground(Color.white);
        p4.setBackground(Color.white);
        p5.setBackground(Color.white);
        p6.setBackground(Color.white);
        p8.setBackground(Color.white);
        p7.setBackground(Color.white);
        p9.setBackground(Color.white);
        empate = 0;

        // y muestro el turno en el tablero del jugador
        if (turno) {
            t.setText("tu turno " +nombre1);
            t.setForeground(Color.red);
        } else {
            t.setText("tu turno " +nombre2);
            t.setForeground(Color.blue);
        }

    }

    // este metofo me retirna falso o verdadero
    // si hay un empate de puntos
    public static boolean validarEmpate() {
        // si el jalbel de los resultados r1 y r2 son iguales
        // hay empate general de puntos
        if (r1.getText().equals(r2.getText())) {
            return true;
        } else {
            return false;
        }
    }

    // esta metodo valida el turno
    // y muestra en pantalla a los jugadores
    // quien es el siguinete
    public static void validarTurno() {
        // si el turno es verdader0
        if (turno) {
            // muestra el rojo un texto que dice q el jugador q es el proximo jugador 1
            t.setText("TU TURNO" +nombre1);
            t.setForeground(Color.red);
            // en otro caso (si el turno es falso)
        } else {
            // muestra el azul un texto que dice q el jugador q es el proximo jugador 2
            t.setText("TU TURNO" +nombre2);
            t.setForeground(Color.blue);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {





        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tablero().setVisible(true);



                // antes que empiese el juego se piden los nombres
                // si los jugadores no escriben su nombre.
                // no se les deja seguir y vulve y se les pide
                nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 1");
                j1.setText(nombre1);
                while (j1.getText().equals("")) {
                    nombre1 = JOptionPane.showInputDialog("Debe ingresar un nombre");
                    j1.setText(nombre1);
                }
                nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 2");
                j2.setText(nombre2);
                while (j2.getText().equals("")) {
                    nombre2 = JOptionPane.showInputDialog("Debe ingresar un nombre");
                    j2.setText(nombre2);
                }

                JOptionPane.showMessageDialog(null, "A jugar");

                // cada ves q se abre el juego empiesa el jugador 1
                t.setText("TU TURNO" +nombre1);
                t.setForeground(Color.red);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel j1;
    private static javax.swing.JLabel j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private static javax.swing.JPanel p1;
    private static javax.swing.JPanel p11;
    private static javax.swing.JPanel p2;
    private static javax.swing.JPanel p4;
    private static javax.swing.JPanel p5;
    private static javax.swing.JPanel p6;
    private static javax.swing.JPanel p7;
    private static javax.swing.JPanel p8;
    private static javax.swing.JPanel p9;
    private static javax.swing.JLabel r1;
    private static javax.swing.JLabel r2;
    private static javax.swing.JLabel t;
    private static javax.swing.JLabel t1;
    private static javax.swing.JLabel t2;
    private static javax.swing.JLabel t3;
    private static javax.swing.JLabel t4;
    private static javax.swing.JLabel t5;
    private static javax.swing.JLabel t6;
    private static javax.swing.JLabel t7;
    private static javax.swing.JLabel t8;
    private static javax.swing.JLabel t9;
    private static javax.swing.JLabel tg;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsearcher2;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shofol
 */
public class sponsorevent extends javax.swing.JFrame {

    /**
     * Creates new form example
     */
    Connection conn = null;
    sponsorconnection a = null;
    String sponname = null;
    String sponpass = null;
    int sponid = 0;
    int fid = 0;

    public sponsorevent() throws ClassNotFoundException {
        initComponents();
        conn = a.sponconnection();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Event = new javax.swing.JTable();
        jFest = new javax.swing.JLabel();
        jPlatinum = new javax.swing.JCheckBox();
        jGold = new javax.swing.JCheckBox();
        jSilver = new javax.swing.JCheckBox();
        platinum = new javax.swing.JLabel();
        gold = new javax.swing.JLabel();
        silver = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("Home");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<-");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSave.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jSave.setText("Save ");
        jSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jSave.setContentAreaFilled(false);
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        Event.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Event.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Event.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Event);

        jFest.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jFest.setForeground(new java.awt.Color(255, 255, 255));

        jPlatinum.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jPlatinum.setText("Platinum");

        jGold.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jGold.setText("Gold");

        jSilver.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jSilver.setText("Silver");

        platinum.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        platinum.setForeground(new java.awt.Color(255, 255, 255));

        gold.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        gold.setForeground(new java.awt.Color(255, 255, 255));

        silver.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        silver.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jGold, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPlatinum)
                                    .addComponent(jSilver, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(239, 239, 239)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gold)
                                        .addComponent(platinum))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(silver)
                                        .addGap(1, 1, 1)))
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFest)
                                .addGap(183, 183, 183)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPlatinum)
                            .addComponent(platinum))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jGold)
                            .addComponent(gold))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSilver)
                            .addComponent(silver))
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jFest)))
                        .addGap(18, 18, 18)
                        .addComponent(jSave)
                        .addGap(54, 54, 54))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventsearcher2/images/meetsponsor.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void showEvent() throws SQLException {

        CallableStatement csmt = null;
        String proc = "{?= call admin.getsponid(?,?)}";
        csmt = conn.prepareCall(proc);
        csmt.registerOutParameter(1, Types.INTEGER);
        csmt.setString(2, sponname);
        csmt.setString(3, sponpass);
        csmt.execute();

        sponid = csmt.getInt(1);

        String pr = null;
        pr = "{?= call admin.showreqevent(?,?)}";
        csmt = conn.prepareCall(pr);
        csmt.registerOutParameter(1, Types.ARRAY, "ADMIN.NAMEARR");
        csmt.setInt(2, sponid);

        csmt.registerOutParameter(3, Types.INTEGER);
        csmt.execute();

        Array arr = csmt.getArray(1);
        String[] data = null;
        if (arr != null) {
            data = (String[]) arr.getArray();
            int counter = csmt.getInt(3);
            for (int i = 0; i < counter; i++) {
                Object Name = data[i];
                Event.getModel().setValueAt(Name, i, 0);
            }
        }

    }

    public void setspon(String name, String pass) throws SQLException {
        sponname = name;
        sponpass = pass;
        showEvent();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sponoption a = new sponoption();
        a.setspon(sponname, sponpass);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        startpage a = new startpage();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    String select = null;

    private void EventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventMouseClicked
        CallableStatement cs = null;
        try {

            int sr = Event.getSelectedRow();

            select = Event.getModel().getValueAt(sr, 0).toString();

            String pr = "{?= call admin.GETFESTID(?)}";
            cs = conn.prepareCall(pr);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, select);
            cs.execute();
            fid = cs.getInt(1);

            CallableStatement csmt = null;

            String proc = ("begin admin.sponamount(?,?,?,?); end;");

            csmt = conn.prepareCall(proc);
            csmt.registerOutParameter(2, Types.INTEGER);
            csmt.registerOutParameter(3, Types.INTEGER);
            csmt.registerOutParameter(4, Types.INTEGER);
            csmt.setInt(1, fid);
            csmt.execute();

            int pla = csmt.getInt(2);
            int gol = csmt.getInt(3);
            int silv = csmt.getInt(4);
            jFest.setText(select);
            platinum.setText(Integer.toString(pla));
            gold.setText(Integer.toString(gol));
            silver.setText(Integer.toString(silv));

        } catch (SQLException ex) {
            Logger.getLogger(searchdevent.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_EventMouseClicked

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed

        //  JOptionPane.showMessageDialog(null,select);
        try {
            CallableStatement cs = null;
            String pr = "{?= call admin.GETFESTID(?)}";
            cs = conn.prepareCall(pr);
            cs.registerOutParameter(1, Types.INTEGER);
            cs.setString(2, select);
            cs.execute();
            fid = cs.getInt(1);

            String typ1 = null;
            String typ2 = null;
            String typ3 = null;
            int amount = 0;
            String pstatus = null;
            String gstatus = null;
            String sstatus = null;
            boolean flag=false;
            if (jPlatinum.isSelected()) {

                CallableStatement cstmt = null;
                cstmt = conn.prepareCall("begin admin.getstatus(?,?,?);end;");
                cstmt.registerOutParameter(3, Types.VARCHAR);
                cstmt.setInt(1, fid);
                cstmt.setString(2, "Platinum");
                cstmt.execute();
                pstatus = cstmt.getString(3);

                if (pstatus.equals("UNPAID")) {
                    typ1 = "Platinum";
                    amount = amount + Integer.parseInt(platinum.getText());
                    flag=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Platinum is taken");
                }

            }
            if (jGold.isSelected()) {
                CallableStatement cstmt = null;
                cstmt = conn.prepareCall("begin admin.getstatus(?,?,?);end;");
                cstmt.registerOutParameter(3, Types.VARCHAR);
                cstmt.setInt(1, fid);
                cstmt.setString(2, "Gold");
                cstmt.execute();
                gstatus = cstmt.getString(3);

                if (gstatus.equals("UNPAID")) {
                    typ2 = "Gold";
                    amount = amount + Integer.parseInt(gold.getText());
                    flag=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Gold is taken");
                }
            }
            if (jSilver.isSelected()) {

                CallableStatement cstmt = null;
                cstmt = conn.prepareCall("begin admin.getstatus(?,?,?);end;");
                cstmt.registerOutParameter(3, Types.VARCHAR);
                cstmt.setInt(1, fid);
                cstmt.setString(2, "Silver");
                cstmt.execute();
                sstatus = cstmt.getString(3);

                if (sstatus.equals("UNPAID")) {
                    typ3 = "Silver";
                    amount = amount + Integer.parseInt(silver.getText());
                    flag=true;
                } else {
                    JOptionPane.showMessageDialog(null, "Silver is taken");
                }
            }
            if(flag){
            CallableStatement cst = null;
            cst = conn.prepareCall("begin admin.updateSpon(?,?,?,?,?,?); end;");
            cst.setInt(1, fid);
            cst.setInt(2, sponid);
            cst.setString(3, typ1);
            cst.setString(4, typ2);
            cst.setString(5, typ3);
            cst.setInt(6, amount);
            cst.execute();
             JOptionPane.showMessageDialog(null,"Successfully Added!!");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please !! select a module ");
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(sponsorevent.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jSaveActionPerformed

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
            java.util.logging.Logger.getLogger(sponsorevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sponsorevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sponsorevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sponsorevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new sponsorevent().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(sponsorevent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Event;
    private javax.swing.JLabel gold;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jFest;
    private javax.swing.JCheckBox jGold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jPlatinum;
    private javax.swing.JButton jSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jSilver;
    private javax.swing.JLabel platinum;
    private javax.swing.JLabel silver;
    // End of variables declaration//GEN-END:variables
}

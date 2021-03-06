/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsearcher2;

import java.sql.Array;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Shofol
 */
public class filterdsearch extends javax.swing.JFrame {

    Connection conn = null;
    Statement s = null;
    ResultSet r = null;
    String searchedname;
    userconnection a = new userconnection();

    /**
     * Creates new form example
     */
    public filterdsearch() {
        initComponents();
    }

    public filterdsearch(String sr) throws ClassNotFoundException {
        initComponents();
        searchedname = sr;

        CallableStatement csmt = null;
        conn = a.usersconnection();

        String proc = "{?= call admin.showname(?,?)}";
        try {
            csmt = conn.prepareCall(proc);
            csmt.registerOutParameter(1, Types.ARRAY, "ADMIN.NAMEARR");
            csmt.setString(2, searchedname);

            csmt.registerOutParameter(3, Types.INTEGER);
            csmt.execute();

            Array arr = csmt.getArray(1);
            String[] data = null;
            if (arr != null) {
                data = (String[]) arr.getArray();
            }

            int counter = csmt.getInt(3);
            for (int i = 0; i < counter; i++) {
                Object Name = data[i];
                eventlist.getModel().setValueAt(Name, i, 0);
            }

        } catch (SQLException ex) {
            Logger.getLogger(filterdsearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventlist = new javax.swing.JTable();
        ename = new javax.swing.JLabel();
        etype = new javax.swing.JLabel();
        evenue = new javax.swing.JLabel();
        edate = new javax.swing.JLabel();
        edetails = new javax.swing.JLabel();
        elink = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        from = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        to = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        eventlist.setAutoCreateRowSorter(true);
        eventlist.setBackground(new java.awt.Color(53, 74, 95));
        eventlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eventlist.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        eventlist.setForeground(new java.awt.Color(255, 255, 255));
        eventlist.setModel(new javax.swing.table.DefaultTableModel(
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
                {null}
            },
            new String [] {
                "Event Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventlist.setGridColor(new java.awt.Color(255, 255, 255));
        eventlist.setRowHeight(25);
        eventlist.setSelectionForeground(new java.awt.Color(255, 51, 51));
        eventlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventlistMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(eventlist);

        ename.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        ename.setForeground(new java.awt.Color(255, 255, 255));

        etype.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        etype.setForeground(new java.awt.Color(255, 255, 255));

        evenue.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        evenue.setForeground(new java.awt.Color(255, 255, 255));

        edate.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        edate.setForeground(new java.awt.Color(255, 255, 255));

        edetails.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        edetails.setForeground(new java.awt.Color(255, 255, 255));

        elink.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        elink.setForeground(new java.awt.Color(255, 255, 255));

        duration.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        duration.setForeground(new java.awt.Color(255, 255, 255));

        from.setDateFormatString("MMM,d, yyyy");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From: ");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("To:");

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jButton2.setText("<-");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(edetails)
                                    .addComponent(elink)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                        .addGap(63, 63, 63)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(edate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(duration)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etype)
                                    .addComponent(ename)
                                    .addComponent(evenue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(to, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                    .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ename))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(etype)
                                .addGap(18, 18, 18)
                                .addComponent(evenue)
                                .addGap(18, 18, 18)
                                .addComponent(edate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(duration)))
                        .addGap(25, 25, 25)
                        .addComponent(edetails)
                        .addGap(18, 18, 18)
                        .addComponent(elink))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventsearcher2/images/showevent.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventlistMouseClicked
        int sr = eventlist.getSelectedRow();
        String select = eventlist.getModel().getValueAt(sr, 0).toString();

        // userconnection a = new userconnection();
        CallableStatement csmt = null;

        String proc = "begin admin.showevent(?,?,?,?,?,?,?,?);end;";

        try {
            csmt = conn.prepareCall(proc);
            csmt.setString(1, select);
            csmt.registerOutParameter(2, Types.VARCHAR);
            csmt.registerOutParameter(3, Types.VARCHAR);
            csmt.registerOutParameter(4, Types.VARCHAR);
            csmt.registerOutParameter(5, Types.DATE);
            csmt.registerOutParameter(6, Types.VARCHAR);
            csmt.registerOutParameter(7, Types.VARCHAR);
            csmt.registerOutParameter(8, Types.INTEGER);

            csmt.execute();

            String name = csmt.getString(2);
            String type = csmt.getString(3);
            String venue = csmt.getString(4);
            String date = csmt.getDate(5).toString();
            String details = csmt.getString(6);
            String link = csmt.getString(7);
            int dura = csmt.getInt(8);

            ename.setText(name);
            etype.setText(type);
            evenue.setText(venue);
            edate.setText(date);
            edetails.setText(details);
            elink.setText(link);
            duration.setText(Integer.toString(dura));
            // System.out.println(name + " " + type + " " + venue + " " + " " + date + " " + details + " " + link + " " + dura);

        } catch (SQLException ex) {
            Logger.getLogger(orgsignin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eventlistMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String d1  = ((JTextField)from.getDateEditor().getUiComponent()).getText();
        String d2  = ((JTextField)to.getDateEditor().getUiComponent()).getText();
        CallableStatement csmt = null;
        try {
            try {
                conn = a.usersconnection();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(filterdsearch.class.getName()).log(Level.SEVERE, null, ex);
            }
        String proc = "{?= call admin.shownamedate(?,?,?)}";
        
            csmt = conn.prepareCall(proc);
            csmt.registerOutParameter(1, Types.ARRAY, "ADMIN.NAMEARR");
            csmt.setString(3,d1);
            csmt.setString(4,d2);
            csmt.registerOutParameter(2, Types.INTEGER);
            
            
            csmt.execute();

            Array arr = csmt.getArray(1);
            String[] data = null;
            if (arr != null) {
                data = (String[]) arr.getArray();
            }

            int counter = csmt.getInt(2);
            for (int i = 0; i < counter; i++) {
                Object Name = data[i];
                eventlist.getModel().setValueAt(Name, i, 0);
            }

        } catch (SQLException ex) {
            Logger.getLogger(filterdsearch.class.getName()).log(Level.SEVERE, null, ex);

        
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        searcher a=new searcher();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(filterdsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(filterdsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(filterdsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(filterdsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new filterdsearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel duration;
    private javax.swing.JLabel edate;
    private javax.swing.JLabel edetails;
    private javax.swing.JLabel elink;
    private javax.swing.JLabel ename;
    private javax.swing.JLabel etype;
    private javax.swing.JTable eventlist;
    private javax.swing.JLabel evenue;
    private com.toedter.calendar.JDateChooser from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser to;
    // End of variables declaration//GEN-END:variables
}

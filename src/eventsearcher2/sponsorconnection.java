/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventsearcher2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shofol
 */
public class sponsorconnection {
    
public static Connection  sponconnection() throws ClassNotFoundException{
    try {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.220.62.85:1521/XE", "Sponsor", "spon");

       
        return conn;
    } catch (SQLException ex) {
        Logger.getLogger(sponsorconnection.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, ex);
    }
    return null;
}
  public static void main(String[] args) {
        // TODO code application logic here
    }

}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.fastenalcompany.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stone Chao <alpseinstein@gmail.com>
 */
public class DBManager {
    

    
    public Connection getMysqlConn() throws SQLException{
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://IPRO/Winter2015";
            conn=DriverManager.getConnection(url,"Winter2015","P@ssw0rd");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public Connection getDB2Conn() throws SQLException{
        Connection conn = null;
        try {
            Class.forName("com.ibm.as400.access.AS400JDBCDriver");
            String url = "jdbc:as400://174.79.32.158/IBM61";
            conn=DriverManager.getConnection(url,"IBM61","IBM61");
   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    public Connection getOracleConn() throws SQLException{
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@//myhost:1521/orcl";
            conn=DriverManager.getConnection(url,"Winter2015","P@ssw0rd");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}

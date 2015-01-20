/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.fastenalcompany;

import ca.lambtoncollege.fastenalcompany.datasource.DBManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stone Chao <alpseinstein@gmail.com>
 */
public class OrderManager {
    private Queue<Order> orders;
    
    public OrderManager(){
         orders = new ArrayDeque<>();
    }
    
    public void orderArrives(){
        Order order = new Order();
        Customer customer = new Customer(1,"jim");
        order.setCustomer(customer);
        List<Purchase>  purchases= new ArrayList<>();
        purchases.add(new Purchase(1,1));
        order.setPurchase(purchases);
        orders.add(order);
    }
    
    public void connect(){
        DBManager db= new DBManager();
        Connection conn = null;
        try {
            conn = db.getMysqlConn();
            String query = "select * from sample";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("name")+"\t"+rs.getInt("age"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FastenalCompany.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(conn!=null)conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FastenalCompany.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

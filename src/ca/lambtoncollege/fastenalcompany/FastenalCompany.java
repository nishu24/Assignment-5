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
 * @author shitong zhao <alpseinstein@gmail.com>
 */
public class FastenalCompany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderManager om = new OrderManager();
        om.orderArrives();
        om.connect();
    }

}

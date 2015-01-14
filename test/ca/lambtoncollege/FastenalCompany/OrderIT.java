/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.FastenalCompany;

import ca.lambtoncollege.fastenalcompany.Customer;
import ca.lambtoncollege.fastenalcompany.Order;
import ca.lambtoncollege.fastenalcompany.Purchase;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shitong zhao <alpseinstein@gmail.com>
 */
public class OrderIT {
    
    public OrderIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    

    /**
     * Test of toString method, of class Order.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Order instance = new Order();
        String expResult = "Order{customer=null, timeRecevied=, timeProcessed=, timeFulfilled=, purchase=null, note=}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.FastenalCompany;

import ca.lambtoncollege.fastenalcompany.Purchase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JIAJUN XUE <nicoxue0324@gmail.com>
 */
public class PurchaseTest {
    
    public PurchaseTest() {
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
     * Test of getProductID method, of class Purchase.
     */
    @Test
    public void testGetProductID() {
        System.out.println("getProductID");
        Purchase instance = new Purchase();
        int expResult = 0;
        int result = instance.getProductID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Purchase.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Purchase instance = new Purchase();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductID method, of class Purchase.
     */
    @Test
    public void testSetProductID() {
        System.out.println("setProductID");
        int ProductID = 0;
        Purchase instance = new Purchase();
        instance.setProductID(ProductID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Purchase.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int Quantity = 0;
        Purchase instance = new Purchase();
        instance.setQuantity(Quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Purchase.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Purchase instance = new Purchase();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

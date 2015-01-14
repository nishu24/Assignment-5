/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.FastenalCompany;

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

    @Test
    public void testBlankTimeReceviedShouldReturnErrorMessage() {
        Order instance = new Order();
        String expResult = "ERROR:No TimeRecevied";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}

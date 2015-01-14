/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.lambtoncollege.fastenalcompany;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

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
        Queue<Order> orders = new ArrayDeque<Order>();
        orderArrives(orders);
    }
    
    public static void orderArrives(Queue<Order> orders){
        Order order = new Order();
        Customer customer = new Customer(1,"jim");
        order.setCustomer(customer);
        List<Purchase>  purchases= new ArrayList<Purchase>();
        purchases.add(new Purchase(1,1));
        order.setPurchase(purchases);
        orders.add(order);
    }

}

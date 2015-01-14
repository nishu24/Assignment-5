/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.fastenalcompany;

/**
 *
 * @author shitong zhao <alpseinstein@gmail.com>
 */
public class Order {
    private Customer customer;
    private String timeRecevied;
    private String timeProcessed;
    private String timeFulfilled;
    private Purchase purchase;
    private String note;

    public Order() {
    }

    public Order(Customer customer, String timeRecevied, String timeProcessed, String timeFulfilled, Purchase purchase, String note) {
        this.customer = customer;
        this.timeRecevied = timeRecevied;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.purchase = purchase;
        this.note = note;
    }
    
    
    
}

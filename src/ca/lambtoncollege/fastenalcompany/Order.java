/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.lambtoncollege.fastenalcompany;

import java.util.List;

/**
 *
 * @author shitong zhao <alpseinstein@gmail.com>
 */
public class Order {
    private Customer customer;
    private String timeRecevied;
    private String timeProcessed;
    private String timeFulfilled;
    private List<Purchase> purchase;
    private String note;

    public Order() {
    }

    public Order(Customer customer, String timeRecevied, String timeProcessed, String timeFulfilled, List<Purchase> purchase, String note) {
        this.customer = customer;
        this.timeRecevied = timeRecevied;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.purchase = purchase;
        this.note = note;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getTimeRecevied() {
        return timeRecevied;
    }

    public void setTimeRecevied(String timeRecevied) {
        this.timeRecevied = timeRecevied;
    }

    public String getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(String timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public String getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(String timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public List<Purchase> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<Purchase> purchase) {
        this.purchase = purchase;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        if(timeRecevied.isEmpty())
            return "";
        else
            return "Order{" + "customer=" + customer + ", timeRecevied=" + timeRecevied + ", timeProcessed=" + timeProcessed + ", timeFulfilled=" + timeFulfilled + ", purchase=" + purchase + ", note=" + note + '}';
    }
 
}

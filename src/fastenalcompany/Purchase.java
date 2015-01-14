/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fastenalcompany;

/**
 *
 * @author c0640916
 */
public class Purchase {
    private int ProductID,Quantity;
    
    public Purchase(){
    }
    
    public Purchase(int ProductID, int Quantity) {
        this.ProductID = ProductID;
        this.Quantity = Quantity;
    }

    public int getProductID() {
        return ProductID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    public String toString(){
        String s;
        s = "productID :"+ProductID +", quantity :"+Quantity;
        return s;
    }
}

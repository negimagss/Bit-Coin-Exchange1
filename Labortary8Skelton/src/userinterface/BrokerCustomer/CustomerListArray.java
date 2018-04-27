/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BrokerCustomer;

import static Business.Organization.Organization.Type.Customer;
import java.util.ArrayList;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class CustomerListArray {

    public CustomerListArray() {
    // will reiterate the existing customers
    this.custarr = new ArrayList<Customers>();
    // adding customers already 
        Customers cust = new Customers();
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("200");
        cust.setCustomername("Vikas");
         cust.setBalanceAfterDeduct(0);

        this.custarr.add(cust);
        cust= new Customers();;
        
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("300");
        cust.setCustomername("Kailash");
                cust.setBalanceAfterDeduct(0);

        this.custarr.add(cust);
        
        cust= new Customers();;
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("100");
        cust.setCustomername("Karan");
        cust.setBalanceAfterDeduct(0);
        this.custarr.add(cust);
        
        cust= new Customers();;
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("10");
        cust.setCustomername("Kevin");
                cust.setBalanceAfterDeduct(0);

        this.custarr.add(cust);
        
        cust= new Customers();;
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("400");
        cust.setCustomername("Peter");
                cust.setBalanceAfterDeduct(0);

        this.custarr.add(cust);
        
        cust= new Customers();;
        cust.setCryptoType("BitCoin");
        cust.setCrytoValue("200");
        cust.setCustomername("George");
                cust.setBalanceAfterDeduct(0);

        this.custarr.add(cust);
    
    }

// to add customer details who int
  public void addCustomer(Customers cust){
      this.custarr.add(cust);
  }  
    
  
  public void removeCustomer(String sName){
      
      // Code to remove customer 
  }

private ArrayList<Customers> custarr;

    public ArrayList<Customers> getCustarr() {
        return custarr;
    }

    public void setCustarr(ArrayList<Customers> custarr) {
        this.custarr = custarr;
    }



   

    
}

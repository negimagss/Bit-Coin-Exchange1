/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.roundRobin;

import java.util.ArrayList;
import userinterface.BrokerCustomer.CustomerListArray;
import userinterface.BrokerCustomer.Customers;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class AlgorithmImplement extends CustomerListArray {
   // CustomerListArray<> custarr;
    public AlgorithmImplement() {
        super();
        
        //CustomerListArray custarr = new CustomerListArray();
        
        
       // this.custarr = custarr; 
   }
    
    
    
    
    
    
    
    
    /** 
     * will take the weighted average from all the customer stocks and redistribute to 
     * variable set after deduct
     * @param amount 
     */
   public void getWeightage(int amount){
       
     ArrayList<StockValueDetails> servers = new ArrayList<StockValueDetails>();
//     {{
//    add(new StockValueDetails(10, "a"));
//    add(new StockValueDetails(40, "b"));
//    add(new StockValueDetails(20, "c"));
//    add(new StockValueDetails(30, "d"));//9 34 20 37  8 33 13 14
//}}; 
     
     for(Customers cust : getCustarr()){
       String name=  cust.getCustomername();
        int bal= Integer.parseInt(cust.getCrytoValue());
         
         servers.add(new StockValueDetails(bal, name));
        
     }
     
     
     
//int counta=0, countb=0 , countc=0, countd=0;
StockPools serverPool = new StockPools();
//  will take the weight of all the customers 
ArrayList<String> arr = new ArrayList<String>();
serverPool.init(servers);
for (int i = 0; i < 100; i++){
    System.out.println(serverPool.getNext().getAddress());
    arr.add(serverPool.getNext().getAddress());
}
   
    //System.out.println(counta +" "+ countb+" "+ countc +" "+ countd);
    
 
      // System.out.println(counta +" "+ countb+" "+ countc +" "+ countd);
 // now calculate the weight given 
    int count =0;
    for(Customers cust :getCustarr() ){
        
        for(String s : arr){
          
            if(s.equals(cust.getCustomername())){
                count++;// will add the customer with the name and give % out of 100 
            }        
            
            
        }
        System.out.print(cust.getCustomername() +" "+ count);
            
        double bal= Double.parseDouble(cust.getCrytoValue());
        
        double deduct =bal*count/100;
        bal=bal-(bal*count)/100;
        cust.setBalanceAfterDeduct((int)bal);
        count=0;
        System.out.println(cust.getCustomername() +" "+ cust.getBalanceAfterDeduct());
    
    }   
       
       
       
       
       
    
   } 
   
   
   
   public static void main(String[] args){
       new AlgorithmImplement().getWeightage(200);
   }
    
    
    
    
    
    
    
    
}

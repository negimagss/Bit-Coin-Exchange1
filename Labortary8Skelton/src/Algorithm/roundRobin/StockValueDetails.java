/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm.roundRobin;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class StockValueDetails {
    int weight;
    String address;
    public StockValueDetails(int weight, String address) { 
        this.weight = weight;
        this.address = address;
    }
    public int getWeight(){return this.weight;}
    public String getAddress(){return this.address;}
}
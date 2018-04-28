/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc.BlockChain;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class CustomerRequest {
 
    
    private String sName;//custname
    private int sValue;// total amount
    private String sType;//type of coin required
    private String sApproval;

    public String getsApproval() {
        return sApproval;
    }

    public void setsApproval(String sApproval) {
        this.sApproval = sApproval;
    }
    
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsValue() {
        return sValue;
    }

    public String getsType() {
        return sType;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    public void setsValue(int sValue) {
        this.sValue = sValue;
    }
   
    
   
     public String toString(){
        return this.getsName();
    }
    
}

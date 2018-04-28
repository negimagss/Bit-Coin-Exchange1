/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BrokerCustomer;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class Customers extends CryptoRepository {
    
    
    
    
    
    private String customername;
    private String customerBalance;
    private String currencyType;
    private int balanceAfterDeduct;
    private String requestStatus;

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public int getBalanceAfterDeduct() {
        return balanceAfterDeduct;
    }

    public void setBalanceAfterDeduct(int balanceAfterDeduct) {
        this.balanceAfterDeduct = balanceAfterDeduct;
    }
    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(String customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
    
    public String toString(){
        return this.getCustomername();
    }

    public void setCustomerBalance(double bal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

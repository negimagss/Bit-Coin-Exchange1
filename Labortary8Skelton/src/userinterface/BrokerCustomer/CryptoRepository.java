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
public class CryptoRepository {
    
    
    
    //  this will be owned by the broker
    private String crytoValue;
    private String cryptoType;  

    public String getCrytoValue() {
        return crytoValue;
    }

    public void setCrytoValue(String crytoValue) {
        this.crytoValue = crytoValue;
    }

    public String getCryptoType() {
        return cryptoType;
    }

    public void setCryptoType(String cryptoType) {
        this.cryptoType = cryptoType;
    }
    
    
    public String toString(){
        return this.getCryptoType();
    }
}

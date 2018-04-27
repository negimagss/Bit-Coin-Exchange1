/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BrokerCustomer;

import java.util.ArrayList;

/**
 *
 * @author @Shardul_Negi(negi_mags)
 */
public class CryptoArralist {

    public ArrayList<CryptoRepository> getCryptorepo() {
        return cryptorepo;
    }

    public void setCryptorepo(ArrayList<CryptoRepository> cryptorepo) {
        this.cryptorepo = cryptorepo;
    }
    
   
      
    
    private ArrayList<CryptoRepository> cryptorepo;

    public CryptoArralist() {
        // tpes of crypto available 
        cryptorepo = new ArrayList<CryptoRepository>();
        CryptoRepository cr = new CryptoRepository();
        cr.setCryptoType("Bit-Coin");
        cr.setCrytoValue("4000");
       this.cryptorepo.add(cr);
       
       
        cr = new CryptoRepository();
        cr.setCryptoType("Lite-Coin");
        cr.setCrytoValue("4000");
       this.cryptorepo.add(cr);
       
       cr = new CryptoRepository();
        cr.setCryptoType("Etherum");
        cr.setCrytoValue("2000");
       this.cryptorepo.add(cr);
       
       
       cr = new CryptoRepository();
        cr.setCryptoType("Ripple");
        cr.setCrytoValue("2");
       this.cryptorepo.add(cr);
       
       
       cr = new CryptoRepository();
        cr.setCryptoType("Steller");
        cr.setCrytoValue("1.2");
       this.cryptorepo.add(cr);
    }
    
   
    
    
    
    public void addCrptoNew(CryptoRepository cr){
        
        
        this.cryptorepo.add(cr);
    }
    
    
}

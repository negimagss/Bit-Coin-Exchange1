/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Algorithm.roundRobin.AlgorithmImplement;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Misc.BlockChain.BlockChain_Create;
import Misc.BlockChain.CustomerRequest;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    
    public ArrayList<CustomerRequest> custreq;

    public BlockChain_Create getCreateblockchain() {
        return createblockchain;
    }

    public void setCreateblockchain(BlockChain_Create createblockchain) {
        this.createblockchain = createblockchain;
    }

    
   public  int brokersReturn;

    public int getBrokersReturn() {
        return brokersReturn;
    }

    public void setBrokersReturn(int brokersReturn) {
        this.brokersReturn = brokersReturn;
    }
    
    public void addBrokersMoney(int amount){
        this.brokersReturn+=amount;
    }
    
    
    
    
    
    
    
    

    
    
    
    
    
    public BlockChain_Create createblockchain;
    
    public static  int count=0;
    public EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        
        
         this.custreq = new ArrayList<CustomerRequest>();
         this.alg= new AlgorithmImplement();
         this.transactionValue = new ArrayList<String>();
         
         this.createblockchain= new BlockChain_Create();
    }

    
    
    
    public ArrayList<CustomerRequest> getCustreq() {
        return custreq;
    }

    public void setCustreq(ArrayList<CustomerRequest> custreq) {
        this.custreq = custreq;
        
    }

    public ArrayList<String> getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(ArrayList<String> transactionValue) {
        this.transactionValue = transactionValue;
    }

    
    ArrayList<String> transactionValue;
    
   
    /**
     * will save the customer Request for a new coin
     * @param cus 
     */
      public void addCustRequestforCoin(CustomerRequest cus){ 
        this.custreq.add(cus);
    } 
    
    AlgorithmImplement alg;

      
         public AlgorithmImplement getAlg() {
        alg= new AlgorithmImplement();
             return alg;
    }

    public void setAlg(AlgorithmImplement alg) {
        this.alg = alg;
    }
      
      
      
      
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;// this will retuen the values from the same place
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Algorithm.roundRobin.AlgorithmImplement;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Misc.BlockChain.CustRequestArray;
import Misc.BlockChain.CustomerRequest;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import userinterface.BrokerCustomer.CryptoArralist;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    
    
    
    

    //Organization name that will reflect in Admin Work area    
    public enum Type{
        Admin("Admin Organization"), Exchange("Exchange Organization"), Lab("Lab Organization") , Customer("Customer");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
AlgorithmImplement alg;
    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
        
        this.custreq = new ArrayList<CustomerRequest>();
         alg= new AlgorithmImplement();
        // instantiate other objects 
        
    }

      public ArrayList<CustomerRequest> custreq;

  


     
    
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    
    
   public String sCustomerApproval; 

    public String getsCustomerApproval() {
        return sCustomerApproval;
    }

    public void setsCustomerApproval(String sCustomerApproval) {
        this.sCustomerApproval = sCustomerApproval;
    }
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}

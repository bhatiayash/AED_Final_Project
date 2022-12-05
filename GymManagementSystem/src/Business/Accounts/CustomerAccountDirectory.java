/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accounts;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import java.util.ArrayList;

/**
 *
 * @author yashbhatia
 */
public class CustomerAccountDirectory extends UserAccountDirectory{
    private ArrayList<Customer> cusList;
    
    public CustomerAccountDirectory(){
        this.cusList = new ArrayList();
    }

    
}

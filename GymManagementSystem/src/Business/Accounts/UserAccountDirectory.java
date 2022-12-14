/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Accounts;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Person.Person;
import Business.Role.AnalystRole;
import Business.Role.CustomerRole;
import Business.Role.TrainerRole;
import Business.Role.ClerkRole;
/**
 *
 * @author yashbhatia
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if(ua.getUsername()==null)continue;
            if(ua==null)System.out.println("ua is null");
            if(ua.getUsername()==null)System.out.println("name is nul;l");
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }

    public UserAccount createUserAccount(String username, String password, Customer customer, CustomerRole customerRole) {
         UserAccount ac = new UserAccount();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(customerRole);
         userAccountList.add(ac);
         return ac;
    }
       public UserAccount createAnalysisAcount(String username, String password, AnalystRole analysisRole) {
         UserAccount ac = new UserAccount();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(analysisRole);
         userAccountList.add(ac);
         return ac;
    }
       
       public UserAccount createTrainerAcount(String username, String password, TrainerRole analysisRole) {
         UserAccount ac = new UserAccount();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(analysisRole);
         userAccountList.add(ac);
         return ac;
       }
         
       public UserAccount createClerkAccount(String username, String password, ClerkRole clerkRole) {
         UserAccount ac = new UserAccount();
         ac.setUsername(username);
         ac.setPassword(password);
         ac.setRole(clerkRole);
         userAccountList.add(ac);
         return ac;
    }
}

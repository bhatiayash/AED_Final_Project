/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Accounts.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import Business.Accounts.UserAccountDirectory;
import Business.Person.Person;

/**
 *
 * @author keshni
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private int organizationID;
    private OrganizationDirectory organizationDirectory;
    private static int cntr = 0;
    
    public enum Type{
        Admin("Admin Organization"), 
        Trainer("Trainer Organization"), 
        Customer("Customer Organization"), 
        Sales ("Sales Organization"),
        GymManager ("Gym Manager Organization"),
        Analysis("Analysis Organization"),
        Clerk ("Clerk Organization"),
        NewHire ("NewHire Organization");


        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationDirectory = new OrganizationDirectory();
        organizationID = cntr;
        ++ cntr;
    }

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

    
    @Override
    public String toString() {
        return name;
    }
    
    public UserAccountDirectory getUserAccountList() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    
    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public static int getCounter() {
        return cntr;
    }

    
    public static void setCounter(int cntr) {
        Organization.cntr = cntr;
    }       
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


/**
 *
 * @author yashbhatia
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Trainer("Trainer"),
        Customer("Customer"),
        OnlineSales("OnlineSales"),
        ClubMembershipManager("ClubMembershipManager"),
        Analysis("Analysis"),
        FitnessClubManager("FitnessClubManager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Accounts.UserAccount;
import UI.Admin.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author yashbhatia
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}

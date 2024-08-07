/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.Enterprise.FitnessTrainerRole.FitnessTrainerWorkAreaJPanel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author palsa
 */
public class FitnessTrainerRole extends Role {

    public FitnessTrainerRole(){
        this.type = RoleType.FitnessTrainer;
    }

    @Override
    public JPanel createWorkArea(JSplitPane splitPane, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new FitnessTrainerWorkAreaJPanel(splitPane,account, organization,enterprise,system);
    }
    
}

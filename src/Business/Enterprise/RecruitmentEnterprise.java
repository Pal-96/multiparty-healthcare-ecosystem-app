/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Network.EnterpriseNetwork;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class RecruitmentEnterprise extends Enterprise {
  
    public RecruitmentEnterprise(String name, EnterpriseNetwork network){
        super(name,Enterprise.EnterpriseType.RecruitmentEnterprise, network);
    }
    //hash map to for Fire Man role addition

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

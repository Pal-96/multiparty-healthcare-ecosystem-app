/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Roles.CustomerRole;
import Business.Roles.RehabMgrRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class RehabilitationOrganization extends Organization{
    
    public RehabilitationOrganization() {
        super(Type.Rehabilitation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RehabMgrRole());
        return roles;
    }
    
}

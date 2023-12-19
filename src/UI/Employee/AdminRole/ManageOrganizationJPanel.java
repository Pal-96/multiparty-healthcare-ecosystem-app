/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Employee.AdminRole;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anupb
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    
    JSplitPane splitPanel;
    EcoSystem business;
    Enterprise enterprise;
    UserAccount account;
    private OrganizationDirectory directory;
    
    
    public ManageOrganizationJPanel(JSplitPane splitPanel, EcoSystem business, Enterprise enterprise,UserAccount account, OrganizationDirectory directory) {
        initComponents();
        
        this.splitPanel = splitPanel;
        this.business = business;
        this.enterprise = enterprise;
        this.account = account;
        this.directory = directory;
        
        populateTable();
        populateCombo();
    }

    
        private void populateCombo(){
        cmbOrg.removeAllItems();
        
        String enterpriseType = enterprise.getClass().toString();
        
        for (Type type : Type.values()){
           if(enterpriseType.equals("class Business.Enterprise.FitnessGoodsEnterprise")){
                if(type.equals(Type.SportBrandSupplier)){
                   cmbOrg.addItem(type);
                }
                
              }
            else if(enterpriseType.equals("class Business.Enterprise.HealthTrainingEnterprise")){
                if(type.equals(Type.FitnessTrainer)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Rehabilitation)){
                   cmbOrg.addItem(type);
                }
                 if(type.equals(Type.Therapist)){
                   cmbOrg.addItem(type);
                }
            } else if(enterpriseType.equals("class Business.Enterprise.NutritionEnterprise")){
                if(type.equals(Type.NutritionSupplier)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Nutritionist)){
                   cmbOrg.addItem(type);
                }
            } else if(enterpriseType.equals("class Business.Enterprise.PharmaceuticalEnterprise")){
                if(type.equals(Type.PharmaSupplier)){
                   cmbOrg.addItem(type);
                }

            } else if(enterpriseType.equals("class Business.Enterprise.RecruitmentEnterprise")){
                if(type.equals(Type.Recruitment)){
                   cmbOrg.addItem(type);
                }
            }
        }
    }

        
     private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[3];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            row[2] = organization.getOrgName();
            
            model.addRow(row);
        }
    }
        
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbOrg = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        btnAddition = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblOrgName = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        cmbOrg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });

        tblOrg.setForeground(new java.awt.Color(36, 47, 65));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Org Type", "Org Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrg);

        btnAddition.setBackground(new java.awt.Color(102, 153, 255));
        btnAddition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddition.setForeground(new java.awt.Color(255, 255, 255));
        btnAddition.setText("Add Organization");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrganization.setText("Organization Type:");

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 51, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Organization");

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrgName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOrgName.setText("Organization Name:");

        txtOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(lblOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblOrgName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddition)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrganization)
                    .addComponent(cmbOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgName)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddition, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrgActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        Type type = (Type) cmbOrg.getSelectedItem();

        directory.createOrganization(type, txtOrgName.getText());

        populateTable();

        //dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminWorkAreaJPanel awjpl = new AdminWorkAreaJPanel(splitPanel,business,enterprise,account);
        splitPanel.setRightComponent(awjpl);
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgName;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtOrgName;
    // End of variables declaration//GEN-END:variables
}

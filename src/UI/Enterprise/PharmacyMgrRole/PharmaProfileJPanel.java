/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Enterprise.PharmacyMgrRole;

import Business.Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmaSupplierOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author tanvi
 */
public class PharmaProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaProfileJPanel
     */
    JSplitPane splitPane;
    EcoSystem system;
    Employee employee;
    PharmaSupplierOrganization supplier;
    Enterprise enterprise;
    UserAccount account;

    public PharmaProfileJPanel(PharmaSupplierOrganization supplier, JSplitPane splitPane, UserAccount account, Enterprise enterprise, EcoSystem system, Employee employee) {
        initComponents();
        this.splitPane = splitPane;
        this.system = system;
        this.employee = employee;
        this.enterprise = enterprise;
        this.account = account;
        this.supplier = supplier;

        txtID.setText(String.valueOf(employee.getId()));
        txtName.setText(employee.getName());
        textAreaDesc.setText(employee.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtTitleMyProfile = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        lblD = new javax.swing.JLabel();
        lblProfileName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblDesc = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDesc = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtName.setEditable(false);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtTitleMyProfile.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTitleMyProfile.setForeground(new java.awt.Color(51, 51, 255));
        txtTitleMyProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitleMyProfile.setText("My Profile");

        btnUpdate1.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Update");
        btnUpdate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate1.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUpdate1.setMinimumSize(new java.awt.Dimension(20, 20));
        btnUpdate1.setPreferredSize(new java.awt.Dimension(240, 25));
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        lblD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblD.setText(" ID:");

        lblProfileName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProfileName.setText("Name:");

        btnSave.setBackground(new java.awt.Color(102, 153, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setEnabled(false);
        btnSave.setMaximumSize(new java.awt.Dimension(200, 40));
        btnSave.setMinimumSize(new java.awt.Dimension(20, 20));
        btnSave.setPreferredSize(new java.awt.Dimension(240, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDesc.setText("Description:");

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(20, 20));
        btnBack.setPreferredSize(new java.awt.Dimension(240, 25));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        textAreaDesc.setEditable(false);
        textAreaDesc.setColumns(20);
        textAreaDesc.setRows(5);
        jScrollPane1.setViewportView(textAreaDesc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitleMyProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProfileName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDesc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTitleMyProfile)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblD)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfileName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(291, 291, 291))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtID, txtName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
//        txtID.setEditable(true);
        textAreaDesc.setEditable(true);

        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        employee.setName(txtName.getText());
        employee.setDescription(textAreaDesc.getText());

        String name = txtName.getText();
        String desc = textAreaDesc.getText();

        if (name.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all values.");
            return;
        }

        JOptionPane.showMessageDialog(this, "Data saved successfully!");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        PharmaSupplierWorkAreaJPanel pharmaSupplierWorkAreaJPanel = new PharmaSupplierWorkAreaJPanel(splitPane, account, (Organization) supplier, enterprise, system);
        splitPane.setRightComponent(pharmaSupplierWorkAreaJPanel);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblProfileName;
    private javax.swing.JTextArea textAreaDesc;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel txtTitleMyProfile;
    // End of variables declaration//GEN-END:variables
}

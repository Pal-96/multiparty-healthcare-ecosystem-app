/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SuperAdminRole;

import Business.Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.EnterpriseNetwork;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anupb
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    
    JSplitPane splitPanel;
    EcoSystem business;
    
    public ManageEnterpriseJPanel(JSplitPane splitPanel, EcoSystem business) {
        initComponents();
        
        this.splitPanel = splitPanel;
        this.business = business;
        
        populateComboBox();
        populateTable();
    }

    
    
        private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) vtable.getModel();

        model.setRowCount(0);
        for (EnterpriseNetwork network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise.getName();
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
System.out.println(enterprise.getEnterpriseType().getValue());
                model.addRow(row);
            }
        }
    }
    
    
      
    
       public void populateComboBox(){
        cmbNetwork.removeAllItems();
        cmbEntType.removeAllItems();
        
        for (EnterpriseNetwork en : business.getNetworkList()){
            cmbNetwork.addItem(en.getName());
                  
        }
        
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cmbEntType.addItem(type.getValue());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        vtable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        lblEntType = new javax.swing.JLabel();
        lblEntName = new javax.swing.JLabel();
        cmbNetwork = new javax.swing.JComboBox<>();
        cmbEntType = new javax.swing.JComboBox<>();
        txtEntName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        vtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Enterprise Type"
            }
        ));
        jScrollPane1.setViewportView(vtable);

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Enterprise");

        lblNetwork.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNetwork.setText("Network");

        lblEntType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntType.setText("Enterprise Type");

        lblEntName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEntName.setText("Enterprise Name");

        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });

        cmbEntType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEntType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEntTypeActionPerformed(evt);
            }
        });

        txtEntName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntNameActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 153, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPdf.setBackground(new java.awt.Color(102, 153, 255));
        btnPdf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPdf.setForeground(new java.awt.Color(255, 255, 255));
        btnPdf.setText("PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNetwork)
                    .addComponent(lblEntType)
                    .addComponent(lblEntName))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbEntType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEntName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork)
                    .addComponent(cmbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntType)
                    .addComponent(cmbEntType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEntName)
                    .addComponent(txtEntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbEntType, cmbNetwork, txtEntName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        SuperAdminWorkAreaJPanel sajpl = new SuperAdminWorkAreaJPanel(splitPanel,business);
        splitPanel.setRightComponent(sajpl);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEntNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntNameActionPerformed

    private void cmbEntTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEntTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEntTypeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        
        EnterpriseNetwork network = business.findNetwork(String.valueOf(cmbNetwork.getSelectedItem()));
        String selectedTypeString = (String) cmbEntType.getSelectedItem();
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.valueOf(selectedTypeString);
        //Enterprise.EnterpriseType.En;
        System.out.println(type);


//Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cmbEntType.getSelectedItem();
        
        

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }
        

        String name = txtEntName.getText();
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Enterprise Name", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type, network);
        enterprise.setEnterpriseType(type);
        System.out.println(network.getName());

        populateTable();
        //stores in the database
        //dB4OUtil.storeSystem(system);
        txtEntName.setText("");
        
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){

            path=j.getSelectedFile().getPath();

        }
        Document doc = new Document();

        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"/reporttable.pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(3);
            tbl.addCell("Enterprise Name");
            tbl.addCell("Network");
            tbl.addCell("Enterprise Type");

            for(int i=0; i< vtable.getRowCount(); i++){

                String entname = vtable.getValueAt(i, 0).toString();
                String network = vtable.getValueAt(i, 1).toString();
                String enttype = vtable.getValueAt(i, 2).toString();

                tbl.addCell(entname);
                tbl.addCell(network);
                tbl.addCell(enttype);

            }

            doc.add(tbl);

            JOptionPane.showMessageDialog(null, "PDF generated");

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, "something wrong");
        }

        doc.close();

    }//GEN-LAST:event_btnPdfActionPerformed

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPdf;
    private javax.swing.JComboBox<String> cmbEntType;
    private javax.swing.JComboBox<String> cmbNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEntName;
    private javax.swing.JLabel lblEntType;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JTextField txtEntName;
    private javax.swing.JTable vtable;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.PasienController;
import javax.swing.table.DefaultTableModel;
import model.Pasien;
/**
 *
 * @author LENOVO
 */
public class PasienForm extends javax.swing.JFrame {
    
    PasienController controller = new PasienController();
    int index;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PasienForm.class.getName());

    /**
     * Creates new form PasienForm
     */
    public PasienForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    
private void tampilData() {

    DefaultTableModel model = new DefaultTableModel();

    model.addColumn("NO RM");
    model.addColumn("NAMA");
    model.addColumn("KELAMIN");
    model.addColumn("TELEPON");

    for (Pasien p : controller.getListPasien()) {

        model.addRow(new Object[] {

            p.getNoRM(),
            p.getNama(),
            p.getKelamin(),
            p.getTelepon()

        });

    }

    tablePasien.setModel(model);

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNoRM = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbKelamin = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        txtTelepon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePasien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNama.addActionListener(this::txtNamaActionPerformed);

        cbKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        tablePasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO", "NAMA", "KELAMIN", "NO.HP"
            }
        ));
        tablePasien.setSurrendersFocusOnKeystroke(true);
        tablePasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePasien);

        jLabel1.setText("NO");

        jLabel2.setText("NAMA");

        jLabel3.setText("No.HP");

        jLabel4.setText("KELAMIN");

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(this::btnEditActionPerformed);

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoRM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
     Pasien pasien = new Pasien(

    txtNoRM.getText(),
    txtNama.getText(),
    cbKelamin.getSelectedItem().toString(),
    txtTelepon.getText()
     );


    controller.simpan(pasien);

tampilData();

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void tablePasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePasienMouseClicked
         index = tablePasien.getSelectedRow();

    txtNoRM.setText(
            tablePasien.getValueAt(index, 0).toString()
    );

    txtNama.setText(
            tablePasien.getValueAt(index, 1).toString()
    );

    cbKelamin.setSelectedItem(
            tablePasien.getValueAt(index, 2).toString()
    );

    txtTelepon.setText(
            tablePasien.getValueAt(index, 3).toString()
    );

    }//GEN-LAST:event_tablePasienMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       Pasien pasien = new Pasien();

            pasien.setNoRM(txtNoRM.getText());
            pasien.setNama(txtNama.getText());
            pasien.setKelamin(cbKelamin.getSelectedItem().toString());
            pasien.setTelepon(txtTelepon.getText());

            controller.edit(index, pasien);

            tampilData();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        controller.hapus(index);

tampilData();
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           java.awt.EventQueue.invokeLater(() -> {

        

    });
        java.awt.EventQueue.invokeLater(() -> new PasienForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePasien;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoRM;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables
}

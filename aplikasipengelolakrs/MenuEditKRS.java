/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipengelolakrs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MenuEditKRS extends javax.swing.JFrame {

    /**
     * Creates new form MenuEditKRS
     */
    public MenuEditKRS() {
        initComponents();
    }
    
    String id;
    Connection con = koneksiSql.getKoneksi();
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pilihSemester = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pilihKelas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        matkul01 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        matkul02 = new javax.swing.JComboBox<>();
        matkul03 = new javax.swing.JComboBox<>();
        matkul04 = new javax.swing.JComboBox<>();
        matkul05 = new javax.swing.JComboBox<>();
        matkul06 = new javax.swing.JComboBox<>();
        btnEditKRS = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNPM = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Data KRS Di Sini"));

        jLabel2.setText("Pilih Semester");

        pilihSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Semester -", "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));

        jLabel3.setText("Pilih Kelas");

        pilihKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Kelas -", "A Banjarbaru", "B Banjarbaru", "C Banjarbaru", "A Banjarmasin", "B Banjarmasin", "C Banjarmasin" }));

        jLabel4.setText("Mata Kuliah 1");

        matkul01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        jLabel5.setText("Mata Kuliah 2");

        jLabel6.setText("Mata Kuliah 3");

        jLabel7.setText("Mata Kuliah 4");

        jLabel8.setText("Mata Kuliah 5");

        jLabel9.setText("Mata Kuliah 6");

        matkul02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        matkul03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        matkul04.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        matkul05.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        matkul06.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Mata Kuliah Yang Ingin Diambil -", "Pemprograman Visual 1", "Pemprograman Visual 2", "RPL", "PBO 1", "PBO 2", "PBO 3", "Multimedia", "Web 1", "Web 2", "Android 1", "Android 2", "Rangkaian Digital", "Statistik", "Analisis Sistem" }));

        btnEditKRS.setText("Edit KRS");
        btnEditKRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditKRSActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel10.setText("Masukkan NPM");

        jLabel11.setText("Masukkan Nama");

        txtNPM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNPMKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(matkul05, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(matkul04, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(matkul03, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(matkul02, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEditKRS)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(matkul06, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNPM))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(matkul01, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pilihSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNama)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pilihSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pilihKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(matkul01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(matkul02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(matkul03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(matkul04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(matkul05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(matkul06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditKRS)
                    .addComponent(btnBatal))
                .addGap(15, 15, 15))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU EDIT KRS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditKRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditKRSActionPerformed
        if (txtNama.getText().isEmpty() || txtNPM.getText().isEmpty() || pilihSemester.getSelectedIndex() == 0 || pilihKelas.getSelectedIndex() == 0 || matkul01.getSelectedIndex() == 0 || matkul02.getSelectedIndex() == 0 || matkul03.getSelectedIndex() == 0 || matkul04.getSelectedIndex() == 0 || matkul05.getSelectedIndex() == 0 || matkul06.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Ada Data Yang Belum Diisi!!", "Gagal Mengubah Data", 2); // untuk menampilkan pesan peringatan
        } else {
            try {
                int row = MenuCekKRS.tableKRS.getSelectedRow();
                id = MenuCekKRS.tableKRS.getValueAt(row, 0).toString();
                
                String dbUbah = "UPDATE krs SET nama = ?, npm = ?, semester = ?, kelas = ?, matkul_1 = ?, matkul_2 = ?, matkul_3 = ?, matkul_4 = ?, matkul_5 = ?, matkul_6 = ? WHERE id = ?;";
                pst = con.prepareStatement(dbUbah);
                pst.setString(1, txtNama.getText());
                pst.setString(2, txtNPM.getText());
                pst.setString(3, pilihSemester.getSelectedItem().toString());
                pst.setString(4, pilihKelas.getSelectedItem().toString());
                pst.setString(5, matkul01.getSelectedItem().toString());
                pst.setString(6, matkul02.getSelectedItem().toString());
                pst.setString(7, matkul03.getSelectedItem().toString());
                pst.setString(8, matkul04.getSelectedItem().toString());
                pst.setString(9, matkul05.getSelectedItem().toString());
                pst.setString(10, matkul06.getSelectedItem().toString());
                pst.setString(11, id);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!!", "Sukses Mengubah Data", 1); // untuk menampilkan pesan informasi
                
                MenuCekKRS cek = new MenuCekKRS();
                cek.setVisible(true);
                dispose();
            } catch (SQLException ex) {
                Logger.getLogger(MenuEditKRS.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnEditKRSActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        MenuCekKRS cek = new MenuCekKRS();
        cek.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtNPMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPMKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txtNPM.getText().length() >= 12) {
            JOptionPane.showMessageDialog(null, "Angka Yang Dimasukkan Harus tidak lebih dari 12!!", "Peringatan", 2);
            evt.consume();
        }
    }//GEN-LAST:event_txtNPMKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuEditKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuEditKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuEditKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuEditKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuEditKRS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEditKRS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JComboBox<String> matkul01;
    public static javax.swing.JComboBox<String> matkul02;
    public static javax.swing.JComboBox<String> matkul03;
    public static javax.swing.JComboBox<String> matkul04;
    public static javax.swing.JComboBox<String> matkul05;
    public static javax.swing.JComboBox<String> matkul06;
    public static javax.swing.JComboBox<String> pilihKelas;
    public static javax.swing.JComboBox<String> pilihSemester;
    public static javax.swing.JTextField txtNPM;
    public static javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void cleanField() {
        
    }
}
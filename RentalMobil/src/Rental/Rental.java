
package Rental;

import java.awt.Color;// // memanggil peket kelas fungsi proses inputan warna
import javax.swing.JOptionPane;// memanggil paket kelas mesagge dari JOptionPane

/**
 * @author Novrilya Rahmadanisya Putri
 * G1A021062
 */
public class Rental extends javax.swing.JFrame {

    public Rental() {
        initComponents();
        jPanel4.setBackground(new Color(75,75,75,75) );// mengatur warna pada panel 4
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtNoHp = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtJaminan = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        btnLanjut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("MASUKKAN DATA DIRI");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 33, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 800, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Tubes SDA\\Assets\\person-1824147_640.png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("NAMA");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("NO HP");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("ALAMAT");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("JAMINAN");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        txtNama.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtNama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel4.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 280, 30));

        txtNoHp.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtNoHp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtNoHp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 30));

        txtAlamat.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtAlamat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 280, 30));

        txtJaminan.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtJaminan.setToolTipText("");
        txtJaminan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtJaminan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 222, 280, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 460, 310));

        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        btnLanjut.setText("LANJUT");
        btnLanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanjutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Tubes SDA\\Assets\\porsche_panamera_turbo_s (1).jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnLanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanjutActionPerformed
        if( txtNama.getText().equals("") )   {
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Data Anda");
        } 
        else if (txtJaminan.getText().equals("") ){
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Data Anda");
        } 
        else if (txtAlamat.getText().equals("") ){
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Data Anda");
        }
        else if (txtNoHp.getText().equals("")){
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Data Anda");
        }
        else{
        Mobil mobil = new Mobil ();
        mobil.setVisible(true);
        dispose ();
        }
    }//GEN-LAST:event_btnLanjutActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnLanjut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtJaminan;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoHp;
    // End of variables declaration//GEN-END:variables

    private void elseif(boolean par) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

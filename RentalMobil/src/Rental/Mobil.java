
package Rental;

import java.awt.Color; // memanggil peket kelas fungsi proses inputan warna
import javax.swing.JOptionPane; // memanggil paket kelas mesagge dari JOptionPane

/**
 * @author Siti Zubaidah G1A021002
 * @author Iftitah Azzahra Lego NIngtiyas G1A021014
 */

public class Mobil extends javax.swing.JFrame {

    public Mobil() {
        initComponents();
        jPanel4.setBackground(new Color(75,75,75,75) ); // mengatur warna pada panel 4
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnRental = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMobil = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtLama = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtHari = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnOk1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setText("JENIS MOBIL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 34, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Tubes SDA\\Assets\\car-1299198_1280 (1).png")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 80, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        btnRental.setText("RENTAL");
        btnRental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRental, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("MOBIL");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 45, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel5.setText("HARGA");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("LAMA RENTAL      ANGKA");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 166, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel7.setText("TOTAL HARGA");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 227, -1, -1));

        txtMobil.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtMobil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtMobil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 280, 30));

        txtHarga.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtHarga.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 280, 30));

        txtLama.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtLama.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtLama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 140, 30));

        txtTotal.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 280, 30));

        txtHari.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtHari.setText("Hari");
        txtHari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(txtHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 60, 30));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        jPanel4.add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, 30));

        btnOk1.setText("OK");
        btnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 540, 300));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Tubes SDA\\Assets\\porsche_panamera_turbo_s (1).jpg")); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Rental rental = new Rental ();//pemanggilan fungsi prosedur
        rental.setVisible(true);// menampilkan frame rental
        dispose();//menutup frame mobil
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnRentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalActionPerformed
    if( txtMobil.getText().equals("") )   { //kondisi jika teks pada mobil kosong
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Mobil Yang Ingin Disewa");// untuk menampilkan pesan
        } 
    else if (txtLama.getText().equals("") ){//kondisi jika teks pada lama rental kosong
        JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan jumlah hari menyewa");// untuk menampilkan pesan
        } 
    else{ // kondisi jika teks terisi semua
        JOptionPane.showMessageDialog(rootPane,"Terimakasih Telah Menyewa Mobil Kami");// untuk menampilkan pesan
        Home home = new Home (); //pemanggilan fungsi proseduf
        home.setVisible(true); // menampilkan frame home
        dispose (); //menutup frame mobil
        }
    }//GEN-LAST:event_btnRentalActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
    int k = -1; //nilai k=-1 atau masih kosong
       
    //membuat array 2 dimensi sebagai tempat intuk menampung data mobil dan harga  
    String[][] mobil = {{"Avanza","100000"}, {"Brio", "50000"}, {"Xenia","120000"}, {"Ayla","75000"}, 
    {"Fortuner","250000"}, {"Pajero","740000"}, {"Ertiga","900000"}, {"Chevrolet","125000"}, {"Cizeta","800000"}, 
    {"Jeep","600000"}, {"Lamborghini","980000"}, {"Hummer","780000"}, {"Geely","450000"}, {"Kawasaki","696900"}, 
    {"Mitsubishi","720000"},{ "Mercedes","930000"}, {"Maybach","790000"}, {"Lesus","690000"}, {"Pagani","123000"},
    {"Nissan","650000"}, {"Suzuki","150000"}, {"Toyota","320000"}, {"Yamaha","500000"}, {"Kijang","550000"}, 
    {"Mazda","850000"}};
    
   //untuk user mencari jenis mobil yang akan dirental 
   String jenis = txtMobil.getText();
   for (int i = 0; i < mobil.length; i++)//perulangan untu mencari jenis mobil yang diinginkan
       if(jenis.equals(mobil[i][0])){ // kondisi bila jenis mobil ditemukan
           k=i;
       }
   if (k == -1){ // kondisi bila jenis mobil tidak ditemukan
         txtHarga.setText("Mobil Tidak Ditemukan");
         JOptionPane.showMessageDialog(rootPane,"Mohon Masukkan Jenis Mobil");// pesan yang ditampilkan jika mobil tidak ditemukan
    }
   else{ // kondisi untuk mencetak harga rental mobil
           txtHarga.setText(mobil[k][1]); 
           }
    txtHarga.setEditable(false); // agar harga tidak bisa diedit
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk1ActionPerformed
   int harga = Integer.parseInt(txtHarga.getText()); // mengkonvert harga ke dalam integer
   int hari = Integer.parseInt(txtLama.getText()); // mengkonvert hari kedalam integer
        int jumlah = harga*hari; //menghitung jumlah dengan mengkalikan harga dan hari
        String total = String.valueOf(jumlah); // mengkonvert jumlah ke string
        txtTotal.setText("Rp. "+total); //menampilkan jumlah pada GUI
        
    txtTotal.setEditable(false); //agar total tidak bisa diedit
    }//GEN-LAST:event_btnOk1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnOk1;
    private javax.swing.JButton btnRental;
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
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHari;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtMobil;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}


package Rental;
import java.awt.Color;// memanggil peket kelas fungsi proses inputan warna

/**
 * @author Redo Hariyadi G1A021034
 * @author Arya Bigtra Dhieva G1A021088
 */
public class Harga extends javax.swing.JFrame {

    public Harga() {
        initComponents();
        jPanel4.setBackground(new Color(75,75,75,75) );// mengatur warna pada panel 4
        this.view();
    }
    public void view (){
        String[] mobil = {"Avanza", "Brio", "Xenia", "Ayla", "Fortuner", "Pajero", "Ertiga", 
        "Chevrolet", "Cizeta", "Jeep", "Lamborghini", "Hummer", "Geely", "Kawasaki", "Mitsubishi", 
        "Mercedes", "Maybach", "Lesus", "Pagani", "Nissan", "Suzuki", "Toyota", "Yamaha", "Kijang", "Mazda"};
        int[] harga = {100000, 50000, 120000, 75000, 250000, 740000, 900000, 120000, 800000, 600000, 980000, 
        780000, 450000, 696900, 780000, 930000, 790000, 690000, 123000, 650000, 150000, 320000, 500000, 550000, 850000};
        for (int i = 0; i < mobil.length; i++){
            txaMobil.append((i+1)+". "+mobil[i]+"\n");
            txaHarga.append((i+1) + ". Rp" + harga[i] + "\n");
        }
        txaMobil.setEditable(false);
        txaHarga.setEditable(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMobil = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaHarga = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDesceding = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAsceding = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel2.setText("DAFTAR HARGA");

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Tubes SDA\\Assets\\list-icon-1423.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(285, 285, 285))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaMobil.setColumns(20);
        txaMobil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaMobil.setRows(5);
        jScrollPane1.setViewportView(txaMobil);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 210));

        txaHarga.setColumns(20);
        txaHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaHarga.setRows(5);
        jScrollPane2.setViewportView(txaHarga);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 250, 210));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("MOBIL");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("HARGA");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        btnDesceding.setText("DESCEDING");
        btnDesceding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescedingActionPerformed(evt);
            }
        });
        jPanel4.add(btnDesceding, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel6.setText("URUTKAN HARGA");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnAsceding.setText("ASCEDING");
        btnAsceding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscedingActionPerformed(evt);
            }
        });
        jPanel4.add(btnAsceding, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 540, 310));

        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

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
        Home home = new Home();//pemanggilan fungsi prosedur
        home.setVisible(true);//menampilkan frame home
        dispose();//menutup frame harga
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnAscedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscedingActionPerformed
    txaMobil.setText("");//agar dappat memunculkan teks
    txaHarga.setText("");
     
    //membuat array list
    String[] mobil = {"Avanza", "Brio", "Xenia", "Ayla", "Fortuner", "Pajero", "Ertiga", 
    "Chevrolet", "Cizeta", "Jeep", "Lamborghini", "Hummer", "Geely", "Kawasaki", "Mitsubishi", 
    "Mercedes", "Maybach", "Lesus", "Pagani", "Nissan", "Suzuki", "Toyota", "Yamaha", "Kijang", "Mazda"};
    
    int[] harga = {100000, 50000, 120000, 75000, 250000, 740000, 900000, 
        125000, 800000, 600000, 980000, 780000, 450000, 696900, 720000,
    930000, 790000, 690000, 123000, 650000, 150000, 320000, 500000, 550000, 850000};
    
	//algoritma insertion sort untuk mengurutkan secara asceding (kecil ke besar)
	for (int j = 0; j < harga.length; j++) {
                 for (int i = 0; i < harga.length; i = i + 1){ 
                      if (i != (harga.length - 1)) { 
                          if (harga[i] > harga[i + 1]) {
                              // swap array
                              int temp = harga[i];
                              harga[i] = harga[i + 1];
                              harga[i + 1] = temp;
                              
                              String tem = mobil[i];
                              mobil[i] = mobil[i+1];
                              mobil[i + 1] = tem;
                          }
                      }
                 }
             }
        //menampilkan hasil sortingan
        for (int i = 0; i < harga.length; i++) {
            txaMobil.append((i+1)+". "+mobil[i]+"\n" );// menampilkan array list di teks area
            txaHarga.append((i+1)+".Rp "+harga[i]+"\n");
        }
        txaMobil.setEditable(false); //agar teks area tidak bisa diedit
        txaHarga.setEditable(false);

    }//GEN-LAST:event_btnAscedingActionPerformed

    private void btnDescedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescedingActionPerformed
    txaMobil.setText("");
    txaHarga.setText("");
            
    String[] mobil = {"Avanza", "Brio", "Xenia", "Ayla", "Fortuner", "Pajero", "Ertiga", 
    "Chevrolet", "Cizeta", "Jeep", "Lamborghini", "Hummer", "Geely", "Kawasaki", "Mitsubishi", 
    "Mercedes", "Maybach", "Lesus", "Pagani", "Nissan", "Suzuki", "Toyota", "Yamaha", "Kijang", "Mazda"};
    
    int[] harga = {100000, 50000, 120000, 75000, 250000, 740000, 900000, 
        125000, 800000, 600000, 980000, 780000, 450000, 696900, 720000,
    930000, 790000, 690000, 123000, 650000, 150000, 320000, 500000, 550000, 850000};
    
	//algoritma insertion sort secara desceding (besar ke kecil)
	for (int j = 0; j < harga.length; j++) {
                 for (int i = 0; i < harga.length; i = i + 1){ 
                      if (i != (harga.length - 1)) { 
                          if (harga[i] <= harga[i + 1]) {
                              int temp = harga[i];
                              harga[i] = harga[i + 1];
                              harga[i + 1] = temp;
                              
                              String tem = mobil[i];
                              mobil[i] = mobil[i+1];
                              mobil[i + 1] = tem;
                          }
                      }
                 }
             }
        //menampilkan hasil sortingan
        for (int i = 0; i < harga.length; i++) {
            txaMobil.append((i+1)+". "+mobil[i]+"\n" );
            txaHarga.append((i+1)+".Rp "+harga[i]+"\n");
        }
        txaMobil.setEditable(false);
        txaHarga.setEditable(false);
    }//GEN-LAST:event_btnDescedingActionPerformed

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
            java.util.logging.Logger.getLogger(Harga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Harga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Harga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Harga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Harga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsceding;
    private javax.swing.JButton btnDesceding;
    private javax.swing.JButton btnKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txaHarga;
    private javax.swing.JTextArea txaMobil;
    // End of variables declaration//GEN-END:variables
}

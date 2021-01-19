package JavaSwing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pankaj Yadav
 */
public class IssuedBooks extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    /**
     * Creates new form IssuedBooks
     */
    public IssuedBooks() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Detail Peminjaman Buku");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 10, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama Mahasiswa", "ID Buku", "Nama Buku", "Alamat Mahasiswa", "Waktu Peminjaman"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setPreferredWidth(200);
            table.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 137, 914, 304));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 480, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Detail Buku");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 480, 148, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Tambah Buku Baru");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 480, 156, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Pinjam Buku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 480, 159, -1));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Kembalikan Buku");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 480, 152, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Registrasi Mahasiswa");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 480, -1, -1));

        c1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Jurusan", "Teknik Elektro", "Teknik Informatika", "Agroteknologi", "Fisikia", "Kimia", "Biologi", "Matematika" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 96, -1, -1));

        c2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 96, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kelompok Jurusan");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 99, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kelompok Semester");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 99, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaSwing/bukukembali.png"))); // NOI18N
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 190, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        if(c1.getSelectedItem()=="Teknik Elektro")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-TE");c2.addItem("2-TE");c2.addItem("3-TE");
            c2.addItem("4-TE");c2.addItem("5-TE");c2.addItem("6-TE");c2.addItem("7-TE");c2.addItem("8-TE");
            c2.addItem("9-TE");c2.addItem("10-TE");c2.addItem("11-TE");c2.addItem("12-TE");c2.addItem("13-TE");
            c2.addItem("14-TE");
        }
        if(c1.getSelectedItem()=="Teknik Informatika")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-TI");c2.addItem("2-TI");c2.addItem("3-TI");
            c2.addItem("4-TI");c2.addItem("5-TI");c2.addItem("6-TI");c2.addItem("7-TI");c2.addItem("8-TI");
            c2.addItem("9-TI");c2.addItem("10-TI");c2.addItem("11-TI");c2.addItem("12-TI");c2.addItem("13-TI");
            c2.addItem("14-TI");
        }
        if(c1.getSelectedItem()=="Agroteknologi")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-Agro");c2.addItem("2-Agro");c2.addItem("3-Agro");
            c2.addItem("4-Agro");c2.addItem("5-Agro");c2.addItem("6-Agro");c2.addItem("7-Agro");c2.addItem("8-Agro");
            c2.addItem("9-Agro");c2.addItem("10-Agro");c2.addItem("11-Agro");c2.addItem("12-Agro");c2.addItem("13-Agro");
            c2.addItem("14-Agro");
        }
        if(c1.getSelectedItem()=="Fisika")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-Fis");c2.addItem("2-Fis");c2.addItem("3-Fis");
            c2.addItem("4-Fis");c2.addItem("5-Fis");c2.addItem("6-Fis");c2.addItem("7-Fis");c2.addItem("8-Fis");
            c2.addItem("9-Fis");c2.addItem("10-Fis");c2.addItem("11-Fis");c2.addItem("12-Fis");c2.addItem("13-Fis");
            c2.addItem("14-Fis");
        }
        if(c1.getSelectedItem()=="Biologi")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-Bio");c2.addItem("2-Bio");c2.addItem("3-Bio");
            c2.addItem("4-Bio");c2.addItem("5-Bio");c2.addItem("6-Bio");c2.addItem("7-Bio");c2.addItem("8-Bio");
            c2.addItem("9-Bio");c2.addItem("10-Bio");c2.addItem("11-Bio");c2.addItem("12-Bio");c2.addItem("13-Bio");
            c2.addItem("14-Bio");
        }
        if(c1.getSelectedItem()=="Kimia")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-Kim");c2.addItem("2-Kim");c2.addItem("3-Kim");
            c2.addItem("4-Kim");c2.addItem("5-Kim");c2.addItem("6-Kim");c2.addItem("7-Kim");c2.addItem("8-Kim");
            c2.addItem("9-Kim");c2.addItem("10-Kim");c2.addItem("11-Kim");c2.addItem("12-Kim");c2.addItem("13-Kim");
            c2.addItem("14-Kim");
        }
        if(c1.getSelectedItem()=="Matematika")
        {
            c2.removeAllItems();
            c2.addItem("Select Semester");c2.addItem("1-MTK");c2.addItem("2-MTK");c2.addItem("3-MTK");
            c2.addItem("4-MTK");c2.addItem("5-MTK");c2.addItem("6-MTK");c2.addItem("7-MTK");c2.addItem("8-MTK");
            c2.addItem("9-MTK");c2.addItem("10-MTK");c2.addItem("11-MTK");c2.addItem("12-MTK");c2.addItem("13-MTK");
            c2.addItem("14-MTK");
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        try
        {
            connect();
            query="select * from peminjaman where KelompokJurusann='"+c1.getSelectedItem()+"' and KelompokSemesterr='"+c2.getSelectedItem()+"';";
            rs=stmt.executeQuery(query); 
            DefaultTableModel model=(DefaultTableModel)table.getModel();
            model.setRowCount(0);
            while(rs.next())
            {
            Object[] row = {rs.getString("NIM"),rs.getString("Nama"),rs.getString("IDBuku"),rs.getString("NamaBuku"),rs.getString("Alamat"),rs.getString("WaktuPeminjaman")};
            model.addRow(row);
            }
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_c2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddNewBook anb=new AddNewBook();
        anb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        RegisterStudent r=new RegisterStudent();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IssuedBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IssuedBooks().setVisible(true);
//            }
//        });
//    }

    public void connect()
    {
        try
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/uinsgdxsaintek-library","root","");  
            stmt=con.createStatement(); 
        }
        catch(Exception e)
        { 
            JOptionPane.showMessageDialog(this,"Koneksi Error");
        }
    }
    public void disconnect()
    {
        try
        {
           con.close(); 
        }
        catch(Exception e)
        {}

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
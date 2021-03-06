package JavaSwing;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pankaj Yadav
 */
public class IssueBook extends javax.swing.JFrame {

    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    Date date=new Date();
    SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
    String  checkAvailability,SName,Address,SStream,SClass;
    /**
     * Creates new form ReturnBook
     */
    public IssueBook() {
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
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                OnCreate(evt);
            }
        });

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Peminjaman Buku");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("NIM");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, -1, -1));

        t1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        kGradientPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 82, 168, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Nama");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 123, -1, -1));

        t2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t2.setEnabled(false);
        kGradientPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 120, 285, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("ID Buku");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, -1, -1));

        t3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t3KeyReleased(evt);
            }
        });
        kGradientPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 171, 164, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Nama Buku");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 268, -1, -1));

        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setEnabled(false);
        kGradientPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 268, 285, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Tanggal Peminjaman");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        t5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t5.setEnabled(false);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 149, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pinjam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Batal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 453, 146, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Detail Buku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 453, 152, -1));

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Kembalikan Buku");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 453, 150, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Detail Peminjaman");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 453, 140, -1));

        jButton7.setBackground(new java.awt.Color(0, 102, 102));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Registrasi Mahasiswa");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 453, 154, -1));

        t6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t6.setEnabled(false);
        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 220, 48, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Ketersediaan");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 224, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Penulis");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        t8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t8.setEnabled(false);
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(t8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 270, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaSwing/pinjambuku.png"))); // NOI18N
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void OnCreate(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_OnCreate
        // TODO add your handling code here:
    }//GEN-LAST:event_OnCreate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(t2.getText().equals("")) 
            JOptionPane.showMessageDialog(this,"मान ना मान मैं तेरा मेहमान\nNama Yang Dimasukkan Belum Registrasi Akun Perpus");
        else
        {
                try
                    {
                        connect();
                        query="select * from buku where IDBuku='"+t3.getText()+"';";
                        
                        rs=stmt.executeQuery(query); 
                        rs.next();
                        if(t6.getText().equals("YES"))
                        {
                            query="insert into peminjaman values('"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t8.getText()+"','"+Address+"','"+t5.getText()+"','"+SStream+"','"+SClass+"');";
                            
                            stmt.executeUpdate(query);
                            JOptionPane.showMessageDialog(this,"Buku Dengan ID Buku = "+t3.getText()+" Sudah Dipinjam Oleh "+t2.getText());
                            query="update buku set Ketersediaan='NO' where IDBuku='"+t3.getText()+"';";
                            stmt.executeUpdate(query);
                            
                            
                        }
                        if(t6.getText().equals("NO"))
                        {
                            JOptionPane.showMessageDialog(this,"Buku Dengan ID Buku Ini Tidak Tersedia Saat Ini");
                        }
                        if(t6.getText().equals(""))
                        {
                            JOptionPane.showMessageDialog(this,"Tidak Ada Buku Dengan ID Buku ini di Perpustakaan");
                        }
                        
                            t4.setText("");
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            t6.setText("");
                            t8.setText("");
                        disconnect();

                    }
                    catch(SQLException e)
                    {
                        if(e.getErrorCode()==1062)
                        JOptionPane.showMessageDialog(this,"Seorang Mahasiswa Hanya Bisa Meminjam Satu Buku pada suatu waktu ");
                    }
                }
                
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BookDetails bd=new BookDetails();
        bd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        RegisterStudent r=new RegisterStudent();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        try
        {
            connect();
            query="select * from mahasiswa where NIM='"+t1.getText()+"';";
            rs=stmt.executeQuery(query); 
            if(rs.next())
            {
                SName=rs.getString("Nama");
                Address=rs.getString("Alamat");
                SStream=rs.getString("KelompokJurusann");
                SClass=rs.getString("KelompokSemesterr");
                t2.setText(SName);
            }
            else
                t2.setText("");
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t5.setText(format.format(date));
    }//GEN-LAST:event_t1KeyReleased

    private void t3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyReleased
        try
        {
            connect();
            query="select * from buku where IDBuku='"+t3.getText()+"';";
            rs=stmt.executeQuery(query); 
            if(rs.next())
            {
                t6.setText(rs.getString("Ketersediaan"));
                t4.setText(rs.getString("NamaBuku"));
                t8.setText(rs.getString("Penulis"));
            }
            else
            {
                t6.setText("");
                t4.setText("");
                t8.setText("");
            }
            disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_t3KeyReleased

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

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
//            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IssueBook().setVisible(true);
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
            System.out.println(e);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t8;
    // End of variables declaration//GEN-END:variables
}

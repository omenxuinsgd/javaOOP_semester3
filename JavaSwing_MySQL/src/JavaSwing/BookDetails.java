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
public class BookDetails extends javax.swing.JFrame {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String query;
    String BId,Bname,Bauthor,strm,cls,avl;
    
    
    
    
    /**
     * Creates new form BookDetails
     */
    public BookDetails() {
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

        b1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        txt1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        b1.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        r1.setText("Cari Nama Buku");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        b1.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        r2.setText("Cari Kelompok Kelas");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        c1.setForeground(new java.awt.Color(204, 0, 0));
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Jurusan", "Teknik Elektro", "Teknik Informatika", "Agroteknologi", "Fisikia", "Kimia", "Biologi", "Matematika" }));
        c1.setEnabled(false);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setForeground(new java.awt.Color(204, 0, 0));
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester" }));
        c2.setEnabled(false);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txt1.setForeground(new java.awt.Color(204, 0, 0));
        txt1.setEnabled(false);
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt1KeyReleased(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Buku", "Nama Buku", "Penulis", "Jurusan", "Semester", "Available"
            }
        ));
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(40);
            table.getColumnModel().getColumn(1).setPreferredWidth(210);
            table.getColumnModel().getColumn(2).setPreferredWidth(150);
            table.getColumnModel().getColumn(3).setPreferredWidth(40);
            table.getColumnModel().getColumn(4).setPreferredWidth(40);
            table.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tambah Buku Baru");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pinjam Buku");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Kembalikan Buku");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Detail Peminjaman");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Detail Buku");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaSwing/bookpanda.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jButton5)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(c2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(r2)
                                        .addComponent(r1))
                                    .addGap(26, 26, 26)
                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                    .addGap(254, 254, 254)
                                    .addComponent(jLabel1)))
                            .addGap(0, 363, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(54, 54, 54))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(r1)
                        .addComponent(txt1))
                    .addGap(18, 18, 18)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(r2)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(85, 85, 85)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        c1.disable();c2.disable();
        txt1.enable();
    }//GEN-LAST:event_r1ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        
    }//GEN-LAST:event_txt1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        txt1.disable();
        c1.enable();
    }//GEN-LAST:event_r2ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        try
        {
           
        connect();
        query="select * from buku where KelompokJurusan='"+c1.getSelectedItem()+"' and KelompokSemester='"+c2.getSelectedItem()+"';";
        rs=stmt.executeQuery(query); 
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        while(rs.next())
        {
            BId=rs.getString("IDBuku");
            Bname=rs.getString("NamaBuku");
            Bauthor=rs.getString("Penulis");
            strm=rs.getString("KelompokJurusan");
            cls=rs.getString("KelompokSemester");
            avl=rs.getString("Ketersediaan");
            Object[] row = {BId,Bname,Bauthor,strm,cls,avl};
            model.addRow(row);
        }
        disconnect();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_c2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        c2.enable();
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

    private void txt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyReleased
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        model.setRowCount(0);
        String txt=txt1.getText();
        if(txt.equals(""))
            System.out.println("");
        else
        {
            try
            {
                connect();
                query="select * from buku where NamaBuku LIKE \"%"+txt1.getText()+"%\";";
                rs=stmt.executeQuery(query); 
                while(rs.next())
                {
                    BId=rs.getString("IDBuku");
                    Bname=rs.getString("NamaBuku");
                    Bauthor=rs.getString("Penulis");
                    strm=rs.getString("KelompokJurusan");
                    cls=rs.getString("KelompokSemester");
                    avl=rs.getString("Ketersediaan");
                    Object[] row = {BId,Bname,Bauthor,strm,cls,avl};
                    model.addRow(row);
                }
                disconnect();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }   
    }//GEN-LAST:event_txt1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddNewBook anb=new AddNewBook();
        anb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainLayer mn=new MainLayer();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        IssueBook ib=new IssueBook();
        ib.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ReturnBook rb=new ReturnBook();
        rb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        IssuedBooks ibs=new IssuedBooks();
        ibs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
//            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BookDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BookDetails().setVisible(true);
//            }
//        });
//    }
//    
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
    private javax.swing.ButtonGroup b1;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
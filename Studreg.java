/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration12;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author india
 */
public class Studreg extends javax.swing.JFrame {

   private static final String username = "root";
    private static final String password = "root";
    private static final String datacon = "jdbc:mysql://localhost:3306/studreg";

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
  public void dbconnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(datacon, username, password);
        

        
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }

    public Studreg() {
        initComponents();
     //   showTableData();
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbuttonupdate = new javax.swing.JButton();
        jbuttondelete = new javax.swing.JButton();
        jbuttonreset = new javax.swing.JButton();
        jbuttonnew = new javax.swing.JButton();
        jbuttonexit = new javax.swing.JButton();
        jbuttondisplay = new javax.swing.JButton();
        jbsearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jid = new javax.swing.JLabel();
        jname = new javax.swing.JLabel();
        jemail = new javax.swing.JLabel();
        jphone = new javax.swing.JLabel();
        jaddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jtextid = new javax.swing.JTextField();
        jtextname = new javax.swing.JTextField();
        jtextphone = new javax.swing.JTextField();
        jtextemail = new javax.swing.JTextField();
        jtextaddress = new javax.swing.JTextField();
        jlabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));

        jbuttonupdate.setText("UPDATE");
        jbuttonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonupdateActionPerformed(evt);
            }
        });

        jbuttondelete.setText("DELETE");
        jbuttondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondeleteActionPerformed(evt);
            }
        });

        jbuttonreset.setText("RESET");
        jbuttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonresetActionPerformed(evt);
            }
        });

        jbuttonnew.setText("ADD NEW");
        jbuttonnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonnewActionPerformed(evt);
            }
        });

        jbuttonexit.setText("EXIT");
        jbuttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonexitActionPerformed(evt);
            }
        });

        jbuttondisplay.setText("DISPLAY");
        jbuttondisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttondisplayActionPerformed(evt);
            }
        });

        jbsearch.setText("SEARCH");
        jbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbuttondelete, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jbuttonreset, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jbuttonupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbuttonnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbuttonexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbuttondisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbuttonnew)
                .addGap(32, 32, 32)
                .addComponent(jbuttonupdate)
                .addGap(30, 30, 30)
                .addComponent(jbuttondelete)
                .addGap(18, 18, 18)
                .addComponent(jbuttondisplay)
                .addGap(35, 35, 35)
                .addComponent(jbuttonreset)
                .addGap(34, 34, 34)
                .addComponent(jbsearch)
                .addGap(31, 31, 31)
                .addComponent(jbuttonexit)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("REGISTRATION FORM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 4, true));

        jid.setText("ID");

        jname.setText("NAME");

        jemail.setText("EMAIL-ID");

        jphone.setText("PHONE NO");

        jaddress.setText("ADDRESS");

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PHONE_NO", "EMAIL-ID", "ADDRESS"
            }
        ));
        jScrollPane1.setViewportView(jtable);

        jtextid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextidActionPerformed(evt);
            }
        });
        jtextid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtextidKeyTyped(evt);
            }
        });

        jtextphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtextphoneKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jphone, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(jaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtextid)
                        .addComponent(jtextphone)
                        .addComponent(jtextname)
                        .addComponent(jtextemail)
                        .addComponent(jtextaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jlabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtextid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextphone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jphone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextemail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtextaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1120, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtextidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextidActionPerformed
    private JFrame frame;
    private void jbuttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonexitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "REGISTRATION FORM",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
      System.exit(0);
        }
    }//GEN-LAST:event_jbuttonexitActionPerformed

    private void jbuttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonresetActionPerformed
        // TODO add your handling code here:
        jtextid.setText("");
        jtextname.setText("");
        jtextphone.setText("");
        jtextemail.setText("");
        jtextaddress.setText("");

    }//GEN-LAST:event_jbuttonresetActionPerformed

    
    
    
    
    private void jbuttonnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonnewActionPerformed
        // TODO add your handling code here:
     
        try {
           
            String sql = "INSERT INTO student"
                    + "(ID,SNAME,PHONENO,EMAILID,ADDRESS)"
                    + "VALUES(?,?,?,?,?)";
          
            dbconnection();
            pst = con.prepareStatement(sql);
            pst.setString(1,jtextid.getText());
            pst.setString(2, jtextname.getText());
            pst.setString(3, jtextphone.getText());
            pst.setString(4, jtextemail.getText());
            pst.setString(5, jtextaddress.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "inserted successfully");
        }   catch (Exception e) {
            e.printStackTrace();
        }
      
        showTableData();
    }//GEN-LAST:event_jbuttonnewActionPerformed


    private void jbuttondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondeleteActionPerformed
        
        try {
            dbconnection();
            String sql = "DELETE FROM student WHERE ID=?";
            pst = con.prepareStatement(sql);
            pst.setString(1,jtextid.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "deleted successfully");
                 
        } catch (Exception e) {
            e.printStackTrace();
        }

        isValid();
   showTableData();

    }//GEN-LAST:event_jbuttondeleteActionPerformed

    public boolean Valid() {
    String mail=jtextemail.getText();
        String emailFormate = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
                + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern p = Pattern.compile(mail);
        if (mail == null) {
            JOptionPane.showMessageDialog(null,"please enter valid email id");
        }else{
            jtextemail.setText("");
        }
        return p.matcher(mail).matches();
    }
    
    
    public void showTableData() {
        try {
            dbconnection();
            String sql = "SELECT * from student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
             
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void jbuttonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonupdateActionPerformed
        // TODO add your handling code here:
       // DefaultTableModel RecordT=(DefaultTableModel)jtable.getModel();
        //int Selectedrow=jtable.getSelectedRowCount();
        
       try {
          // int id=Integer.parseInt(RecordT.getValueAt(Selectedrow , 0).toString());
            String sql = "UPDATE student SET SNAME=?,PHONENO=?,EMAILID=?,ADDRESS=? WHERE ID=?";
            pst = con.prepareStatement(sql);
            pst.setString(5, jtextid.getText());
            pst.setString(1, jtextname.getText());
            pst.setString(2, jtextphone.getText());
            pst.setString(3, jtextemail.getText());
            pst.setString(4, jtextaddress.getText());
            //pst.setInt(6, id);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        showTableData();

    }//GEN-LAST:event_jbuttonupdateActionPerformed

    private void jbuttondisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttondisplayActionPerformed
        

     showTableData();
    }//GEN-LAST:event_jbuttondisplayActionPerformed

    private void jbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsearchActionPerformed
        // TODO add your handling code here:
   
       
     try {
        dbconnection();
         String sql=("select * from student where ID= "+Integer.parseInt(jtextid.getText()));
         pst = con.prepareStatement(sql);
        // pst.setInt(1, id);
         rs = pst.executeQuery();
         
        // String id=jtextid.getText();
          if (rs.next()) {
                 jtextname.setText(rs.getString("SNAME"));
                jtextphone.setText(rs.getString("PHONENO"));
                jtextemail.setText(rs.getString("EMAILID"));
                jtextaddress.setText(rs.getString("ADDRESS"));
               
            } else {
                 JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                jtextname.setText("");
                jtextphone.setText("");
                jtextemail.setText("");
                jtextaddress.setText("");
                jtextid.requestFocus();
                // JOptionPane.showMessageDialog(null,"record found");
            }
         
         
         
       /* String sql=("select * from student where ID="+Integer.parseInt(jtextid.getText()));
        pst = con.prepareStatement(sql);
         rs = pst.executeQuery();
       //  int id=Integer.parseInt(jtextid.getText());
        String id=jtextid.getText();
        //pst.setInt(1, id);
         if(rs.next()){
              jtextname.setText(rs.getString("SNAME"));
              jtextphone.setText(rs.getString("PHONENO"));
              jtextemail.setText(rs.getString("EMAILID"));
              jtextaddress.setText(rs.getString("ADDRESS"));
              
         }else{
             JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
         }
        */
        
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
       
   // showTableData();
    }//GEN-LAST:event_jbsearchActionPerformed

    private void jtextidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextidKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_jtextidKeyTyped

    private void jtextphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtextphoneKeyPressed
        // TODO add your handling code here: 
        
        String pno=jtextphone.getText();
        int length=pno.length();
        char c=evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                jtextphone.setEditable(true);
            }else{
                jtextphone.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                jtextphone.setEditable(true);
            }else{
                jtextphone.setEditable(false);
            } 
            
        }
        
    }//GEN-LAST:event_jtextphoneKeyPressed
/*
    try{ 
        int i=Integer.parseInt(jtextid.getText());
     jlabel1.setText("");
       }catch(NumberFormatException e){
           
         jlabel1.setText("Invalid number");
           
       }        */
    //email verification code

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
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Studreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Studreg().setVisible(true);
 //DaoConnection c=new DaoConnection();
 //c.dbconnection();
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jaddress;
    private javax.swing.JButton jbsearch;
    private javax.swing.JButton jbuttondelete;
    private javax.swing.JButton jbuttondisplay;
    private javax.swing.JButton jbuttonexit;
    private javax.swing.JButton jbuttonnew;
    private javax.swing.JButton jbuttonreset;
    private javax.swing.JButton jbuttonupdate;
    private javax.swing.JLabel jemail;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JLabel jname;
    private javax.swing.JLabel jphone;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField jtextaddress;
    private javax.swing.JTextField jtextemail;
    private javax.swing.JTextField jtextid;
    private javax.swing.JTextField jtextname;
    private javax.swing.JTextField jtextphone;
    // End of variables declaration//GEN-END:variables
}

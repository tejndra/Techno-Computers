
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devang Chhajed
 */
public class Shop extends javax.swing.JFrame {

    /**
     * Creates new form apple
     */
    public Shop() {
        initComponents();
    start();
    }
    
    public void start(){
    jPanel1.setVisible(false);
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jr1 = new javax.swing.JRadioButton();
        jr2 = new javax.swing.JRadioButton();
        jr3 = new javax.swing.JRadioButton();
        jr4 = new javax.swing.JRadioButton();
        jr5 = new javax.swing.JRadioButton();
        jr6 = new javax.swing.JRadioButton();
        jr7 = new javax.swing.JRadioButton();
        jr8 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jr9 = new javax.swing.JRadioButton();
        jr10 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(709, 552));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jr1);
        jr1.setText("Yes");
        getContentPane().add(jr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        buttonGroup1.add(jr2);
        jr2.setText("No");
        getContentPane().add(jr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        buttonGroup2.add(jr3);
        jr3.setText("No");
        getContentPane().add(jr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        buttonGroup2.add(jr4);
        jr4.setText("Yes");
        getContentPane().add(jr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        buttonGroup3.add(jr5);
        jr5.setText("No");
        getContentPane().add(jr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        buttonGroup3.add(jr6);
        jr6.setText("Yes");
        getContentPane().add(jr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        buttonGroup4.add(jr7);
        jr7.setText("No");
        jr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr7ActionPerformed(evt);
            }
        });
        getContentPane().add(jr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        buttonGroup4.add(jr8);
        jr8.setText("Yes");
        jr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr8ActionPerformed(evt);
            }
        });
        getContentPane().add(jr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Core 2 Duo", "i3", "i5", "i7" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 GB", "2 GB", "4 GB", "8 GB" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "512 GB", "1024 GB", "2048 GB" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "512 MB", "1 GB", "2 GB", "4 GB" }));

        jLabel6.setText("RAM");

        jLabel7.setText("Processor");

        jLabel8.setText("Hard Disk");

        jLabel9.setText("Graphic Card");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel7)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel7)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 440, -1));

        buttonGroup5.add(jr9);
        jr9.setText("No");
        jr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr9ActionPerformed(evt);
            }
        });
        getContentPane().add(jr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        buttonGroup5.add(jr10);
        jr10.setText("Yes");
        jr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jr10ActionPerformed(evt);
            }
        });
        getContentPane().add(jr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        jButton1.setText("Place the Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 169, 41));

        jLabel1.setText("Monitor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel2.setText("Keyboard");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel3.setText("Mouse");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel4.setText("C.P.U");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel5.setText("Printer");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DELL", "LENOVO", "SONY", "HP", "SAMSUNG", "LG" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 100, -1));

        jLabel10.setText("Company Name");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel11.setText("SHOP");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 50, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr8ActionPerformed
if (jr8.isSelected()==true)
{jPanel1.setVisible(true);}
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jr8ActionPerformed

    private void jr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr7ActionPerformed
if (jr7.isSelected()==true)
{jPanel1.setVisible(false);}


// TODO add your handling code here:
    }//GEN-LAST:event_jr7ActionPerformed

    private void jr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jr9ActionPerformed

    private void jr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jr10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jr10ActionPerformed
 int srno=1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
  
  String cname=(String)jComboBox4.getSelectedItem();
  String keyboard = null;   
  String monitor = null;
  String mouse = null;
  String printer = null;
  String pro=null;
 String ram=null;
 String hd=null;
 String graphiccard=null;
 
 
 
 //adding values
 
  if(jr1.isSelected()==true)
  {monitor="yes";}
  else if(jr2.isSelected()==true)
  {monitor="no";}
  

  if(jr4.isSelected()==true)
  {keyboard="yes";}
  else if(jr3.isSelected()==true)
  {keyboard="no";}
  

  if(jr6.isSelected()==true)
  {mouse="yes";}
  else if(jr5.isSelected()==true)
  {mouse="no";}
  

  if(jr10.isSelected()==true)
  {printer="yes";}
  else if(jr9.isSelected()==true)
  {printer="no";}
  
  
  if(jr8.isSelected()==true)
  {
  
pro=(String) jComboBox1.getSelectedItem();
ram=(String) jComboBox2.getSelectedItem();
hd=(String) jComboBox3.getSelectedItem();
graphiccard=(String) jComboBox5.getSelectedItem();
  
  }
  
      
  try{
          

        Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/technocomputer","root","manager");
        Statement s=con.createStatement();
      
        //srno
        
       
        ResultSet rs=s.executeQuery("select srno from orders;");
     
        rs.last();
        
            String temp=rs.getString(1);
     
            System.out.print(temp);
             
        
        //srno close
        
        srno=Integer.parseInt(temp);
        srno++;
        
        
        String q="insert into orders values("+srno+", \""+cname+"\" , \""+monitor+"\" , \""+keyboard+"\" , \""+mouse+"\" , \""+ram+"\" , \""+hd+"\" , \""+pro+"\" , \""+graphiccard+"\" , \""+printer+"\" )";
        int x=s.executeUpdate(q);
         JOptionPane.showMessageDialog(this, "Done");
      
        }
  
  catch(Exception e)
        {
         JOptionPane.showMessageDialog(null, "Order not Registered Due to "+e);
        
        }
 
  
  
  
  
  
  
  
  
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shop().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
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
    private javax.swing.JRadioButton jr1;
    private javax.swing.JRadioButton jr10;
    private javax.swing.JRadioButton jr2;
    private javax.swing.JRadioButton jr3;
    private javax.swing.JRadioButton jr4;
    private javax.swing.JRadioButton jr5;
    private javax.swing.JRadioButton jr6;
    private javax.swing.JRadioButton jr7;
    private javax.swing.JRadioButton jr8;
    private javax.swing.JRadioButton jr9;
    // End of variables declaration//GEN-END:variables
}

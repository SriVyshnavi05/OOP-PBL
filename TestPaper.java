/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Onlineexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SRI VYSHNAVI
 */
public class TestPaper extends javax.swing.JFrame {

    /**
     * Creates new form TestPaper
     */
    public String tname;
    public TestPaper(String testname) {
        initComponents();
        this.setLocationRelativeTo(null);
       tname=testname;
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TestPaper");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 180, 40));

        jLabel3.setText("Question -1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, -1));

        jLabel4.setText("Question -2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel5.setText("Question -3");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel6.setText("Question -4");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel7.setText("Question -5");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        getContentPane().add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 850, 30));
        getContentPane().add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 850, 30));
        getContentPane().add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 850, 30));
        getContentPane().add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 850, 30));
        getContentPane().add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 850, 30));
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 30));

        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 140, 30));
        getContentPane().add(a3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 150, 30));
        getContentPane().add(a4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 160, 30));
        getContentPane().add(a5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 160, 30));

        jButton1.setText("Add");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 110, 40));

        jLabel9.setText("Answer:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 50, -1));

        jLabel8.setText("Answer:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 60, -1));

        jLabel10.setText("Answer:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, -1));

        jLabel11.setText("Answer:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 50, -1));

        jLabel12.setText("Answer:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 50, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>                        

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
        String qu1 = q1.getText();
        String qu2 = q2.getText();
        String qu3 = q3.getText();
        String qu4 = q4.getText();
        String qu5 = q5.getText();
        String an1 = a1.getText();
        String an2 = a2.getText();
        String an3 = a3.getText();
        String an4 = a4.getText();
        String an5 = a5.getText();
           
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/onlineexam";
                String name = "root";
                String pass = "";
                Connection con = DriverManager.getConnection(url, name, pass);
                /*if(is_registered(con,mn)){
                    JOptionPane.showMessageDialog(this, "Already Added!");
                    return;
                }*/
                String s="insert into questions(testname,question1,question2,question3,question4,question5,ans1,ans2,ans3,ans4,ans5) values('"+tname+"','"+qu1+"','"+qu2+"','"+qu3+"','"+qu4+"','"+qu5+"','"+an1+"','"+an2+"','"+an3+"','"+an4+"','"+an5+"')";
                PreparedStatement pstmt=con.prepareStatement(s);
                
                
                if("".equals(q1.getText())){
                    JOptionPane.showMessageDialog(this,"Fill al blanks correctly!\nPlease try again!\n");
                }
                else{
                    pstmt.execute();
                    JOptionPane.showMessageDialog(this,"Added test SUCCESSFUL\n");
                    q1.setText("");
                    q2.setText("");
                    q3.setText("");
                    q4.setText("");
                    q5.setText("");
                    a1.setText("");
                    a2.setText("");
                    a3.setText("");
                    a4.setText("");
                    a5.setText("");
                   this.dispose();
                 
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new AdminMain().setVisible(true);
                    }
                    });
                }
                con.close();
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
                   
            
    }                                        

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
            java.util.logging.Logger.getLogger(TestPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestPaper("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration                   
}
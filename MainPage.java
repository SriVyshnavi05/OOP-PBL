
package Onlineexam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MainPage extends javax.swing.JFrame {

    private DrawerController drawer;
    
    public Connection con;
    public String userN;
    public MainPage(String name) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        userN=name;
        jLabel2.setText("Hello "+name);
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/onlineexam";
                String name1 = "root";
                String pass = "";
                con = DriverManager.getConnection(url, name1, pass);
        }catch(Exception e){
           JOptionPane.showMessageDialog(rootPane,"error");
        }
                
        drawer=Drawer.newDrawer(this)
                .header(new Header())
                .space(5)
                .backgroundTransparent(0.9f)
                .addChild(new DrawerItem("Profile").icon(new ImageIcon(getClass().getResource("/icon/profile.png"))).build())
                .addChild(new DrawerItem("Admin details ").icon(new ImageIcon(getClass().getResource("/icon/clap.png"))).build())
                .addChild(new DrawerItem("results").icon(new ImageIcon(getClass().getResource("/icon/wallet-arrow.png"))).build())
                .addChild(new DrawerItem("About").icon(new ImageIcon(getClass().getResource("/icon/info.png"))).build())
                .enableScroll(true)
                
                .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/icon/exit1.png"))).build())
                .event(new EventDrawer(){
        @Override
        public void selected (int i,DrawerItem di){
                  System.out.println(i);
                  if(i==0){
                      String msg="",s="select * From login Where Name='"+userN+"'";
                      try{
                          PreparedStatement ps=con.prepareStatement(s);
                          ResultSet r=ps.executeQuery();
                          while(r.next()){
                              msg="User Name :"+r.getString("Name");
                              msg+="\nPhone No:"+String.valueOf(r.getInt("PhoneNumber"));
                          }
                          JOptionPane.showMessageDialog(rootPane, msg);
                      }catch(Exception e){
                         JOptionPane.showMessageDialog(rootPane,"error");  
                      }
                   
                  }
                  else if(i==1){
                     
                         JOptionPane.showMessageDialog(rootPane,"OOP Lab PBL"); 
                      }

                  
                  else if(i==2){
                      
                      String msg="",s="select *From results Where studentname='"+userN+"'";
                      try{
                          PreparedStatement ps=con.prepareStatement(s);
                          ResultSet r=ps.executeQuery();
                          while(r.next()){
                              msg+="\nTest name:"+r.getString("testname")+"\nMarks :"+String.valueOf(r.getInt("MARKS"));
                              msg+="\nStudent name:"+r.getString("studentname");
                              
                              
                            }
                          JOptionPane.showMessageDialog(rootPane, msg);
                          
                      }catch(Exception e){
                         JOptionPane.showMessageDialog(rootPane,"error"); 
                         System.out.println(msg);
                      }
                  }
                  else if(i==3) {
                      String msg="\n hello";
                      JOptionPane.showMessageDialog(rootPane,"About:Students test portal");
                      
                      
                  }
                  else
                        {
                             dispose();
                             new login().setVisible(true);
                        }
                }
            })
                
    
                .build();
        
        
        
        //panel
        ml.setLayout(new BoxLayout(ml, BoxLayout.Y_AXIS));
       String testName="";
        String time="";
        String quno="";
        String duration="";
        try{
        String mov="select *From test";
        
        PreparedStatement psmt=con.prepareStatement(mov);
        ResultSet rs=psmt.executeQuery();
        
        while(rs.next()){
                JLabel box = new JLabel("");
                JLabel mvnm = new JLabel("");
                JLabel plc = new JLabel("");
                JLabel prci = new JLabel("");
                JLabel des = new JLabel("");
                JLabel icn = new JLabel("");
                mvnm.setFont(new java.awt.Font("Segoe UI", 1, 18));
                mvnm.setForeground(new java.awt.Color(255,255,255));
                plc.setFont(new java.awt.Font("Segoe UI", 1, 18));
                plc.setForeground(new java.awt.Color(255,255,255));
                prci.setFont(new java.awt.Font("Segoe UI", 1, 18));
                prci.setForeground(new java.awt.Color(255,255,255));
                des.setFont(new java.awt.Font("Segoe UI", 1, 18));
                des.setForeground(new java.awt.Color(255,255,255));
                JButton btn = new JButton("Write");
                btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                btn.setForeground(new java.awt.Color(255,255,255));
                getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, 40));

                testName = rs.getString("testname");
                time = rs.getString("starttime");
               quno = rs.getString("numberofq");
                duration = rs.getString("duration");
                try {
                   
                    String msg = "test name:" + testName;
                    mvnm.setText(msg);
                    plc.setText("time:" + time+"  o.clock");
                    prci.setText("number of questions: " + quno);
                    des.setText("Duration:" + duration+" minutes");
                   

                    ml.add(mvnm,BorderLayout.CENTER);
                    ml.add(plc,BorderLayout.CENTER);
                    ml.add(prci,BorderLayout.CENTER);
                    ml.add(des,BorderLayout.CENTER);
                   
                    ml.add(btn,BorderLayout.CENTER);
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Display movie name when button is clicked
                            //JOptionPane.showMessageDialog(null, msg);
                             JOptionPane.showMessageDialog(rootPane,msg);
                            dispose();
                            new writeTest(msg.replace("test name:", ""), userN).setVisible(true);
                           
                        }
                    });
                } 
                catch (Exception e) {
                    System.out.print(e);
                }

            }

        } catch (Exception e) {
            System.out.print(e);
        }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ml = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ml.setBackground(new java.awt.Color(0, 153, 51));
        ml.setForeground(new java.awt.Color(242, 242, 242));
        ml.setLayout(new javax.swing.BoxLayout(ml, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(ml, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 420, 390));

        jButton1.setText("iii");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hello,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 350, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Are you Ready!?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 330, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SRI VYSHNAVI\\Downloads\\274.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(drawer.isShow()){
            drawer.hide();
        }
        else{
            drawer.show();
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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new MainPage("Admin").setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel ml;
    // End of variables declaration                   
}

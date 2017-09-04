package Interfas;

import Clases.Conectar;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JORGMTZAR
 */
public class LogIn extends javax.swing.JFrame {

    
    public LogIn() {
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public String usu="";
    public String pas="";
    public String unom="";
    
    
    void acceder(String usuario, String pass)
    {
        String cap="";
        String cap2="";
        String cap1="";
        String sql="SELECT * FROM usuarios WHERE Usuario='"+usuario+"' && contraseña='"+pass+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cap=rs.getString("Area");
                cap2=rs.getString("Nombre");
                cap1=rs.getString("IdUsuario");
            }
            if(cap.equals("Reclutamiento"))
            {
                
                
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Menu ver = new Menu();
                ver.nom=cap2;
                ver.ius=cap1;
                ver.setVisible(true);
                ver.setLocationRelativeTo(null);
                
            }
            else if(cap.equals("Sistemas"))
            {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Bienvenido");
                Registro reg = new Registro();
                reg.setVisible(true);
                reg.setLocationRelativeTo(null);
                
            }
            if((!cap.equals("Reclutamiento"))&& (!cap.equals("Sistemas")))
            {
                JOptionPane.showMessageDialog(this, "No existe sus datos");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2029455_300x300.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 110, -1));

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 110, -1));

        jButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jButton2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton2.setText("REGISTRAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jButton3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cc.desconectar();
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().equals("") || jTextField1.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para Registrar");
        }
        else{
            usu=jTextField1.getText();
            pas=new String(jPasswordField1.getPassword());
            acceder(usu, pas);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTextField1.getText().equals("") || jTextField1.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para Registrar");
        }
        else{
            usu=jTextField1.getText();
            pas=new String(jPasswordField1.getPassword());
            acceder(usu, pas);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        char car = evt.getKeyChar();
        if(car==KeyEvent.VK_ENTER){
            if (jTextField1.getText().equals("") || jTextField1.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos para Registrar");
            }
            else{
            usu=jTextField1.getText();
            pas=new String(jPasswordField1.getPassword());
            acceder(usu, pas);
            }
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char car = evt.getKeyChar();
        if (car==KeyEvent.VK_ENTER){
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    Conectar cc = new Conectar();
    Connection cn = cc.getConnection();
}

package com.ronal.groovespot.ui;

import com.ronal.groovespot.entity.Usuario;
import com.ronal.groovespot.dao.UsuarioDao;
import com.ronal.groovespot.dao.impl.UsuarioDaoImpl;
import com.ronal.groovespot.util.DbConnection;
import javax.swing.JOptionPane;


public class FrmLogin extends javax.swing.JFrame {
    
    
    public FrmLogin() {
        
        initComponents();
         DbConnection.conectar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(5, 20, 10, 10));

        jLabel1.setText("Bienvenido a GrooveSpot");
        getContentPane().add(jLabel1);
        getContentPane().add(jLabel4);

        jLabel2.setText("Ingrese su usuario");
        getContentPane().add(jLabel2);
        getContentPane().add(txtUsuario);

        jLabel3.setText("Ingrese su contraseña");
        getContentPane().add(jLabel3);
        getContentPane().add(txtContraseña);

        jButton2.setText("Registrarse");
        getContentPane().add(jButton2);

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
        logear();
    }//GEN-LAST:event_IngresarActionPerformed

    public String getUsuarioTxt(){
        String usuario = txtUsuario.getText().trim();
        return usuario;
    }
    
    public String getContraseñaTxt(){
        String contra = txtContraseña.getText().trim();
        return contra;
    }
    
    public void logear(){
        
        if (getUsuarioTxt().isEmpty() || getContraseñaTxt().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, completa ambos campos.");
            return; 
        }
        
        UsuarioDao dao = new UsuarioDaoImpl(DbConnection.getConn());    // Crea el DAO
        Usuario usuario = dao.login(getUsuarioTxt(), getContraseñaTxt()); // Intenta login
        if (usuario != null) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido, " + usuario.getCorreo() + "!");
            // Aquí podrías abrir un nuevo JFrame (FrmPrincipal)
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.");
        }
        
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

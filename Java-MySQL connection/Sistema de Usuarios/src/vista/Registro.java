/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Hash;
import modelo.SQLUsuarios;
import modelo.Usuario;

/**
 *
 * @author Fabian
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        lblConfirmar = new javax.swing.JLabel();
        pswConfirmar = new javax.swing.JPasswordField();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txfNombre = new javax.swing.JTextField();
        txfCorreo = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario");

        txfUsuario.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lblPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblPassword.setText("Password");

        pswPassword.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lblConfirmar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblConfirmar.setText("<html>Confirmar Password</html>");

        pswConfirmar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblNombre.setText("Nombre");

        lblCorreo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblCorreo.setText("Correo");

        btnRegistrar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        txfCorreo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        lblRegistro.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lblRegistro.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblPassword)
                            .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre)
                            .addComponent(lblCorreo))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfUsuario)
                            .addComponent(pswPassword)
                            .addComponent(pswConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txfNombre)
                            .addComponent(txfCorreo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lblRegistro)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pswConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        SQLUsuarios modSQL = new SQLUsuarios();
        Usuario usuario = new Usuario();
        
        String password = new String(pswPassword.getPassword());
        String confirmar = new String(pswConfirmar.getPassword());
        
        if(txfUsuario.getText().equals("") | password.equals("") | confirmar.equals("") | txfNombre.getText().equals("") | txfCorreo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Hay campos vacíos, debe llenar todos los campos");
        }else{
            if(password.equals(confirmar)){
                
                if(modSQL.existeUsuario(txfUsuario.getText()) == 0){
                    
                    if(modSQL.esEmail(txfCorreo.getText())){
                        
                        String nuevoPass = Hash.sha1(password);

                        usuario.setUsuario(txfUsuario.getText());
                        usuario.setPassword(nuevoPass);
                        usuario.setNombre(txfNombre.getText());
                        usuario.setCorreo(txfCorreo.getText());
                        usuario.setId_tipo(1);

                        if(modSQL.registrar(usuario)){
                            JOptionPane.showMessageDialog(null, "Registro guardado");
                        }else{
                            JOptionPane.showMessageDialog(null, "Error al guardar");
                        }
                        limpiar();
                    }else{
                        JOptionPane.showMessageDialog(null, "El correo electrónico no es válido");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario ya existe");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
            
        }
      
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Inicio.registro = null;
    }//GEN-LAST:event_formWindowClosing

    private void limpiar(){
        txfUsuario.setText(null);
        pswPassword.setText(null);
        pswConfirmar.setText(null);
        txfNombre.setText(null);
        txfCorreo.setText(null);
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswConfirmar;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan Andrietti
 */
public class tLogin extends javax.swing.JFrame {

    /**
     * Creates new form tlogin
     */
    public tLogin() {
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

        jUser = new javax.swing.JLabel();
        jSenha = new javax.swing.JLabel();
        iconL = new javax.swing.JLabel();
        jSair = new javax.swing.JButton();
        jAcesso = new javax.swing.JButton();
        jNome = new javax.swing.JTextField();
        jInSenha = new javax.swing.JPasswordField();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jUser.setBackground(new java.awt.Color(153, 255, 255));
        jUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jUser.setText("Nome:");
        jUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)));
        jUser.setOpaque(true);
        getContentPane().add(jUser);
        jUser.setBounds(141, 108, 63, 31);

        jSenha.setBackground(new java.awt.Color(153, 255, 255));
        jSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSenha.setText("Senha:");
        jSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)));
        jSenha.setOpaque(true);
        getContentPane().add(jSenha);
        jSenha.setBounds(140, 150, 63, 31);

        iconL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/client_user.png"))); // NOI18N
        getContentPane().add(iconL);
        iconL.setBounds(-50, 0, 160, 160);

        jSair.setBackground(new java.awt.Color(153, 255, 255));
        jSair.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jSair.setText("Sair");
        jSair.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        jSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSairActionPerformed(evt);
            }
        });
        getContentPane().add(jSair);
        jSair.setBounds(460, 140, 110, 40);

        jAcesso.setBackground(new java.awt.Color(153, 255, 255));
        jAcesso.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jAcesso.setText("Acessar");
        jAcesso.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 0, 0)));
        jAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAcessoActionPerformed(evt);
            }
        });
        jAcesso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jAcessoKeyPressed(evt);
            }
        });
        getContentPane().add(jAcesso);
        jAcesso.setBounds(460, 90, 110, 40);

        jNome.setBackground(new java.awt.Color(255, 255, 204));
        jNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jNome.setText("Admin");
        jNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.cyan, java.awt.Color.red, java.awt.Color.red));
        getContentPane().add(jNome);
        jNome.setBounds(210, 110, 230, 30);
        getContentPane().add(jInSenha);
        jInSenha.setBounds(210, 150, 230, 30);

        jFundo.setBackground(new java.awt.Color(153, 204, 255));
        jFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/66133704-121824464gettyimages-713781191.jpg"))); // NOI18N
        jFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jFundo);
        jFundo.setBounds(-6, -6, 610, 320);

        setSize(new java.awt.Dimension(611, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAcessoActionPerformed
        if (jNome.getText().equals("Admin") && jInSenha.getText().equals("12345")) {
            tSistema tela = new tSistema();
            tela.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Dados Incorretos, para acesso sem senha definida, use Nome: Admin e Senha: 12345");
        }
    }//GEN-LAST:event_jAcessoActionPerformed

    private void jSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSairActionPerformed

    private void jAcessoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jAcessoKeyPressed

    }//GEN-LAST:event_jAcessoKeyPressed

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
            java.util.logging.Logger.getLogger(tLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconL;
    private javax.swing.JButton jAcesso;
    private javax.swing.JLabel jFundo;
    private javax.swing.JPasswordField jInSenha;
    private javax.swing.JTextField jNome;
    private javax.swing.JButton jSair;
    private javax.swing.JLabel jSenha;
    private javax.swing.JLabel jUser;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import BaseDados.AcessoConta;
import BaseDados.ConexaoBD;
import BaseDados.ControleConta;
import BaseDados.TabelaConta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jonathan Andrietti
 */
public class Contas extends javax.swing.JFrame {

    AcessoConta mod = new AcessoConta();
    ControleConta control = new ControleConta();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public Contas() {
        initComponents();
        preencherTabelaC("select *from contas order by banco");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Saldo = new javax.swing.JTextField();
        Ccorrente = new javax.swing.JTextField();
        Agencia = new javax.swing.JTextField();
        Banco = new javax.swing.JTextField();
        Excluir = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Total = new javax.swing.JButton();
        Listar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabConta = new javax.swing.JTable();
        Novo = new javax.swing.JButton();
        pesquisa = new javax.swing.JLabel();
        Busca = new javax.swing.JTextField();
        Buscar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Sair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(950, 10, 60, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Saldo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 60, 60, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Cadastrar conta - Editar conta - Remover conta - Listar contas\nTransferir saldo entre contas - Listar saldo total\n\nAs contas devem conter as seguintes informações:\n\nsaldo\ntipoConta (carteira, conta corrente, poupança)\ninstituicaoFinanceira");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 400, 690, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Conta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 20, 90, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Agencia:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 20, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Instituição:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 60, 90, 30);

        Saldo.setEnabled(false);
        getContentPane().add(Saldo);
        Saldo.setBounds(640, 60, 190, 30);

        Ccorrente.setEnabled(false);
        getContentPane().add(Ccorrente);
        Ccorrente.setBounds(170, 20, 170, 30);

        Agencia.setEnabled(false);
        getContentPane().add(Agencia);
        Agencia.setBounds(450, 20, 160, 30);

        Banco.setEnabled(false);
        getContentPane().add(Banco);
        Banco.setBounds(170, 60, 380, 30);

        Excluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.setEnabled(false);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(Excluir);
        Excluir.setBounds(570, 110, 110, 30);

        Salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.setEnabled(false);
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        getContentPane().add(Salvar);
        Salvar.setBounds(190, 110, 110, 30);

        Editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Editar.setText("Editar");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar);
        Editar.setBounds(320, 110, 110, 30);

        Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Total.setText("Total");
        getContentPane().add(Total);
        Total.setBounds(830, 110, 110, 30);

        Listar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Listar.setText("Listar");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });
        getContentPane().add(Listar);
        Listar.setBounds(700, 110, 110, 30);

        TabConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TabConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabContaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabConta);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 220, 690, 170);

        Novo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        getContentPane().add(Novo);
        Novo.setBounds(70, 110, 100, 30);

        pesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pesquisa.setText("Nome para Busca:");
        getContentPane().add(pesquisa);
        pesquisa.setBounds(70, 170, 130, 30);

        Busca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(Busca);
        Busca.setBounds(210, 170, 500, 30);

        Buscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buscar1.setText("Buscar");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar1);
        Buscar1.setBounds(730, 170, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Nº Seguência:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 24, 90, 20);

        Codigo.setEditable(false);
        Codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codigo.setEnabled(false);
        getContentPane().add(Codigo);
        Codigo.setBounds(720, 20, 110, 30);

        Cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.setEnabled(false);
        Cancelar.setOpaque(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar);
        Cancelar.setBounds(450, 110, 100, 30);

        setSize(new java.awt.Dimension(1034, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane,"Devemos Apagar isso do Mapa???\n\n Só você que tem este Poder");
            if (resposta == JOptionPane.YES_OPTION){
               mod.setCodigo(Integer.parseInt(Codigo.getText()));
               control.Excluir(mod);
            }
            Codigo.setText("");
            Ccorrente.setText("");
            Agencia.setText("");
            Banco.setText("");
            Saldo.setText("");
            Busca.setText("");
        
            Salvar.setEnabled(false);
            Editar.setEnabled(false);
            Excluir.setEnabled(false);
            Ccorrente.setEnabled(false);
            Agencia.setEnabled(false);
            Banco.setEnabled(false);
            Saldo.setEnabled(false);
    }//GEN-LAST:event_ExcluirActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListarActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        flag=1;
        Salvar.setEnabled(true);
        Editar.setEnabled(true);
        Excluir.setEnabled(true);
        Ccorrente.setEnabled(true);
        Agencia.setEnabled(true);
        Banco.setEnabled(true);
        Saldo.setEnabled(true);

    }//GEN-LAST:event_NovoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (flag==1){
        mod.setBanco(Banco.getText());
        mod.setCcorrente(Integer.parseInt (Ccorrente.getText()));
        mod.setAgencia(Integer.parseInt (Agencia.getText()));
        mod.setSaldo(Integer.parseInt (Saldo.getText()));
        control.Salvar(mod);
        Ccorrente.setText("");
        Agencia.setText("");
        Banco.setText("");
        Saldo.setText("");
        
        Salvar.setEnabled(false);
        Editar.setEnabled(false);
        Excluir.setEnabled(false);
        Ccorrente.setEnabled(false);
        Agencia.setEnabled(false);
        Banco.setEnabled(false);
        Saldo.setEnabled(false);
        }else{
            mod.setCodigo((Integer.parseInt(Codigo.getText())));
            mod.setBanco(Banco.getText());
            mod.setCcorrente(Integer.parseInt (Ccorrente.getText()));
            mod.setAgencia(Integer.parseInt (Agencia.getText()));
            mod.setSaldo(Integer.parseInt (Saldo.getText()));
            control.Editar(mod);
            Ccorrente.setText("");
            Agencia.setText("");
            Banco.setText("");
            Saldo.setText("");
        
            Salvar.setEnabled(false);
            Editar.setEnabled(false);
            Excluir.setEnabled(false);
            Ccorrente.setEnabled(false);
            Agencia.setEnabled(false);
            Banco.setEnabled(false);
            Saldo.setEnabled(false);
        }
        
    }//GEN-LAST:event_SalvarActionPerformed

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
        mod.setBusca(Busca.getText());
        AcessoConta model = control.buscarConta(mod);
        Codigo.setText(String.valueOf(model.getCodigo()));
        Ccorrente.setText(String.valueOf(model.getCcorrente()));
        Agencia.setText(String.valueOf(model.getAgencia()));
        Banco.setText(model.getBanco());
        Saldo.setText(String.valueOf(model.getSaldo()));
        Editar.setEnabled(true);
        Excluir.setEnabled(true);
    }//GEN-LAST:event_Buscar1ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        flag = 2;
        Salvar.setEnabled(true);
        Editar.setEnabled(true);
        Excluir.setEnabled(true);
        Ccorrente.setEnabled(true);
        Agencia.setEnabled(true);
        Banco.setEnabled(true);
        Saldo.setEnabled(true);
    }//GEN-LAST:event_EditarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Ccorrente.setText("");
        Agencia.setText("");
        Banco.setText("");
        Saldo.setText("");
        
        Ccorrente.setEnabled(false);
        Agencia.setEnabled(false);
        Banco.setEnabled(false);
        Saldo.setEnabled(false);
        Salvar.setEnabled(false);
        Editar.setEnabled(false);
        Excluir.setEnabled(false);
        Cancelar.setEnabled(false);
    }//GEN-LAST:event_CancelarActionPerformed

    private void TabContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabContaMouseClicked
        String banco =""+TabConta.getValueAt(TabConta.getSelectedRow(),1);
        conex.conexao();
        conex.executaSql("select *from contas where banco='"+banco+"'");
        try {
            conex.rs.first();
            Codigo.setText(String.valueOf(conex.rs.getInt("codigo")));
            Ccorrente.setText(String.valueOf(conex.rs.getInt("ccorrente")));
            Agencia.setText(String.valueOf(conex.rs.getInt("agencia")));
            Banco.setText(conex.rs.getString("banco"));
            Saldo.setText(String.valueOf(conex.rs.getInt("saldo")));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecionar os Dados"+ex);
        }
        
        
        conex.desconecta();
        Editar.setEnabled(true);
        Excluir.setEnabled(true);
    }//GEN-LAST:event_TabContaMouseClicked

    public void preencherTabelaC(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Codigo","Ccorrente","Agencia","Banco","Saldo"};
        conex.conexao();
        conex.executaSql(Sql);
        try{
            conex.rs.first();
            do{
                dados.add(new Object[]{conex.rs.getInt("codigo"),conex.rs.getInt("ccorrente"),conex.rs.getInt("agencia"),conex.rs.getString("banco"),conex.rs.getInt("saldo")});
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher ArrayList"+ex);
        }
        TabelaConta modelo = new TabelaConta(dados, colunas);
        
        TabConta.setModel(modelo);
        TabConta.getColumnModel().getColumn(0).setPreferredWidth(80);
        TabConta.getColumnModel().getColumn(0).setResizable(false);
        TabConta.getColumnModel().getColumn(1).setPreferredWidth(100);
        TabConta.getColumnModel().getColumn(1).setResizable(false);
        TabConta.getColumnModel().getColumn(2).setPreferredWidth(100);
        TabConta.getColumnModel().getColumn(2).setResizable(false); 
        TabConta.getColumnModel().getColumn(3).setPreferredWidth(300);
        TabConta.getColumnModel().getColumn(3).setResizable(false);            
        TabConta.getColumnModel().getColumn(4).setPreferredWidth(100);
        TabConta.getColumnModel().getColumn(4).setResizable(false);                        
        TabConta.getTableHeader().setReorderingAllowed(false);
        TabConta.setAutoResizeMode(TabConta.AUTO_RESIZE_OFF);
        TabConta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                
        conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agencia;
    private javax.swing.JTextField Banco;
    private javax.swing.JTextField Busca;
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField Ccorrente;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Listar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private javax.swing.JTextField Saldo;
    private javax.swing.JButton Salvar;
    private javax.swing.JTable TabConta;
    private javax.swing.JButton Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel pesquisa;
    // End of variables declaration//GEN-END:variables
}
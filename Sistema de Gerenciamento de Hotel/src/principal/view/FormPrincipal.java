/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.view;

import cliente.view.DialogPesquisarCliente;
import cliente.view.FormCadCliente;
import funcionario.view.DialogPesquisarFuncionario;
import funcionario.view.FormCadFuncionario;
import quarto.view.FormCadQuarto;
import quarto.view.FormPesquisaQuarto;
import reserva.view.FormCadReserva;
import reserva.view.FormPesquisaReserva;
import sobre.view.FormSobre;

/**
 *
 * @author TADS
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
        initComponents();
 //     setExtendedState(MAXIMIZED_BOTH);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMICadCliente = new javax.swing.JMenuItem();
        jMICadFuncionario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMICadQuarto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIPesCliente = new javax.swing.JMenuItem();
        jMIPesFuncionario = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMIPesQuarto = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formul??rio Principal do Sistema");
        setExtendedState(6);

        jMenu1.setMnemonic('C');
        jMenu1.setText("Cadastros");
        jMenu1.setToolTipText("Menu de cadastro do sistema");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMICadCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMICadCliente.setMnemonic('i');
        jMICadCliente.setText("Clientes");
        jMICadCliente.setToolTipText("Cadastro de clientes");
        jMICadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadCliente);

        jMICadFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMICadFuncionario.setMnemonic('u');
        jMICadFuncionario.setText("Funcion??rios");
        jMICadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadFuncionario);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('R');
        jMenuItem1.setText("Reservas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMICadQuarto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMICadQuarto.setMnemonic('Q');
        jMICadQuarto.setText("Quartos");
        jMICadQuarto.setToolTipText("Cadastro de quartos");
        jMICadQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadQuartoActionPerformed(evt);
            }
        });
        jMenu1.add(jMICadQuarto);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('S');
        jMenuItem2.setText("Sair");
        jMenuItem2.setToolTipText("Sair do sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('P');
        jMenu2.setText("Pesquisas");
        jMenu2.setToolTipText("Menu de pesquisa do sistema");

        jMIPesCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMIPesCliente.setMnemonic('l');
        jMIPesCliente.setText("Cliente");
        jMIPesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMIPesCliente);

        jMIPesFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMIPesFuncionario.setMnemonic('n');
        jMIPesFuncionario.setText("Funcion??rio");
        jMIPesFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(jMIPesFuncionario);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setMnemonic('e');
        jMenuItem4.setText("Reserva");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMIPesQuarto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMIPesQuarto.setMnemonic('t');
        jMIPesQuarto.setText("Quarto");
        jMIPesQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPesQuartoActionPerformed(evt);
            }
        });
        jMenu2.add(jMIPesQuarto);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('A');
        jMenu3.setText("Ajuda");
        jMenu3.setToolTipText("Menu de ajuda do sistema");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('o');
        jMenuItem3.setText("Sobre");
        jMenuItem3.setToolTipText("Tela sobre o sistema");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMICadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadClienteActionPerformed
          new FormCadCliente().setVisible(true);
    }//GEN-LAST:event_jMICadClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
          System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new FormSobre(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMIPesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesClienteActionPerformed
        new DialogPesquisarCliente(this, true).setVisible(true);
    }//GEN-LAST:event_jMIPesClienteActionPerformed

    private void jMIPesFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesFuncionarioActionPerformed
        new DialogPesquisarFuncionario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMIPesFuncionarioActionPerformed

    private void jMICadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadFuncionarioActionPerformed
        new FormCadFuncionario().setVisible(true);
    }//GEN-LAST:event_jMICadFuncionarioActionPerformed

    private void jMIPesQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPesQuartoActionPerformed
        new FormPesquisaQuarto(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMIPesQuartoActionPerformed

    private void jMICadQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadQuartoActionPerformed
        new FormCadQuarto(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMICadQuartoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new FormCadReserva().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new FormPesquisaReserva(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMICadCliente;
    private javax.swing.JMenuItem jMICadFuncionario;
    private javax.swing.JMenuItem jMICadQuarto;
    private javax.swing.JMenuItem jMIPesCliente;
    private javax.swing.JMenuItem jMIPesFuncionario;
    private javax.swing.JMenuItem jMIPesQuarto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

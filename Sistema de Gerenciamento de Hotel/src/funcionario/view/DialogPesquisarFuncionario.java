/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario.view;


import funcionario.bean.FuncionarioBean;
import funcionario.dao.FuncionarioDao;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author carlos
 */
public class DialogPesquisarFuncionario extends javax.swing.JDialog {
    private FuncionarioDao funcionarioDao;
    /**
     * Creates new form DialogPesquisarFuncionario
     */
    public DialogPesquisarFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        instanciaClasses();
        carregaTabelaFuncionario();
    }
    
    private void instanciaClasses() {
        //Padrão Singleton
        if (funcionarioDao == null) {
            funcionarioDao = new FuncionarioDao();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCBPesquisa = new javax.swing.JComboBox<>();
        jTFPesquisa = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBPesquisa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1100, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Funcionarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        jCBPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));
        jCBPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBPesquisaActionPerformed(evt);
            }
        });

        jTFPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFPesquisaKeyReleased(evt);
            }
        });

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBPesquisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCadastrar)
                    .addComponent(jBAlterar)
                    .addComponent(jBExcluir)
                    .addComponent(jBFechar))
                .addContainerGap())
        );

        jTBPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTBPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTBPesquisaMouseClicked(evt);
            }
        });
        jTBPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBPesquisaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTBPesquisaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTBPesquisa);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisa");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBPesquisaActionPerformed
        jTFPesquisa.grabFocus();
    }//GEN-LAST:event_jCBPesquisaActionPerformed

    private void jTBPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBPesquisaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP && jTBPesquisa.getSelectedRow() == 0) {
            jTFPesquisa.grabFocus();
        }
    }//GEN-LAST:event_jTBPesquisaKeyReleased

    private void jTBPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBPesquisaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            evt.consume();
            abreFormDependente();
        }
    }//GEN-LAST:event_jTBPesquisaKeyPressed

    private void jTBPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTBPesquisaMouseClicked
        int count = evt.getClickCount();
        if (count == 2) {
            abreFormDependente();
        }
    }//GEN-LAST:event_jTBPesquisaMouseClicked

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        excluir();
        jTFPesquisa.grabFocus();
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        dispose();
        alterarFuncionario();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        dispose();
        cadastrarFuncionario();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        fecharTela();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jTFPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesquisaKeyReleased
       jTFPesquisa.setText(jTFPesquisa.getText().toUpperCase());
        String dado = jTFPesquisa.getText();
        if (!dado.equals("")) {
            if (jCBPesquisa.getSelectedIndex() == 0) {
                populaTabelaFuncionario((ArrayList<FuncionarioBean>) funcionarioDao.pesquisarPorCodigo(new Integer(dado)));
            } else {
                populaTabelaFuncionario((ArrayList<FuncionarioBean>) funcionarioDao.pesquisarPorNome(dado));
            }
        } else {
            populaTabelaFuncionario((ArrayList<FuncionarioBean>) funcionarioDao.listar());
        }
        selecionaPrimeiraLinhaDaTabela();
    }//GEN-LAST:event_jTFPesquisaKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fecharTela();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(DialogPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogPesquisarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogPesquisarFuncionario dialog = new DialogPesquisarFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void cadastrarFuncionario() {
        FormCadFuncionario formCliente = new FormCadFuncionario();
        formCliente.setVisible(true);
    }

    private void alterarFuncionario() {
        FuncionarioBean funcionarioBean = pegaFuncionarioSelecionado();
        if (funcionarioBean != null) {
            FormCadFuncionario formCadFuncionario = new FormCadFuncionario(funcionarioBean);
            formCadFuncionario.setVisible(true);
        }
    }

    private FuncionarioBean pegaFuncionarioSelecionado() {
        if (verificarLinhaSelecionada()) {
            return (FuncionarioBean) (jTBPesquisa.getValueAt(jTBPesquisa.getSelectedRow(), -1));
        }
        return null;
    }
    
    private void populaTabelaFuncionario(ArrayList<FuncionarioBean> lista) {
        FuncionarioTableModel modeloFuncionario = new FuncionarioTableModel(lista);
        jTBPesquisa.setModel(modeloFuncionario);
        jTBPesquisa.getTableHeader().setFont(new Font("Ubuntu", 1, 12));
        definirTamanhoColunas();
        definirAlinhamentoColunas();
        selecionaPrimeiraLinhaDaTabela();
    }
    
    private void definirTamanhoColunas() {
        jTBPesquisa.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTBPesquisa.getColumnModel().getColumn(1).setPreferredWidth(130);
        jTBPesquisa.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTBPesquisa.getColumnModel().getColumn(3).setPreferredWidth(67);
        jTBPesquisa.getColumnModel().getColumn(4).setPreferredWidth(120);
        jTBPesquisa.getColumnModel().getColumn(5).setPreferredWidth(110);
        jTBPesquisa.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTBPesquisa.getColumnModel().getColumn(7).setPreferredWidth(170);
        jTBPesquisa.getColumnModel().getColumn(8).setPreferredWidth(60);
    }
    
    private void definirAlinhamentoColunas() {
        DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
        rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
        rendererDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
        rendererEsquerda.setHorizontalAlignment(SwingConstants.LEFT);

        jTBPesquisa.getColumnModel().getColumn(0).setCellRenderer(rendererCentro);
        jTBPesquisa.getColumnModel().getColumn(1).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(2).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(3).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(4).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(5).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(6).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(7).setCellRenderer(rendererEsquerda);
        jTBPesquisa.getColumnModel().getColumn(8).setCellRenderer(rendererEsquerda);
    }
    
    public void carregaTabelaFuncionario() {
        populaTabelaFuncionario((ArrayList<FuncionarioBean>) funcionarioDao.listar());
    }
    
    private void excluir() {
        if (verificarLinhaSelecionada()) {
            int[] linhas = jTBPesquisa.getSelectedRows();
            FuncionarioBean funcionarioBean;
            for (int i = 0; i < linhas.length; i++) {
                funcionarioBean = (FuncionarioBean) jTBPesquisa.getValueAt(linhas[i], -1);
                if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o funcionario " + funcionarioBean.getNome() + "?") == 0) {
                    if (excluirFuncionario(funcionarioBean)) {
                        JOptionPane.showMessageDialog(null, "Funcionario " + funcionarioBean.getNome() + " excluído com sucesso!");
                    }
                }
            }
            carregaTabelaFuncionario();
        }
    }

    private boolean excluirFuncionario(FuncionarioBean funcionarioBean) {
        return funcionarioDao.excluir(funcionarioBean.getCodigo());
    }

    private boolean verificarLinhaSelecionada() {
        int linhaSelecionada = jTBPesquisa.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um Funcionario!");
            return false;
        }
        return true;
    }

    private void fecharTela() {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o Formulário de Pesquisa de Funcionarios?") == 0) {
            dispose();
        }
    }
    
    private void selecionaPrimeiraLinhaDaTabela() {
        if (jTBPesquisa.getRowCount() > 0) {
            jTBPesquisa.getSelectionModel().setSelectionInterval(0, 0);
        }
    }
    
    private void setaFocoTabela() {
        if (jTBPesquisa.getRowCount() > 0) {
            jTBPesquisa.grabFocus();
        }
    }
    
    private void abreFormDependente() {
        alterarFuncionario();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JComboBox<String> jCBPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBPesquisa;
    private javax.swing.JTextField jTFPesquisa;
    // End of variables declaration//GEN-END:variables
}
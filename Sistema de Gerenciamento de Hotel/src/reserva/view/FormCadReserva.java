/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.view;

import cliente.bean.ClienteBean;
import cliente.dao.ClienteDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import quarto.bean.QuartoBean;
import quarto.dao.QuartoDao;
import reserva.bean.ReservaBean;
import reserva.dao.ReservaDao;
import util.DateUtil;
import util.FormatUtil;

/**
 *
 * @author carlos
 */
public class FormCadReserva extends javax.swing.JFrame {
    ReservaDao reservaDao = null;
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    DateUtil dateUtil = null;
    /**
     * Creates new form FormCadReserva
     */
    public FormCadReserva() {
        initComponents();
        setLocationRelativeTo(null);
        if(reservaDao==null)
            reservaDao = new ReservaDao();
    }

    FormCadReserva(ReservaBean reservaBean) {
        initComponents();
        setLocationRelativeTo(null);
        if(reservaDao==null)
            reservaDao = new ReservaDao();
        popularFormularioReserva(reservaBean);
    }
    
    public void popularFormularioReserva(ReservaBean reserva){
        jTFCodigo.setText(reserva.getCodigo().toString());
        jTFDataDeInicio.setText(FormatUtil.formataDataDeNascimento(reserva.getDataDeFim()));
        jTFDataDeFim.setText(FormatUtil.formataDataDeNascimento(reserva.getDataDeFim()));
        jTFCodCliente.setText(reserva.getCliente().getCodigo().toString());
        jTFCodQuarto.setText(reserva.getQuarto().getCodigo().toString());
    }
    
    public void popularFormularioReserva(ClienteBean cliente, QuartoBean quarto){
        jTFCodCliente.setText(cliente.getCodigo().toString());
        jTFCodQuarto.setText(quarto.getCodigo().toString());
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
        jLabel1 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFDataDeInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFDataDeFim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFCodCliente = new javax.swing.JTextField();
        jTFCodQuarto = new javax.swing.JTextField();
        jBInserir = new javax.swing.JButton();
        jBSelecionar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Cadastro de Reservas");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulário de Cadastro de Reserva"));

        jLabel1.setText("Código:");

        jTFCodigo.setEditable(false);
        jTFCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de Inicio:");

        jLabel3.setText("Data de Fim:");

        jTFDataDeFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDataDeFimActionPerformed(evt);
            }
        });

        jLabel4.setText("Código do Cliente:");

        jLabel5.setText("Código do Quarto:");

        jBInserir.setText("Inserir");
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBSelecionar.setText("Selecionar");
        jBSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarActionPerformed(evt);
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

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTFDataDeFim, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTFCodQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(jTFCodCliente, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(4, 4, 4)
                                    .addComponent(jTFDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(69, 69, 69))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(4, 4, 4)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBInserir)
                                .addGap(18, 18, 18)
                                .addComponent(jBSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBAlterar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBLimpar)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFDataDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFDataDeFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCodQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInserir)
                    .addComponent(jBSelecionar)
                    .addComponent(jBAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBLimpar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFDataDeFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDataDeFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDataDeFimActionPerformed

    private void jTFCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodigoActionPerformed

    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed
        ReservaBean reservaBean = new ReservaBean();
        dateUtil = new DateUtil();
        try {
            reservaBean.setDataDeInicio(dateUtil.converteDateParaCalendar(sdf2.parse(jTFDataDeInicio.getText())));
            reservaBean.setDataDeFim(dateUtil.converteDateParaCalendar(sdf2.parse(jTFDataDeFim.getText())));
        } catch (ParseException ex) {
            Logger.getLogger(FormCadReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        ClienteDao clienteDao = new ClienteDao();
        ClienteBean cliente = clienteDao.selecionar(Integer.parseInt(jTFCodCliente.getText()));
        if(cliente!=null)
            reservaBean.setCliente(cliente);
        else
            JOptionPane.showMessageDialog(null, "O código para cliente não é válido!");
        
        QuartoDao quartoDao = new QuartoDao();
        QuartoBean quarto = quartoDao.selecionar(Integer.parseInt(jTFCodQuarto.getText()));
        if(quarto!=null)
            reservaBean.setQuarto(quarto);
        else
            JOptionPane.showMessageDialog(null, "O código para quarto não é válido!");
        
        ReservaBean reserva = reservaDao.inserir(reservaBean);
        if(reserva!=null)
            JOptionPane.showMessageDialog(null, "Reserva Cadastrada com Sucesso!");
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarActionPerformed
        Integer codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do reserva:"));
        
        ReservaBean reservaBean = reservaDao.selecionar(codigo);
        if(reservaBean!=null){
            jTFCodigo.setText(reservaBean.getCodigo().toString());
            jTFDataDeInicio.setText(FormatUtil.formataDataDeNascimento(reservaBean.getDataDeFim()));
            jTFDataDeFim.setText(FormatUtil.formataDataDeNascimento(reservaBean.getDataDeFim()));
            jTFCodCliente.setText(reservaBean.getCliente().getCodigo().toString());
            jTFCodQuarto.setText(reservaBean.getQuarto().getCodigo().toString());
        }else{
            JOptionPane.showMessageDialog(null, "Registro Não Encontrado");
            limpar();
        }
        
    }//GEN-LAST:event_jBSelecionarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        if(!"".equals(jTFCodigo.getText())){
            ReservaBean reservaBean = new ReservaBean();
            dateUtil = new DateUtil();
            reservaBean.setCodigo(Integer.parseInt(jTFCodigo.getText()));
            try {
                reservaBean.setDataDeInicio(dateUtil.converteDateParaCalendar(sdf2.parse(jTFDataDeInicio.getText())));
                reservaBean.setDataDeFim(dateUtil.converteDateParaCalendar(sdf2.parse(jTFDataDeFim.getText())));
            } catch (ParseException ex) {
                Logger.getLogger(FormCadReserva.class.getName()).log(Level.SEVERE, null, ex);
            }
            ClienteDao clienteDao = new ClienteDao();
            ClienteBean cliente = clienteDao.selecionar(Integer.parseInt(jTFCodCliente.getText()));
            if(cliente!=null)
                reservaBean.setCliente(cliente);
            else
                JOptionPane.showMessageDialog(null, "O código para cliente não é válido!");

            QuartoDao quartoDao = new QuartoDao();
            QuartoBean quarto = quartoDao.selecionar(Integer.parseInt(jTFCodQuarto.getText()));
            if(quarto!=null)
                reservaBean.setQuarto(quarto);
            else
                JOptionPane.showMessageDialog(null, "O código para quarto não é válido!");

            ReservaBean reserva = reservaDao.alterar(reservaBean);
            if(reserva!=null)
                JOptionPane.showMessageDialog(null, "Reserva Alterado com Sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um código valido");
            limpar();
        }   
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        if(!"".equals(jTFCodigo.getText())){
            reservaDao.excluir(Integer.parseInt(jTFCodigo.getText()));
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um código valido");
            limpar();
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBSelecionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCodCliente;
    private javax.swing.JTextField jTFCodQuarto;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDataDeFim;
    private javax.swing.JTextField jTFDataDeInicio;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        jTFCodigo.setText("");
        jTFDataDeInicio.setText("");
        jTFDataDeFim.setText("");
        jTFCodCliente.setText("");
        jTFCodQuarto.setText("");
    }
}
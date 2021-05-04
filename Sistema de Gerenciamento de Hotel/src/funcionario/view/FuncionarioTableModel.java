/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionario.view;

import funcionario.bean.FuncionarioBean;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import util.FormatUtil;

/**
 *
 * @author carlos
 */
public class FuncionarioTableModel extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = {"Cód.", "Nome", "CPF", "Data de Nasc.", "Data de Cad.", "Email", "Telefone", "Endereço", "Salario"};

    public FuncionarioTableModel(ArrayList<FuncionarioBean> dados) {
        setLinhas(dados);
    }

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList<FuncionarioBean> getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    private void setLinhas(ArrayList<FuncionarioBean> list) {
        linhas = list;
    }

    //Retorna o numero de colunas no modelo
    //@see javax.swing.table.TableModel#getColumnCount()
    @Override
    public int getColumnCount() {
        return getColunas().length;
    }

    //Retorna o numero de linhas existentes no modelo
    //@see javax.swing.table.TableModel#getRowCount()
    @Override
    public int getRowCount() {
        return getLinhas().size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um cliente na tabela!");
        } else {
            FuncionarioBean funcionarioBean = (FuncionarioBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return funcionarioBean.getCodigo();
                    case 1:
                        return funcionarioBean.getNome();
                    case 2:
                        return funcionarioBean.getCpf();
                    case 3:
                        return FormatUtil.formataDataDeNascimento(funcionarioBean.getDataDeNascimento());
                    case 4:
                        return FormatUtil.formataDataDeCadastro(funcionarioBean.getDataDeCadastro());    
                    case 5:
                        return funcionarioBean.getEmail();
                    case 6:
                        return funcionarioBean.getTelefone();
                    case 7:
                        return funcionarioBean.getEndereco();
                    case 8:
                        return funcionarioBean.getSalario()+"R$";
                }
            } else if (columnIndex == -1) {
                return funcionarioBean;
            }
        }
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.view;

import cliente.bean.ClienteBean;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import util.FormatUtil;

/**
 *
 * @author carlos
 */
public class ClienteTableModel extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = {"Cód.", "Nome", "CPF", "Data de Nasc.", "Data de Cad.", "Email", "Telefone", "Endereço", "Gasto"};

    public ClienteTableModel(ArrayList<ClienteBean> dados) {
        setLinhas(dados);
    }

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList<ClienteBean> getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    private void setLinhas(ArrayList<ClienteBean> list) {
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
            ClienteBean clienteBean = (ClienteBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return clienteBean.getCodigo();
                    case 1:
                        return clienteBean.getNome();
                    case 2:
                        return clienteBean.getCpf();
                    case 3:
                        return FormatUtil.formataDataDeNascimento(clienteBean.getDataDeNascimento());
                    case 4:
                        return FormatUtil.formataDataDeCadastro(clienteBean.getDataDeCadastro());    
                    case 5:
                        return clienteBean.getEmail();
                    case 6:
                        return clienteBean.getTelefone();
                    case 7:
                        return clienteBean.getEndereco();
                    case 8:
                        return clienteBean.getGasto()+"R$";
                }
            } else if (columnIndex == -1) {
                return clienteBean;
            }
        }
        return null;
    }
    
}

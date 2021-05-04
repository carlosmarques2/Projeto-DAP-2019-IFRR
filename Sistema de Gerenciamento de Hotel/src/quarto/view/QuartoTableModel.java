/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import quarto.bean.QuartoBean;

/**
 *
 * @author carlos
 */
public class QuartoTableModel extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = {"Código", "Número do Quarto", "Tipo", "Disponibilidade"};

    public QuartoTableModel(ArrayList<QuartoBean> dados) {
        setLinhas(dados);
    }

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList<QuartoBean> getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    private void setLinhas(ArrayList<QuartoBean> list) {
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
            QuartoBean quartoBean = (QuartoBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return quartoBean.getCodigo();
                    case 1:
                        return quartoBean.getNumeroDoQuarto();
                    case 2:
                        return quartoBean.getTipo();
                    case 3:
                        if(quartoBean.getDisponibilidade())
                            return "Livre";
                        else
                            return "Ocupado";
                }
            } else if (columnIndex == -1) {
                return quartoBean;
            }
        }
        return null;
    }
    
}

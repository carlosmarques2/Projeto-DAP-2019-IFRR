/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import reserva.bean.ReservaBean;
import util.FormatUtil;

/**
 *
 * @author carlos
 */
public class ReservaTableModel extends AbstractTableModel {
    private ArrayList linhas = null;
    private String[] colunas = {"Código", "Data de Inicio", "Data de Fim", "Nome do Cliente", "Num do Quarto"};

    public ReservaTableModel(ArrayList<ReservaBean> dados) {
        setLinhas(dados);
    }

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList<ReservaBean> getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    private void setLinhas(ArrayList<ReservaBean> list) {
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
            JOptionPane.showMessageDialog(null, "Selecione um registro na tabela!");
        } else {
            ReservaBean reservaBean = (ReservaBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return reservaBean.getCodigo();
                    case 1:
                        return FormatUtil.formataDataDeNascimento(reservaBean.getDataDeInicio());
                    case 2:
                        return FormatUtil.formataDataDeNascimento(reservaBean.getDataDeFim());
                    case 3:
                        return reservaBean.getCliente().getNome();
                    case 4:
                        return reservaBean.getQuarto().getNumeroDoQuarto();
                }
            } else if (columnIndex == -1) {
                return reservaBean;
            }
        }
        return null;
    }
}

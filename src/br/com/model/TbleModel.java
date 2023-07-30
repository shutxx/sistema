/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author shuttxx
 */
public class TbleModel extends AbstractTableModel {

    private List<ModelAuxiliar> dados = new ArrayList<>();
    private String[] colunas = {"id", "produto", "quantidade", "valor", "valor total"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return dados.get(linha).getId();
            case 1:
                return dados.get(linha).getProduto();
            case 2:
                return dados.get(linha).getQuantidade();
            case 3:
                return dados.get(linha).getPreco();
            case 4:
                return dados.get(linha).getTotPreco();
        }
        return null;
    }

    public void addRow(ModelAuxiliar aux) {
        this.dados.add(aux);
        this.fireTableDataChanged();
       
    }

}

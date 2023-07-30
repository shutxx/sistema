/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.util;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author shuttxx
 */
public class Uteis {

    public void abrirFormulario(JInternalFrame janela, JDesktopPane desktop) {
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        janela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        desktop.add(janela);
        janela.setVisible(true);
    }

    public void abrirFormulario(JFrame janela, JDesktopPane desktop) {
        int lDesk = desktop.getWidth();
        int aDesk = desktop.getHeight();
        int lIFrame = janela.getWidth();
        int aIFrame = janela.getHeight();
        janela.setLocation(lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    public void limparCampos(JPanel obj) {
        Component comps[] = obj.getComponents();

        for (Component comp : comps) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");

            }
            if (comp instanceof JTextArea) {
                ((JTextArea) comp).setText("");

            }
            if (comp instanceof JFormattedTextField) {
                ((JFormattedTextField) comp).setText("");

            }
            if (comp instanceof JComboBox) {
                ((JComboBox) comp).setSelectedIndex(0);
            }
        }
    }

    public void limparCampos(JInternalFrame obj) {
        Component comps[] = obj.getComponents();

        for (Component comp : comps) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");

            }
            if (comp instanceof JTextArea) {
                ((JTextArea) comp).setText("");

            }
            if (comp instanceof JFormattedTextField) {
                ((JFormattedTextField) comp).setText("");

            }
            if (comp instanceof JComboBox) {
                ((JComboBox) comp).setSelectedIndex(0);
            }
        }

    }

    public void limparCampos(JFrame obj) {
        Component comps[] = obj.getComponents();

        for (Component comp : comps) {
            if (comp instanceof JTextField) {
                ((JTextField) comp).setText("");

            }
            if (comp instanceof JTextArea) {
                ((JTextArea) comp).setText("");

            }
            if (comp instanceof JFormattedTextField) {
                ((JFormattedTextField) comp).setText("");

            }
            if (comp instanceof JComboBox) {
                ((JComboBox) comp).setSelectedIndex(0);
            }
        }
    }

    public void limparCampos(JTextArea obj) {
        ((JTextArea) obj).setText("");
    }

    public static String removePontos(String source) {
        return source.replaceAll("\\.", "");
    }

    public void sair(JFrame frame) {
        if (JOptionPane.showConfirmDialog(frame,
                "Deseja realmente sair?",
                "Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void sair(JInternalFrame frame) {
        if (JOptionPane.showConfirmDialog(frame,
                "Deseja realmente sair?",
                "Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void sair(JPanel frame) {
        if (JOptionPane.showConfirmDialog(frame,
                "Deseja realmente sair?",
                "Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public String date() {
        Date dataAtual = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = sdf.format(dataAtual);
        return dataFormatada;
    }
}

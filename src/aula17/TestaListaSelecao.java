/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17;

import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class TestaListaSelecao {
    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Contatos");
        String[] itens = {"Ana","Joao","Bruna","Paulo","Maria"};
        DefaultListModel modelo = new DefaultListModel();
        JList lista = new JList(itens);
        JList selecao = new JList();
        selecao.setModel(modelo);
        modelo.addElement("Jose");
        lista.setVisibleRowCount(3);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(lista);
        
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotulo);
        painel.add(rolagem);
        painel.add(selecao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}

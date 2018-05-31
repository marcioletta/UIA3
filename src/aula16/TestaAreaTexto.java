/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula16;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestaAreaTexto {
    public static void main(String[] args) {
        JLabel rotuloObs = new JLabel("Observação");
        JTextArea campoObs = new JTextArea(5,30);
        campoObs.setLineWrap(true);
        campoObs.setWrapStyleWord(true);
        
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(campoObs);
        
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotuloObs);
        painel.add(rolagem);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(400,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
    }
}

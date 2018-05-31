/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestaCaixaVerificacao {

    public static void main(String[] args) {
        JLabel rotulo = new JLabel("Escolha os assuntos:");
        JCheckBox assuntoTodos = new JCheckBox("Todos");
        JCheckBox assuntoEconomia = new JCheckBox("Economia");
        JCheckBox assuntoEsporte = new JCheckBox("Esporte");
        JCheckBox assuntoLazer = new JCheckBox("Lazer");
        JCheckBox assuntoPolitica = new JCheckBox("Política");
        JCheckBox assuntoReligiao = new JCheckBox("Religião");
        JCheckBox assuntoTecnologia = new JCheckBox("Tecnologia");

        GridLayout leiaute = new GridLayout(10,5);
        JPanel painel = new JPanel();
        painel.setLayout(leiaute);
        
//        ButtonGroup grupo = new ButtonGroup();
//        
//        grupo.add(assuntoEconomia);
//        grupo.add(assuntoEsporte);
//        grupo.add(assuntoLazer);
//        grupo.add(assuntoPolitica);
//        grupo.add(assuntoReligiao);
//        grupo.add(assuntoTecnologia);

        assuntoTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                assuntoEconomia.setSelected(assuntoTodos.isSelected());
                assuntoEsporte.setSelected(assuntoTodos.isSelected());
                assuntoLazer.setSelected(assuntoTodos.isSelected());
                assuntoPolitica.setSelected(assuntoTodos.isSelected());
                assuntoReligiao.setSelected(assuntoTodos.isSelected());
                assuntoTecnologia.setSelected(assuntoTodos.isSelected());
            }
        });
        painel.add(assuntoTodos);
        painel.add(assuntoEconomia);
        painel.add(assuntoEsporte);
        painel.add(assuntoLazer);
        painel.add(assuntoPolitica);
        painel.add(assuntoReligiao);
        painel.add(assuntoTecnologia);
        
        JFrame janela = new JFrame();
        
        janela.add(rotulo, BorderLayout.NORTH);
        janela.add(painel,BorderLayout.CENTER);
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}

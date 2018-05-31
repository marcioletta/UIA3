/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 1714290044
 */
public class TestaMenu {

    public static void main(String[] args) {
        JMenuItem menuArquivoNovo = new JMenuItem("Novo");
        menuArquivoNovo.setMnemonic('N');
        menuArquivoNovo.setActionCommand("Criar arquivo");
        
        JMenuItem menuArquivoSalvar = new JMenuItem("Salvar");
        menuArquivoSalvar.setMnemonic('S');
        menuArquivoSalvar.setEnabled(false);
        menuArquivoSalvar.setActionCommand("Salvar arquivo");
        
        JMenuItem menuArquivoSair = new JMenuItem("Salvar");
        menuArquivoSair.setMnemonic('r');
        menuArquivoSair.setActionCommand("Fechar aplicação");
        
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        menuArquivo.add(menuArquivoNovo);
        menuArquivo.add(menuArquivoSalvar);
        menuArquivo.addSeparator();
        menuArquivo.add(menuArquivoSair);
        
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');
        
        JMenu menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('j');
        
        JMenuBar barraMenu = new JMenuBar();
        barraMenu.add(menuArquivo);
        barraMenu.add(menuEditar);
        barraMenu.add(menuAjuda);
        
        JFrame janela = new JFrame();
        menuArquivoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                janela.dispose();
            }
        });
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}

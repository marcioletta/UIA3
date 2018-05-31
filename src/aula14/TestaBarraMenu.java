/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class TestaBarraMenu {
    public static void main(String[] args) {
         JMenuBar barramenu =new JMenuBar();
    
    JFrame janela = new JFrame();
    janela.setJMenuBar(barramenu);
    janela.setSize(300,200);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setVisible(true);
    }
    
}

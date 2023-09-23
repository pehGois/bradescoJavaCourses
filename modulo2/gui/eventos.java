package gui;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventos extends JFrame implements ActionListener{
    public eventos(){

        super("Meu Frame");
        Container c = getContentPane();
        JButton botao = new JButton("Botão", null);
    
        c.add(BorderLayout.CENTER, botao);
        botao.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Você Clicou");
    }
    public static void main(String[] args) {
        new eventos();
    }
}

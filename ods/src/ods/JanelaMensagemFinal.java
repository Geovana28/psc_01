package ods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import ods.*;

public class JanelaMensagemFinal {
	
	 public static void mostrarJanelaMensagemFinal() {
	        JFrame janelaFinal = new JFrame("Obrigado!");
	        janelaFinal.setSize(400, 300);
	        janelaFinal.setLayout(null);
	        janelaFinal.setLocationRelativeTo(null);

	        JLabel labelMensagem = new JLabel("<html>Obrigado por aprender mais sobre reciclagem!<br>"
	                + "Cada pequena ação conta para um planeta mais limpo e sustentável.<br>"
	                + "Continue fazendo sua parte!</html>", SwingConstants.CENTER);
	        labelMensagem.setBounds(20, 50, 360, 100);
	        janelaFinal.add(labelMensagem);

	        JButton botaoFechar = new JButton("Fechar");
	        botaoFechar.setBounds(150, 200, 100, 30);
	        botaoFechar.setBackground(new Color(102, 205, 170));
		    botaoFechar.setForeground(Color.WHITE);
		    botaoFechar.setFont(new Font("Arial", Font.BOLD, 16));
	        botaoFechar.addActionListener(e -> janelaFinal.dispose());
	        janelaFinal.add(botaoFechar);

	        janelaFinal.setVisible(true);
	    }
}
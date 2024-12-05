package ods;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import ods.*;

public class MenuPrincipal {

	public static void mostrarJanelaPrincipal() {
	    JFrame janelaPrincipal = new JFrame("Reciclagem - Menu Principal");
	    janelaPrincipal.setSize(500, 400);
	    janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    janelaPrincipal.setLayout(null);
	    janelaPrincipal.setLocationRelativeTo(null);

	    JLabel mensagem = new JLabel("<html>Olá, bem-vindo! Obrigado por usar este programa.<br>"
	            + "Gostaria de saber mais sobre a reciclagem?</html>", SwingConstants.CENTER);
	    mensagem.setBounds(50, 20, 400, 50);
	    janelaPrincipal.add(mensagem);

	    JButton botaoReciclagem = new JButton("Informações sobre Reciclagem");
	    botaoReciclagem.setBounds(100, 100, 300, 30);
	    botaoReciclagem.setBackground(new Color(102, 205, 170)); 
        botaoReciclagem.setForeground(Color.WHITE); 
        botaoReciclagem.setFont(new Font("Arial", Font.BOLD, 16));
	    botaoReciclagem.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            InformacoesReciclagem recicla = new InformacoesReciclagem();
	            recicla.mostrarJanelaReciclagem();
	            janelaPrincipal.dispose(); 
	        }
	    });
	    janelaPrincipal.add(botaoReciclagem);

	    JButton botaoConsultaMaterial = new JButton("Consulta de Materiais");
	    botaoConsultaMaterial.setBounds(100, 160, 300, 30);
	    botaoConsultaMaterial.setBackground(new Color(102, 205, 170)); 
        botaoConsultaMaterial.setForeground(Color.WHITE); 
        botaoConsultaMaterial.setFont(new Font("Arial", Font.BOLD, 16));
	    botaoConsultaMaterial.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            ConsultaMaterial consulta = new ConsultaMaterial();
	            consulta.mostrarJanelaConsultaMaterial();
	            janelaPrincipal.dispose(); 
	        }
	    });
	    janelaPrincipal.add(botaoConsultaMaterial);

	    janelaPrincipal.setVisible(true);
	}
}
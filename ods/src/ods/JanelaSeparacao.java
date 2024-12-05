package ods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import ods.*;

public class JanelaSeparacao {
	
	public static void mostrarJanelaSeparacao() {
	    JFrame janelaSeparacao = new JFrame("Separação do Lixo e Coleta Seletiva");
	    janelaSeparacao.setSize(600, 700); 
	    janelaSeparacao.setLayout(null);
	    janelaSeparacao.setLocationRelativeTo(null);

	    JLabel labelTexto = new JLabel("<html>"
	            + "<h3>Separação do Lixo e Coleta Seletiva</h3>"
	            + "<p>A separação correta do lixo é fundamental para a reciclagem e a redução do impacto ambiental. As lixeiras coloridas são usadas para coletar materiais específicos:</p>"
	            + "<ul>"
	            + "  <li><strong>Azul:</strong> Papel e papelão.</li>"
	            + "  <li><strong>Amarelo:</strong> Metais.</li>"
	            + "  <li><strong>Vermelho:</strong> Plástico.</li>"
	            + "  <li><strong>Verde:</strong> Vidro.</li>"
	            + "  <li><strong>Marrom:</strong> Resíduos orgânicos.</li>"
	            + "  <li><strong>Cinza:</strong> Resíduos não recicláveis.</li>"
	            + "</ul>"
	            + "</html>");
	    labelTexto.setBounds(20, 20, 540, 180); 
	    janelaSeparacao.add(labelTexto);

	    String imagePath = "src/ods/images.png";
	    JLabel labelImagem = new JLabel(new ImageIcon(imagePath));
	    labelImagem.setBounds(20, 210, 540, 200);
	    janelaSeparacao.add(labelImagem);
	    
	    JLabel labelLegenda = new JLabel("<html>Imagem ilustrativa de lixeiras para coleta seletiva.<br>"
	            + "Cada cor representa um tipo de material a ser reciclado.</html>");
	    labelLegenda.setBounds(20, 420, 540, 50); 
	    labelLegenda.setFont(new Font("Arial", Font.ITALIC, 14));  
	    janelaSeparacao.add(labelLegenda);

	    JButton botaoProximo = new JButton("Próximo");
        botaoProximo.setBounds(100, 500, 150, 40); 
        botaoProximo.setBackground(new Color(102, 205, 170));
        botaoProximo.setForeground(Color.WHITE); 
        botaoProximo.setFont(new Font("Arial", Font.BOLD, 16));
        botaoProximo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                janelaSeparacao.dispose(); 
                JanelaEmpresas.mostrarJanelaEmpresas();
            }
        });
        janelaSeparacao.add(botaoProximo);

        JButton botaoQuiz = new JButton("Ir para Quiz");
        botaoQuiz.setBounds(320, 500, 180, 40); 
        botaoQuiz.setBackground(new Color(102, 205, 170));
        botaoQuiz.setForeground(Color.WHITE); 
        botaoQuiz.setFont(new Font("Arial", Font.BOLD, 16));
        botaoQuiz.addActionListener(new ActionListener() {
        	
            public void actionPerformed(ActionEvent e) {
                janelaSeparacao.dispose(); 
                JanelaEmpresas.mostrarJanelaQuiz(); 
            }
        });

        janelaSeparacao.add(botaoQuiz);

        janelaSeparacao.setVisible(true);        
    }
	

}
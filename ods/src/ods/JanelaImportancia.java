package ods;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import ods.*;

public class JanelaImportancia {
	
	public static void mostrarJanelaImportancia() {
	    JFrame janelaImportancia = new JFrame("Importância da Reciclagem e Problemas dos Aterros");
	    janelaImportancia.setSize(900, 700);
	    janelaImportancia.setLayout(null);
	    janelaImportancia.setLocationRelativeTo(null);

	    JLabel labelInfo = new JLabel("<html>"
	            + "<h3>A Importância da Gestão de Resíduos Sólidos</h3>"
	            + "<p>A forma como descartamos nossos resíduos sólidos impacta diretamente o meio ambiente e a saúde pública. "
	            + "Aterros e lixões, embora ambos sirvam para descarte de lixo, possuem diferenças significativas em termos de "
	            + "gestão e impacto ambiental. Entender essas diferenças é crucial para promover práticas mais sustentáveis.</p>"
	            +"<br>"
	            + "<p><strong>Lixões:</strong> Locais onde resíduos são descartados a céu aberto, sem tratamento ou controle. "
	            + "Essa prática poluidora gera gases do efeito estufa, contamina o solo e a água com chorume, além de atrair "
	            + "vetores de doenças.</p>"
	            +"<br>"
	            + "<p><strong>Aterros Sanitários:</strong> Instalações projetadas com técnicas de engenharia para minimizar "
	            + "os impactos ambientais. Utilizam impermeabilização do solo, sistemas de drenagem de chorume e cobertura diária "
	            + "para reduzir danos à saúde pública e ao meio ambiente.</p>"
	            + "<h4>Por que Reciclar?</h4>"
	            + "<p>Tanto aterros quanto lixões são soluções paliativas. A reciclagem é uma ferramenta poderosa para reduzir "
	            + "o lixo gerado, preservando recursos naturais e promovendo um futuro sustentável.</p>"
	            + "</html>");

	    labelInfo.setBounds(20, -70, 840, 400); 
	    janelaImportancia.add(labelInfo);

            String imagePath = "src/ods/CTRMacaubas1.jpg";
	    JLabel labelImagem = new JLabel(new ImageIcon(imagePath));
	    labelImagem.setBounds(20, 260, 600, 350);
	    janelaImportancia.add(labelImagem);
	    
	    JLabel labelLegenda = new JLabel("Imagem 1: Aterro Sanitário Macaúbas localizado em Sabará");
	    labelLegenda.setBounds(40, 610, 640, 30);  
	    labelLegenda.setFont(new Font("Arial", Font.ITALIC, 14));  
	    janelaImportancia.add(labelLegenda);

	    JButton botaoNext = new JButton("Próximo");
	    botaoNext.setBounds(720, 600, 100, 40); 
	    botaoNext.setBackground(new Color(102, 205, 170)); 
	    botaoNext.setForeground(Color.WHITE); 
	    botaoNext.setFont(new Font("Arial", Font.BOLD, 16)); 
	    botaoNext.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            janelaImportancia.dispose(); 
	            JanelaSeparacao.mostrarJanelaSeparacao(); 
	        }
	    });
        janelaImportancia.add(botaoNext);

        janelaImportancia.setVisible(true);
    }

}
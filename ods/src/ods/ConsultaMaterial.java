package ods;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import ods.*;

public class ConsultaMaterial {

    public static void mostrarJanelaConsultaMaterial() {
        JFrame janelaConsulta = new JFrame("Consulta de Materiais");
        janelaConsulta.setSize(400, 300);
        janelaConsulta.setLayout(null);
        janelaConsulta.setLocationRelativeTo(null);

        JLabel labelPrompt = new JLabel("Digite o material:");
        labelPrompt.setBounds(20, 20, 150, 30);
        janelaConsulta.add(labelPrompt);

        JTextField campoMaterial = new JTextField();
        campoMaterial.setBounds(20, 60, 200, 30);
        janelaConsulta.add(campoMaterial);

        JButton botaoConsultar = new JButton("Consultar");
        botaoConsultar.setBounds(230, 60, 100, 30);
        botaoConsultar.addActionListener(e -> {
            String material = campoMaterial.getText();
            String info = obterInformacoes(material);
            JOptionPane.showMessageDialog(janelaConsulta, info);
        });
        janelaConsulta.add(botaoConsultar);

        JButton botaoFinalizar = new JButton("Finalizar");
        botaoFinalizar.setBounds(150, 200, 100, 30);
        botaoFinalizar.setBackground(new Color(102, 205, 170)); 
        botaoFinalizar.setForeground(Color.WHITE); 
        botaoFinalizar.setFont(new Font("Arial", Font.BOLD, 16));
        botaoFinalizar.addActionListener(e -> {
            janelaConsulta.dispose();
            JanelaMensagemFinal.mostrarJanelaMensagemFinal(); 
        });
        janelaConsulta.add(botaoFinalizar);

        janelaConsulta.setVisible(true);
    }

    public static String obterInformacoes(String material) {
        material = material.trim().toLowerCase();

        switch (material) {
        case "papel":
            return "O papel, seja ele de jornal, revista, caixa de papelão ou folha de caderno, "
                    + "pode ganhar uma nova vida!\n "
                    + "Ao ser reciclado, ele se transforma em diversos produtos, "
                    + "como papel higiênico, embalagens de papelão e até mesmo novos papéis para escrita e impressão.\n"
                    + "Ao reciclar o papel, você ajuda a preservar as árvores, economiza água e energia, "
                    + "e reduz a quantidade de lixo nos aterros sanitários.\n";

        case "plastico":
            return "O plástico é um material versátil e presente em diversos produtos do nosso dia a dia. "
                    + "Ao reciclar o plástico, ele pode ser transformado em novos produtos, como garrafas, "
                    + "embalagens e até mesmo roupas.\n";

        case "garrafa pet":
            return "As garrafas PET são um dos plásticos mais reciclados no mundo. "
                    + "Após a coleta seletiva, elas são transformadas em fibras têxteis (como poliéster), "
                    + "embalagens para produtos de limpeza e até mesmo tapetes.\n";

        case "vidro":
            return "O vidro é um material 100% reciclável e pode ser reutilizado infinitas vezes. Após a coleta seletiva, "
                    + "as garrafas e potes de vidro são levados para as indústrias de reciclagem, "
                    + "onde são derretidos e transformados em novos produtos de vidro.\n";

        case "lixo eletronico":
            return "O lixo eletrônico, como computadores, celulares e televisores, "
                    + "contém diversos materiais valiosos que podem ser recuperados e reutilizados. "
                    + "Ao descartar corretamente seus eletrônicos, você evita a contaminação do solo e da água.\n";

        case "latinha":
            return "As latinhas de alumínio são campeãs da reciclagem! "
                    + "Elas podem ser recicladas infinitas vezes sem perder suas propriedades, "
                    + "e se transformam em novas latinhas, embalagens e outros produtos de alumínio.\n"
                    + "E gasta apenas 5% de energia do que seria necessário para fabricar uma nova.\n";

        case "lixo organico":
            return "O lixo orgânico, como restos de alimentos, cascas de frutas e legumes, pode ser transformado em adubo orgânico, "
                    + "uma excelente opção para fertilizar plantas e hortas.\n"
                    + "A compostagem é um processo simples e eficaz para transformar o lixo orgânico em adubo. "
                    + "Além de reduzir a quantidade de lixo enviado para os aterros, a compostagem enriquece o solo e promove um ciclo natural de nutrientes.\n";

        case "papelao":
            return "O papelão, assim como o lixo orgânico, pode ser reciclado e reaproveitado, "
                    + "sendo transformado em novos produtos, como embalagens ou papel reciclado.\n"
                    + "Ao reciclar papelão, você ajuda a reduzir o impacto ambiental e a quantidade de lixo nos aterros.\n";

        case "baterias":
            return "As baterias contêm metais pesados que podem contaminar o solo e a água se descartadas incorretamente. "
                    + "A reciclagem das baterias é essencial para evitar esses problemas.\n";

        case "oleo de cozinha":
            return "O óleo de cozinha usado não deve ser jogado no ralo, pois ele contamina a água e os encanamentos. "
                    + "O óleo pode ser levado a pontos de coleta para ser transformado em biodiesel.\n";

        case "remedios":
        case "medicamentos":
            return "Os medicamentos vencidos devem ser descartados em locais específicos, "
                    + "pois podem contaminar o meio ambiente e causar danos à saúde.\n";

        case "papel higienico":
        case "fraldas":
        case "guardanapo":
        case "papel toalha":
            return "No processo de reciclagem do papel, as folhas são trituradas, transformadas em polpa e moldadas em novos produtos. "
                    + "Mas se, nessa polpa, houver restos de comida, bactérias ou outros tipos de sujeira,\n "
                    + "isso pode contaminar todo o lote e comprometer a qualidade do papel produzido.\n"
                    + "Por isso, esse tipo de material, após ser usado, não pode ser reciclado.\n";

        case "porcelana":
        case "ceramica":
            return "A cerâmica e a porcelana, devido às suas características e ao processo de fabricação, "
                    + "são materiais de difícil reciclagem.\n "
                    + "Atualmente, a melhor forma de lidar com esses materiais é através da redução do consumo, "
                    + "da reutilização e da disposição em aterros sanitários.\n";

        case "vidro temperado":
            return "O vidro temperado passa por um tratamento térmico especial que o torna significativamente mais resistente a impactos e choques térmicos. "
                    + "Esse processo envolve aquecer o vidro a temperaturas extremamente altas e resfriá-lo rapidamente. "
                    + "Embora essa técnica aumente a durabilidade do vidro, ela também altera sua estrutura molecular de forma irreversível.\n";

        case "espelho":
            return "A característica distintiva dos espelhos é a presença de uma camada reflexiva em sua superfície posterior.\n "
                    + "Essa camada, geralmente composta por metais como alumínio ou prata, é responsável por refletir a luz e criar a imagem. "
                    + "A adesão dessa camada ao vidro é muito forte e sua remoção é um processo complexo e custoso.\n";

        case "roupas":
            return "As roupas, em geral, podem ser recicladas e transformadas em novos tecidos, como fibras têxteis para a produção de novas peças de vestuário.\n"
                    + "Além disso, roupas antigas podem ser doadas ou reutilizadas para reduzir o impacto ambiental e a demanda por novos recursos.\n"
                    + "Reciclar roupas ajuda a diminuir o desperdício e contribui para a economia circular, onde os produtos podem ser reaproveitados e transformados em novos itens.\n";

        case "sapatos":
            return "Sapatos usados podem ser reciclados e transformados em novos materiais, como pisos de borracha, ou até mesmo reutilizados para a fabricação de novos produtos, "
                    + "\ncomo bolsas ou sandálias. A reciclagem de calçados ajuda a diminuir o desperdício e o impacto ambiental dos resíduos de moda, "
                    + "\npermitindo que eles ganhem uma nova vida em outros itens úteis.\n";
            		
            default:
                return "Material não encontrado. Por favor, insira um material válido.";
        }
    }
    
    public static void mostrarJanelaMensagemFinal() {

        InformacoesReciclagem.mostrarJanelaMensagemFinal();
    }
}
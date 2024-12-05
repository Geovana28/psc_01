package ods;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class QuizReciclagem {

    public static void mostrarJanelaQuiz() {
        mostrarPergunta1(); 
    }

    private static void mostrarPergunta1() {
        JFrame janela = new JFrame("Pergunta 1");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel pergunta = new JLabel("Qual cor representa o lixo reciclável de papel?", SwingConstants.CENTER);
        pergunta.setBounds(20, 20, 360, 50);
        janela.add(pergunta);

        JButton opcao1 = new JButton("Azul");
        JButton opcao2 = new JButton("Verde");
        JButton opcao3 = new JButton("Amarelo");

        configurarBotao(opcao1);
        configurarBotao(opcao2);
        configurarBotao(opcao3);

        opcao1.setBounds(50, 80, 300, 40);
        opcao2.setBounds(50, 130, 300, 40);
        opcao3.setBounds(50, 180, 300, 40);

        opcao1.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Correto!");
            janela.dispose();
            mostrarPergunta2();
        });

        opcao2.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));
        opcao3.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));

        janela.add(opcao1);
        janela.add(opcao2);
        janela.add(opcao3);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static void mostrarPergunta2() {
        JFrame janela = new JFrame("Pergunta 2");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel pergunta = new JLabel("Qual desses materiais deve ser descartado no lixo orgânico?", SwingConstants.CENTER);
        pergunta.setBounds(20, 20, 360, 50);
        janela.add(pergunta);

        JButton opcao1 = new JButton("Vidro");
        JButton opcao2 = new JButton("Plástico");
        JButton opcao3 = new JButton("Restos de comida");

        configurarBotao(opcao1);
        configurarBotao(opcao2);
        configurarBotao(opcao3);

        opcao1.setBounds(50, 80, 300, 40);
        opcao2.setBounds(50, 130, 300, 40);
        opcao3.setBounds(50, 180, 300, 40);

        opcao1.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));
        opcao2.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));
        opcao3.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Correto!");
            janela.dispose();
            mostrarPergunta3(); 
        });

        janela.add(opcao1);
        janela.add(opcao2);
        janela.add(opcao3);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static void mostrarPergunta3() {
        JFrame janela = new JFrame("Pergunta 3");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        JLabel pergunta = new JLabel("As latinhas de alumínio podem ser recicladas?", SwingConstants.CENTER);
        pergunta.setBounds(20, 20, 360, 50);
        janela.add(pergunta);

        JButton opcao1 = new JButton("Sim");
        JButton opcao2 = new JButton("Não");
        JButton opcao3 = new JButton("Somente se estiverem limpas");

        configurarBotao(opcao1);
        configurarBotao(opcao2);
        configurarBotao(opcao3);

        opcao1.setBounds(50, 80, 300, 40);
        opcao2.setBounds(50, 130, 300, 40);
        opcao3.setBounds(50, 180, 300, 40);

        opcao1.addActionListener(e -> {
            JOptionPane.showMessageDialog(janela, "Correto!");
            janela.dispose();
            finalizarQuiz(); 
        });

        opcao2.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));
        opcao3.addActionListener(e -> JOptionPane.showMessageDialog(janela, "Incorreto. Tente novamente!"));

        janela.add(opcao1);
        janela.add(opcao2);
        janela.add(opcao3);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static void configurarBotao(JButton botao) {
        botao.setBackground(new Color(102, 205, 170));
        botao.setForeground(Color.WHITE);
        botao.setFont(new Font("Arial", Font.BOLD, 16));
    }


    private static void finalizarQuiz() {
        JOptionPane.showMessageDialog(null, "Quiz finalizado! Obrigado por participar.");
        ConsultaMaterial consultaMaterial = new ConsultaMaterial();
        consultaMaterial.mostrarJanelaConsultaMaterial();
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora1a {
    public static void main(String[] args) {
        // Cria a janela (frame)
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLayout(new FlowLayout());

        // Cria os componentes da interface
        JTextField num1Field = new JTextField(10);  // Campo para o primeiro número
        JTextField num2Field = new JTextField(10);  // Campo para o segundo número
        JTextField resultadoField = new JTextField(10);  // Campo para exibir o resultado
        resultadoField.setEditable(false);  // Não permite edição no campo de resultado

        JButton somaButton = new JButton("Soma");
        JButton subButton = new JButton("Subtração");
        JButton mulButton = new JButton("Multiplicação");
        JButton divButton = new JButton("Divisão");
        JButton sairButton = new JButton("Sair");

        // Adiciona os componentes ao frame
        frame.add(new JLabel("Primeiro número:"));
        frame.add(num1Field);
        frame.add(new JLabel("Segundo número:"));
        frame.add(num2Field);
        frame.add(new JLabel("Resultado:"));
        frame.add(resultadoField);

        frame.add(somaButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);
        frame.add(sairButton);

        // Define o que acontece quando o botão Soma é pressionado
        somaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double resultado = num1 + num2;
                    resultadoField.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Entrada inválida");
                }
            }
        });

        // Define o que acontece quando o botão Subtração é pressionado
        subButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double resultado = num1 - num2;
                    resultadoField.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Entrada inválida");
                }
            }
        });

        // Define o que acontece quando o botão Multiplicação é pressionado
        mulButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double resultado = num1 * num2;
                    resultadoField.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Entrada inválida");
                }
            }
        });

        // Define o que acontece quando o botão Divisão é pressionado
        divButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    if (num2 != 0) {
                        double resultado = num1 / num2;
                        resultadoField.setText(String.valueOf(resultado));
                    } else {
                        resultadoField.setText("Erro: Divisão por zero");
                    }
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Entrada inválida");
                }
            }
        });

        // Define o que acontece quando o botão Sair é pressionado
        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Encerra o programa
            }
        });

        // Tornar a janela visível
        frame.setVisible(true);
    }
}

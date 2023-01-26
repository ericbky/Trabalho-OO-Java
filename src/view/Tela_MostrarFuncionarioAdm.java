package view;

import javax.swing.*;

public class Tela_MostrarFuncionarioAdm extends JFrame {
    private JPanel Tela_MostrarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public Tela_MostrarFuncionarioAdm() {
        setContentPane(Tela_MostrarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        Tela_MostrarFuncionarioAdm telaFunc = new Tela_MostrarFuncionarioAdm();
    }
}

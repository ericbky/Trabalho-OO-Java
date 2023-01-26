package view;

import javax.swing.*;

public class Tela_CadastrarFuncionarioAdm extends JFrame {

    private JPanel Tela_CadastrarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloTela;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton cadastroBtn;

    public Tela_CadastrarFuncionarioAdm() {
        setContentPane(Tela_CadastrarFuncionarioAdm);
        setTitle("Cadastro de Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        view.Tela_CadastrarFuncionarioAdm telaFunc = new Tela_CadastrarFuncionarioAdm();
    }
}

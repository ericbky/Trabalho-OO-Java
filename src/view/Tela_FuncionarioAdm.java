package view;

import javax.swing.*;

public class Tela_FuncionarioAdm extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JLabel txtOpcao2;
    private JButton cadastroBtn;
    private JButton escolherButton;
    private JComboBox boxEscolhaFunc;
    private JLabel tituloMenu;
    private JPanel Tela_FuncionarioAdm;

    public Tela_FuncionarioAdm() {
        setContentPane(Tela_FuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        view.Tela_FuncionarioAdm telaFunc = new Tela_FuncionarioAdm();
    }


}
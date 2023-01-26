package view;

import javax.swing.*;

public class Tela_EditarFuncionarioAdm extends JFrame {
    private JPanel Tela_EditarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton editarFuncionárioButton;
    private JButton excluirFuncionárioButton;

    public Tela_EditarFuncionarioAdm() {
        setContentPane(Tela_EditarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}

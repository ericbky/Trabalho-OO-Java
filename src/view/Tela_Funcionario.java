package view;

import javax.swing.*;

public class Tela_Funcionario extends JFrame {
    private JLabel tituloView;
    private JLabel tituloNome;
    private JLabel tituloCargo;
    private JButton cadastroBTN;
    private JButton listarBTN;
    private JButton editarBTN;
    private JButton excluirBTN;
    private JTextField nomeFunc;
    private JTextField cargoFunc;
    private JPanel Tela_Funcionario;

    public Tela_Funcionario () {
        setContentPane(Tela_Funcionario);
        setTitle("Funcionário");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Tela_Funcionario  telaFunc = new Tela_Funcionario();
    }

}


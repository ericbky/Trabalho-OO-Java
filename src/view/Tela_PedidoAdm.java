package view;

import javax.swing.*;

public class Tela_PedidoAdm extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JLabel txtOpcao2;
    private JButton cadastroBtn;
    private JButton escolherButton;
    private JComboBox boxEscolhaFunc;
    private JLabel tituloMenu;
    private JPanel Tela_PedidoAdm;

    public Tela_PedidoAdm() {
        setContentPane(Tela_PedidoAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        view.Tela_PedidoAdm telaFunc = new Tela_PedidoAdm();
    }


}
package view;

import javax.swing.*;

public class Tela_EditarPedidoAdm extends JFrame {
    private JPanel Tela_EditarPedidoAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton editarPedidoButton;
    private JButton excluirPedidoButton;

    public Tela_EditarPedidoAdm() {
        setContentPane(Tela_EditarPedidoAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        view.Tela_EditarPedidoAdm telaFunc = new Tela_EditarPedidoAdm();
    }
}

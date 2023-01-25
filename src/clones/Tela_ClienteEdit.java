package view;

import javax.swing.*;

public class Tela_ClienteEdit extends JFrame {
    private JTextField text_cnpj;
    private JTextField text_nome_fantasia;
    private JTextField text_inscricao_estadual;
    private JTextField text_inicio_contrato;
    private JTextField text_fim_contrato;
    private JComboBox listaPedidos;
    private JPanel Tela_Cliente;
    private JTextField text_razao_social;
    private JButton editarClienteButton;
    private JButton salvarAlteraçõesButton;
    private JButton voltarButton;

    public Tela_ClienteEdit() {
        setContentPane(Tela_Cliente);
        setTitle("Cliente");
        setSize(640, 625);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        Tela_ClienteEdit tela_cliente = new Tela_ClienteEdit();

    }

}

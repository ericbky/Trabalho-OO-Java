package view;

import controller.PedidoController;

import javax.swing.*;
import java.text.ParseException;

public class Tela_exibirPedido extends JFrame {
    private JPanel Tela_MostrarPedidoAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField tex_numSerie;
    private JTextField text_DataP;
    private JTextField text_qntRoupa;
    private JTextField text_Status;
    private JTextField text_tLavagem;
    private JButton editarPedidoButton;
    private JButton excluirPedidoButton;
    private JTextField text_cnpj;
    private JLabel text_cnp;

    public Tela_exibirPedido() {
        setContentPane(Tela_MostrarPedidoAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void exibirPedido(String pedido) {
        PedidoController pedidoController = new PedidoController();

        String[] vPedido;

        vPedido = pedidoController.exibirDadosPedido(pedido);

        tex_numSerie.setText(vPedido[0]);
        text_DataP.setText(vPedido[1]);
        text_qntRoupa.setText(vPedido[2]);
        text_Status.setText(vPedido[3]);
        text_tLavagem.setText(vPedido[4]);
        text_cnpj.setText(vPedido[5]);

        voltarBtn.addActionListener(e -> {
            setContentPane(Tela_MostrarPedidoAdm);
            setVisible(false);
            try {
                Tela_listarPedido tela_pedido = new Tela_listarPedido();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });

        editarPedidoButton.addActionListener(e -> {
            setContentPane(Tela_MostrarPedidoAdm);
            setVisible(false);
            Tela_EditarPedido tela_editarPedido = new Tela_EditarPedido();
            tela_editarPedido.exibirPedido(pedido);
        });

        excluirPedidoButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso!");
            setContentPane(Tela_MostrarPedidoAdm);
            setVisible(false);
            pedidoController.excluirPedido(pedido);
            try {
                Tela_listarPedido tela_pedido = new Tela_listarPedido();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}

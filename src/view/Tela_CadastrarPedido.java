package view;

import controller.PedidoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_CadastrarPedido extends JFrame {
    private JPanel Tela_CadastrarPedido;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField text_numero;
    private JTextField text_dataPedido;
    private JTextField text_qntRoupa;
    private JTextField text_status;
    private JTextField text_tipoLavagem;
    private JButton cadastrarPedidoButton;
    private JTextField text_cnpjCliente;

    public Tela_CadastrarPedido() {
        setContentPane(Tela_CadastrarPedido);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_CadastrarPedido);
                setVisible(false);
                try {
                    Tela_listarPedido tela_listarPedido = new Tela_listarPedido();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cadastrarPedidoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PedidoController pedidoController = new PedidoController();
                String[] dadosPedidoCad = new String[9];
                int qnt;

                dadosPedidoCad[0] = text_numero.getText();
                dadosPedidoCad[1] = text_dataPedido.getText();
                qnt = Integer.parseInt(text_qntRoupa.getText());
                dadosPedidoCad[2] = text_status.getText();
                dadosPedidoCad[3] = text_tipoLavagem.getText();
                dadosPedidoCad[4] = text_cnpjCliente.getText();

                if ((dadosPedidoCad[0].length() < 6) ||
                        (dadosPedidoCad[2].length() < 10) ||
                        (dadosPedidoCad[3].length() < 10) ||
                        (qnt < 2) ||
                        (dadosPedidoCad[4].length() < 3) ) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    if(pedidoController.procurarCliente(dadosPedidoCad[4])){
                    if (pedidoController.cadastrarPedido(dadosPedidoCad, qnt)) {
                        JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
                        setContentPane(Tela_CadastrarPedido);
                        setVisible(false);
                        try {
                            Tela_listarPedido tela_listarPedido = new Tela_listarPedido();
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }
                    }}
                }
            }
        });
    }


}

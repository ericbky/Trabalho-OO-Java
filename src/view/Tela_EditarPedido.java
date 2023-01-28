package view;

import controller.FuncionarioController;
import controller.PedidoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_EditarPedido extends JFrame {
    private JPanel Tela_EditarPedido;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField text_numS;
    private JTextField text_data;
    private JTextField text_qntRoupa;
    private JTextField text_status;
    private JTextField text_tipo;
    private JTextField text_cnpj;
    private JButton editarPedidoButton;

    public Tela_EditarPedido() {
        setContentPane(Tela_EditarPedido);
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

        text_numS.setText(vPedido[0]);
        text_data.setText(vPedido[1]);
        text_qntRoupa.setText(vPedido[2]);
        text_status.setText(vPedido[3]);
        text_tipo.setText(vPedido[4]);
        text_cnpj.setText(vPedido[5]);

        voltarBtn.addActionListener(e -> {
            setContentPane(Tela_EditarPedido);
            setVisible(false);
            try {
                Tela_listarPedido tela_pedido = new Tela_listarPedido();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });

        editarPedidoButton.addActionListener(e -> {

            //ARMAZENANDO OS DADOS DE ENTRADA
            FuncionarioController funcionarioController = new FuncionarioController();
            String[] dadosPedidoEdit = new String[7];

            dadosPedidoEdit[0] = text_numS.getText();
            dadosPedidoEdit[1] = text_data.getText();
            dadosPedidoEdit[2] = text_qntRoupa.getText();
            dadosPedidoEdit[3] = text_status.getText();
            dadosPedidoEdit[4] = text_tipo.getText();
            dadosPedidoEdit[5] = text_cnpj.getText();

            if ((dadosPedidoEdit[0].length() < 4) || (dadosPedidoEdit[1].length() < 8) ||
                    (dadosPedidoEdit[2].length() < 1) || (dadosPedidoEdit[3].length() < 4) ||
                    (dadosPedidoEdit[4].length() < 4) || (dadosPedidoEdit[5].length() < 8)) {
                JOptionPane.showMessageDialog(null, "Digite dados válidos!");
            } else {
             if(PedidoController.editarPedido(dadosPedidoEdit)){
                 JOptionPane.showMessageDialog(null, "Pedido editado com sucesso!!");
                 setContentPane(Tela_EditarPedido);
                 setVisible(false);
                 try {
                     Tela_listarPedido tela_listarPedido = new Tela_listarPedido();
                 } catch (ParseException ex) {
                     throw new RuntimeException(ex);
                 }
             }
            }
        });

        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_EditarPedido);
                setVisible(false);
            }
        });

    }
}


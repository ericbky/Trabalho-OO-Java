package view;

import controller.PedidoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_listarPedido extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JLabel txtOpcao2;
    private JButton cadastroBtn;
    private JButton escolherButton;
    private JComboBox<String> boxEscolhaPed;
    private JLabel tituloMenu;
    private JPanel Tela_listarPedido;

    PedidoController pedidoController = new PedidoController();

    public Tela_listarPedido() throws ParseException {
        setContentPane(Tela_listarPedido);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarComboBox();

        sairBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_listarPedido);
                setVisible(false);
                Tela_MenuFuncionario tela_funcionario = new Tela_MenuFuncionario();
            }
        });

        escolherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pedido;
                pedido = boxEscolhaPed.getSelectedItem() + "";
                //Fechando a tela ADM, chamando a tela de exibir cliente e passando como parâmetro o cliente
                setContentPane(Tela_listarPedido);
                setVisible(false);
                Tela_exibirPedido tela_exibirPedido = new Tela_exibirPedido();

                tela_exibirPedido.exibirPedido(pedido);
            }
        });

        cadastroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_listarPedido);
                setVisible(false);
                try {
                    Tela_CadastrarPedido tela_cadastrarPedido = new Tela_CadastrarPedido();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void chamarComboBox() throws ParseException {
        String[] numeroSerie;
        int tamanhoPedidos;
        int cont;

        //Pegando as razões sociais do banco de dados
        numeroSerie = pedidoController.exibirPedidosCB();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoPedidos = pedidoController.tamanhoPedidos();

        //Listando
        for (cont = 0; cont < tamanhoPedidos; cont++) {
            boxEscolhaPed.addItem(numeroSerie[cont]);
        }
    }
}
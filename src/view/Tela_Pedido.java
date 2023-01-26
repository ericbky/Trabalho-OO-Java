package view;

import controller.PedidoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_Pedido extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JLabel txtOpcao2;
    private JButton cadastroBtn;
    private JButton escolherButton;
    private JComboBox boxEscolhaPed;
    private JLabel tituloMenu;
    private JPanel Tela_PedidoAdm;

    PedidoController pedidoController = new PedidoController();

    public Tela_Pedido() throws ParseException {
        setContentPane(Tela_PedidoAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarComboBox();

        sairBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_PedidoAdm);
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
                setContentPane(Tela_PedidoAdm);
                setVisible(false);
                try {
                    Tela_Pedido pedido1 = new Tela_Pedido();
                    //tela.exibirCliente(cliente);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }

    public void chamarComboBox() throws ParseException {
        String numeroSerie[];
        int tamanhoPedidos;
        int cont;

        //Pegando as razões sociais do banco de dados
        numeroSerie = pedidoController.exibirPedidos();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoPedidos = pedidoController.tamanhoPedidos();

        //Listando
        for (cont = 0; cont < tamanhoPedidos; cont++) {
            boxEscolhaPed.addItem(numeroSerie[cont]);
        }
    }
}
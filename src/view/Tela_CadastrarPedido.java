package view;

import controller.ClienteController;
import controller.PedidoController;

import javax.swing.*;
import java.awt.event.*;
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
    private JComboBox<String> comboBoxCliente;
    private JTextField text_cnpjCliente;

    public Tela_CadastrarPedido() throws ParseException {
        this.setIconImage (new javax.swing.ImageIcon(getClass().getResource("/view/Ícones/pedido.png")).getImage());
        setContentPane(Tela_CadastrarPedido);
        setTitle("Cadastro de Pedido");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarComboBoxCliente();

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
                dadosPedidoCad[2] = text_qntRoupa.getText();
                dadosPedidoCad[3] = text_status.getText();
                dadosPedidoCad[4] = text_tipoLavagem.getText();
                dadosPedidoCad[5] = comboBoxCliente.getSelectedItem() + "";


                if (dadosPedidoCad[4].length() < 3 || (dadosPedidoCad[0].length() < 6) || (dadosPedidoCad[2].length() < 5)
                        || (dadosPedidoCad[3].length()) < 5 || (dadosPedidoCad[4].length() < 5) || (dadosPedidoCad[5].length() < 5)) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    if (pedidoController.cadastrarPedido(dadosPedidoCad)) {
                        JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
                        setContentPane(Tela_CadastrarPedido);
                        setVisible(false);
                        try {
                            Tela_listarPedido tela_listarPedido = new Tela_listarPedido();
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });
    }

    public void chamarComboBoxCliente() throws ParseException {

        ClienteController clienteController = new ClienteController();
        String razaoClientes[] = new String[100];
        int tamanhoClientes;
        int cont;

        //Pegando as razões sociais do banco de dados
        razaoClientes = clienteController.exibirCnpjClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = clienteController.tamanhoClientes();

        //Listando
        for (cont = 0; cont < tamanhoClientes; cont++) {
            comboBoxCliente.addItem(razaoClientes[cont]);
        }

    }
}

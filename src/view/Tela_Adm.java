package view;

import controller.AdministradorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_Adm extends JFrame {

    private JButton sairButton;
    private JTextField menuDeOpçõesTextField;
    private JComboBox lista_clientes;
    private JButton escolherButton;
    private JButton cadastrarButton;
    private JPanel Tela_Adm;

    AdministradorController administradorController = new AdministradorController();

    public Tela_Adm() throws ParseException {

        setContentPane(Tela_Adm);
        setTitle("Administrador");
        setSize(510, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarCombox();
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_Adm);
                setVisible(false);
                administradorController.abrirTelaLogin();
            }
        });
    }

    public void chamarCombox() throws ParseException {

        String razaoClientes[] = new String[100];
        int tamanhoClientes;
        int cont;

        //Pegando as razões sociais do banco de dados
        razaoClientes = administradorController.exibirClientes();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoClientes = administradorController.tamanhoClientes();

        //Listando
        for (cont = 0; cont < tamanhoClientes; cont++) {
            lista_clientes.addItem(razaoClientes[cont]);
        }
        menuDeOpçõesTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item;
                item = lista_clientes.getSelectedIndex()+"";
                System.out.println("Teste de seleção:" + item);
            }
        });
    }
}
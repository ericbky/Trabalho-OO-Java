package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_listarFuncFuncionario extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JButton escolherButton;
    private JComboBox boxEscolhaFunc;
    private JPanel Tela_listarFuncFuncionario;

    public Tela_listarFuncFuncionario() throws ParseException {
        setContentPane(Tela_listarFuncFuncionario);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    chamarComboBox();

        escolherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String funcionario;
                funcionario = boxEscolhaFunc.getSelectedItem() + "";

                setContentPane(Tela_listarFuncFuncionario);
                setVisible(false);
                Tela_exibirFuncFuncionario tela_exibirFuncFuncionario = new Tela_exibirFuncFuncionario();
                try {
                    tela_exibirFuncFuncionario.exibirFuncionario(funcionario);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        sairBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_listarFuncFuncionario);
                setVisible(false);

                Tela_MenuFuncionario tela_menuFuncionario = new Tela_MenuFuncionario();
            }
        });
    }

    public void chamarComboBox() throws ParseException {

        FuncionarioController funcionarioController = new FuncionarioController();

        String[] nomeFunc = new String[100];
        int tamanhoFunc;
        int cont;

        //Pegando as razões sociais do banco de dados
        nomeFunc = funcionarioController.exibirFuncionariosCB();
        //Vendo quantos clientes tem cadastrados para colocar no laço de repetição
        tamanhoFunc = funcionarioController.tamanhoFuncionarios();

        //Listando
        for (cont = 0; cont < tamanhoFunc; cont++) {
            boxEscolhaFunc.addItem(nomeFunc[cont]);
        }
    }
}
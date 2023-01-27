package view;

import controller.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_listarFuncAdm extends JFrame {
    private JButton sairBtn;
    private JLabel tituloFuncionario;
    private JLabel txtOpcao1;
    private JButton cadastroBtn;
    private JButton escolherButton;
    private JComboBox boxEscolhaFunc;
    private JPanel Tela_listarFuncionario;

    public Tela_listarFuncAdm() throws ParseException {
        setContentPane(Tela_listarFuncionario);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        chamarComboBox();

        sairBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_listarFuncionario);
                setVisible(false);
                Tela_MenuAdm tela_adm = new Tela_MenuAdm();
            }
        });


        escolherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String funcionario;
                funcionario = boxEscolhaFunc.getSelectedItem() + "";
                //Fechando a tela da listagem de funcionários, chamando a tela de
                // exibir o funcionario e passando como parâmetro o funcionario selecionado
                try {
                    setContentPane(Tela_listarFuncionario);
                    setVisible(false);
                    Tela_exibirFuncionario tela_exibirFuncionario = new Tela_exibirFuncionario();
                    tela_exibirFuncionario.exibirFuncionario(funcionario);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cadastroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_listarFuncionario);
                setVisible(false);
            }
        });
        cadastroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tela_CadastrarFuncionarioAdm tela_cadastrarFuncionarioAdm = new Tela_CadastrarFuncionarioAdm();
            }
        });
    }

    public void chamarComboBox() throws ParseException {

        FuncionarioController funcionarioController = new FuncionarioController();

        String nomeFunc[] = new String[100];
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
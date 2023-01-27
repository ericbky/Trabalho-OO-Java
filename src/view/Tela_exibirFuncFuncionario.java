package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_exibirFuncFuncionario extends JFrame {
    private JPanel Tela_MostrarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField text_email;
    private JTextField text_senha;
    private JTextField text_telefone;
    private JTextField text_nome;
    private JTextField text_cargo;

    public Tela_exibirFuncFuncionario() {
        setContentPane(Tela_MostrarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void exibirFuncionario(String funcionario) throws ParseException {

        String vFuncionario[];

        FuncionarioController funcionarioController = new FuncionarioController();

        vFuncionario = funcionarioController.exibirFuncionario(funcionario);

        text_email.setText(vFuncionario[0]);
        text_senha.setText(vFuncionario[1]);
        text_telefone.setText(vFuncionario[2]);
        text_nome.setText(vFuncionario[3]);
        text_cargo.setText(vFuncionario[4]);

        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MostrarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_listarFuncFuncionario tela_listarFuncFuncionario = new Tela_listarFuncFuncionario();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

}

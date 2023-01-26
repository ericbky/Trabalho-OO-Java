package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_exibirFuncionario extends JFrame {
    private JPanel Tela_MostrarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField text_email;
    private JTextField text_senha;
    private JTextField text_Telefone;
    private JTextField text_Nome;
    private JTextField text_Cargo;

    FuncionarioController funcionarioController = new FuncionarioController();
    public Tela_exibirFuncionario() {
        setContentPane(Tela_MostrarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MostrarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_listarFuncionarios tela_listarFuncionarios = new Tela_listarFuncionarios();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void exibirFuncionario(String funcionario) throws ParseException {
    String vFuncionario[] = new String[9];
    vFuncionario = funcionarioController.exibirFuncionario(funcionario);

            text_email.setText(vFuncionario[0]);
            text_senha.setText(vFuncionario[1]);
            text_Telefone.setText(vFuncionario[2]);
            text_Nome.setText(vFuncionario[3]);
            text_Cargo.setText(vFuncionario[4]);

    }

}

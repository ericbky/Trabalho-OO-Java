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
    private JButton excluirFuncionarioButton;
    private JButton editarFuncionarioButton;

    FuncionarioController funcionarioController = new FuncionarioController();

    public Tela_exibirFuncionario() throws ParseException {
        setContentPane(Tela_MostrarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public void exibirFuncionario(String funcionario) throws ParseException {

        String vFuncionario[];

        vFuncionario = funcionarioController.exibirFuncionario(funcionario);

        text_email.setText(vFuncionario[0]);
        text_senha.setText(vFuncionario[1]);
        text_Telefone.setText(vFuncionario[2]);
        text_Nome.setText(vFuncionario[3]);
        text_Cargo.setText(vFuncionario[4]);

        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MostrarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_listarFuncAdm tela_listarFuncionarios = new Tela_listarFuncAdm();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        editarFuncionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MostrarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_EditarFuncionarioAdm tela_editarFuncionarioAdm = new Tela_EditarFuncionarioAdm();
                    tela_editarFuncionarioAdm.exibirFuncionarioEdicao(funcionario);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        excluirFuncionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    excluirFuncionario(funcionario);
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void excluirFuncionario(String funcionario) throws ParseException {
        if (funcionarioController.excluirFuncionario(funcionario)) {
            JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");
            setContentPane(Tela_MostrarFuncionarioAdm);
            setVisible(false);
            Tela_listarFuncAdm tela_listarFuncAdm = new Tela_listarFuncAdm();
        }
    }
}

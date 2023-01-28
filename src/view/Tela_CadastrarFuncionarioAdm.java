package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;

public class Tela_CadastrarFuncionarioAdm extends javax.swing.JFrame {

    private JPanel Tela_CadastrarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloTela;
    private JTextField text_email;
    private JTextField text_senha;
    private JTextField text_telefone;
    private JTextField text_nome;
    private JTextField text_cargo;
    private JButton cadastroBtn;

    public Tela_CadastrarFuncionarioAdm() {
        this.setIconImage (new javax.swing.ImageIcon(getClass().getResource("/view/Ícones/adicionar-usuario.png")).getImage());
        setContentPane(Tela_CadastrarFuncionarioAdm);
        setTitle("Cadastro de Funcionário");
        setSize(550, 610);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_CadastrarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_listarFuncAdm tela_listarFuncionarios = new Tela_listarFuncAdm();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        cadastroBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                FuncionarioController funcionarioController = new FuncionarioController();
                String[] dadosFuncionarioCad = new String[7];

                dadosFuncionarioCad[0] = text_email.getText();
                dadosFuncionarioCad[1] = text_senha.getText();
                dadosFuncionarioCad[2] = text_telefone.getText();
                dadosFuncionarioCad[3] = text_nome.getText();
                dadosFuncionarioCad[4] = text_cargo.getText();

                if ((dadosFuncionarioCad[0].length() < 6) ||
                        (dadosFuncionarioCad[2].length() < 10) ||
                        (dadosFuncionarioCad[3].length() < 10) ||
                        (dadosFuncionarioCad[4].length() < 3)) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    try {
                        if (funcionarioController.cadastrarFuncionario(dadosFuncionarioCad)) {
                            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!!");
                            setContentPane(Tela_CadastrarFuncionarioAdm);
                            setVisible(false);
                            Tela_listarFuncAdm tela_listarFuncAdm = new Tela_listarFuncAdm();
                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
    }
}

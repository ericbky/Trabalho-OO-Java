package view;

import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_EditarFuncionarioAdm extends JFrame {
    private JPanel Tela_EditarFuncionarioAdm;
    private JButton voltarBtn;
    private JLabel tituloPagina;
    private JLabel tituloDados;
    private JTextField text_email;
    private JTextField text_senha;
    private JTextField text_telefone;
    private JTextField text_nome;
    private JTextField text_cargo;
    private JButton editarFuncionárioButton;

    public Tela_EditarFuncionarioAdm() throws ParseException {
        setContentPane(Tela_EditarFuncionarioAdm);
        setTitle("Funcionário");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        editarFuncionárioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                FuncionarioController funcionarioController = new FuncionarioController();
                String[] dadosFuncEdit = new String[7];

                dadosFuncEdit[0] = text_email.getText();
                dadosFuncEdit[1] = text_senha.getText();
                dadosFuncEdit[2] = text_telefone.getText();
                dadosFuncEdit[3] = text_nome.getText();
                dadosFuncEdit[4] = text_cargo.getText();

                if (
                        (dadosFuncEdit[1].length() < 5) ||
                        (dadosFuncEdit[2].length() < 10) ||
                        (dadosFuncEdit[3].length() < 4) ||
                        (dadosFuncEdit[4].length() < 2)) {
                    JOptionPane.showMessageDialog(null, "Digite dados válidos!");
                } else {
                    if (funcionarioController.editarFuncionario(dadosFuncEdit)) {
                        JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso!!");
                        setContentPane(Tela_EditarFuncionarioAdm);
                        setVisible(false);
                        try {
                            Tela_listarFuncAdm tela_listarFuncAdm = new Tela_listarFuncAdm();
                        } catch (ParseException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });
        voltarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_EditarFuncionarioAdm);
                setVisible(false);
                try {
                    Tela_listarFuncAdm tela_listarFuncAdm = new Tela_listarFuncAdm();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void exibirFuncionarioEdicao(String funcionario) throws ParseException {

        FuncionarioController funcionarioController = new FuncionarioController();

        String[] vFuncionario;
        vFuncionario = funcionarioController.exibirFuncionario(funcionario);

        text_email.setText(vFuncionario[0]);
        text_senha.setText(vFuncionario[1]);
        text_telefone.setText(vFuncionario[2]);
        text_nome.setText(vFuncionario[3]);
        text_cargo.setText(vFuncionario[4]);
    }

}

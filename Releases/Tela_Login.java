package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;

public class Tela_Login extends JFrame {
    private JPanel panel1;
    private JCheckBox desejaEntrarComoAdministradorCheckBox;
    private JButton entrarButton;
    private JTextField emailLogin;
    private JPanel TelaLogin;
    private JPasswordField senhaLogin;

    public Tela_Login() {
        this.setIconImage (new javax.swing.ImageIcon(getClass().getResource("/view/Ícones/lavanderia.png")).getImage());
        setContentPane(TelaLogin);
        setTitle("Sistema de Lavanderia");
        setSize(425, 425);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        //AÇÃO DE CLICKAR NO BOTÃO ENTRAR
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                String emailLoginText = emailLogin.getText();
                char[] senhaLoginText = senhaLogin.getPassword();
                LoginController loginController = new LoginController();

                //FUNÇÃO PARA VERIFICAR LOGIN
                if (desejaEntrarComoAdministradorCheckBox.isSelected()) {
                    try {
                        if (loginController.verificarLoginAdm(emailLoginText, String.valueOf(senhaLoginText))) {
                            setContentPane(TelaLogin);
                            setVisible(false);
                            loginController.abrirTelaAdm();
                        }
                    } catch (ParseException ex) {
                        throw new RuntimeException(ex);
                    }
                } else {
                    if (loginController.verificarLoginFuncionario(emailLoginText, String.valueOf(senhaLoginText))) {
                        setContentPane(TelaLogin);
                        setVisible(false);
                        loginController.abrirTelaFuncionario();
                    }
                }
            }
        });
    }
}
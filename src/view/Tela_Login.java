package view;

import controller.LoginController;

import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;

public class Tela_Login extends JFrame  {
    private JPanel panel1;
    private JCheckBox desejaEntrarComoAdministradorCheckBox;
    private JButton entrarButton;
    private JTextField emailLogin;
    private JPanel TelaLogin;
    private JPasswordField senhaLogin;

    public Tela_Login() {
        setContentPane(TelaLogin);
        setTitle("Login");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        TelaLogin.addComponentListener(new ComponentAdapter() {
        });
        TelaLogin.addComponentListener(new ComponentAdapter() {
        });

        //AÇÃO DE CLICKAR NO BOTÃO ENTRAR
        entrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ARMAZENANDO OS DADOS DE ENTRADA
                String emailLoginText = emailLogin.getText();
                char [] senhaLoginText = senhaLogin.getPassword();
                LoginController loginController = new LoginController();
                boolean check = false;

                /*desejaEntrarComoAdministradorCheckBox.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        boolean check = true;
                    }
                });*/

                //FUNÇÃO PARA VERIFICAR LOGIN
                try {
                   // if(check == true){
                    loginController.verificarLoginAdm(emailLoginText, String.valueOf(senhaLoginText));//}
                   // else{
                        //loginController.verificarLoginFuncionario(emailLoginText, String.valueOf(senhaLoginText));
                   // }
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public static void main(String[] args) {
        Tela_Login tela_login = new Tela_Login();
    }
}
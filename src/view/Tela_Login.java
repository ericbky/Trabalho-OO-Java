package view;

import javax.swing.*;

public class Tela_Login extends JFrame {
    private JPanel panel_login;
    private JCheckBox desejaEntrarComoAdministradorCheckBox;
    private JTextField campo_senha;
    private JButton entrarButton;
    private JTextField campo_email;

    public Tela_Login() {
        setContentPane(panel_login);
        setTitle("Login");
        setSize(430, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Tela_Login tela_login = new Tela_Login();
    }

}
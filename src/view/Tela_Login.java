package view;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class Tela_Login extends JFrame {
    private JPanel panel1;
    private JCheckBox desejaEntrarComoAdministradorCheckBox;
    private JTextField textField1;
    private JButton entrarButton;

    public Tela_Login() {
        setContentPane(panel1);
        setTitle("Login");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Tela_Login tela_login = new Tela_Login();
    }

}
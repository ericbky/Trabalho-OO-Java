package view;

import javax.swing.*;

public class Adms extends JFrame {
    private JPanel Adms;
    private JTextField telefone_adm1;
    private JTextField email_adm1;
    private JTextField nome_adm1;
    private JTextField senha_adm1;
    private JButton voltarButton;
    private JTextField email_admin2;
    private JTextField email_adm3;
    private JTextField senha_adm2;
    private JTextField senha_adm3;
    private JTextField telefone_adm3;
    private JTextField telefone_adm2;
    private JTextField nome_adm2;
    private JTextField nome_adm3;

    public Adms() {
        setContentPane(Adms);
        setTitle("Administradores");
        setSize(650, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Adms adms = new Adms();
    }
}
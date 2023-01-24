package view;

import javax.swing.*;

public class Tela_Adm extends JFrame {

    private JButton sairButton;
    private JTextField menuDeOpçõesTextField;
    private JComboBox lista_clientes;
    private JButton escolherButton;
    private JButton cadastrarButton;
    private JPanel Tela_Adm;

public Tela_Adm () {
    setContentPane(Tela_Adm);
    setTitle("Administrador");
    setSize(510, 480);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
}

    public static void main(String[] args) {
        Tela_Adm tela_adm = new Tela_Adm ();
    }
}
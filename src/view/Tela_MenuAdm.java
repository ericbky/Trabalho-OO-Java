package view;

import javax.swing.*;

public class Tela_MenuAdm extends JFrame{
    private JTextField menuTextField;
    private JButton administradoresButton;
    private JButton funcionáriosButton;
    private JButton clientesButton;
    private JPanel Tela_MenuAdm;
    private JButton sairButton;

    public Tela_MenuAdm() {
        setContentPane(Tela_MenuAdm);
        setTitle("Menu");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Tela_MenuAdm tela_MenuAdm = new Tela_MenuAdm ();
    }
}

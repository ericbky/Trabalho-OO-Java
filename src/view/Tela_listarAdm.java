package view;

import controller.AdministradorController;
import controller.FuncionarioController;

import javax.swing.*;
import java.awt.event.*;

public class Tela_listarAdm extends javax.swing.JFrame {
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
    private JLabel Icone_adm;
    private JLabel nome_text;

    public Tela_listarAdm() {
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/view/Ícones/adm.png")).getImage());
        setContentPane(Adms);
        setTitle("Administradores");
        setSize(740, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Adms);
                setVisible(false);
                Tela_MenuAdm tela_adm = new Tela_MenuAdm();
            }
        });

        AdministradorController administradorController = new AdministradorController();

        String[] vAdm1, vAdm2, vAdm3;
        vAdm1 = administradorController.buscarAdministrador1();
        vAdm2 = administradorController.buscarAdministrador2();
        vAdm3 = administradorController.buscarAdministrador3();

        email_adm1.setText(vAdm1[0]);
        senha_adm1.setText(vAdm1[1]);
        telefone_adm1.setText(vAdm1[2]);
        nome_adm1.setText(vAdm1[3]);

        email_admin2.setText(vAdm2[0]);
        senha_adm2.setText(vAdm2[1]);
        telefone_adm2.setText(vAdm2[2]);
        nome_adm2.setText(vAdm2[3]);

        email_adm3.setText(vAdm3[0]);
        senha_adm3.setText(vAdm3[1]);
        telefone_adm3.setText(vAdm3[2]);
        nome_adm3.setText(vAdm3[3]);
    }
}
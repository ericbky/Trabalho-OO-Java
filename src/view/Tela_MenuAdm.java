package view;

import controller.AdministradorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class Tela_MenuAdm extends JFrame {
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
        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setContentPane(Tela_MenuAdm);
                    setVisible(false);
                    Tela_ListarClientes tela_adm = new Tela_ListarClientes();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        administradoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MenuAdm);
                setVisible(false);
                Tela_listarAdm tela_listarAdm = new Tela_listarAdm();
            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MenuAdm);
                setVisible(false);
                AdministradorController administradorController = new AdministradorController();
                administradorController.abrirTelaLogin();
            }
        });
        funcionáriosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(Tela_MenuAdm);
                setVisible(false);
                try {
                    Tela_listarFuncAdm tela_funcionarioAdm = new Tela_listarFuncAdm();
                } catch (ParseException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}

import controller.LoginController;
import view.Tela_Login;

import sistema.*;

import java.text.ParseException;

public class Run {

    public static void main(String[] args) throws Exception {
        DadosCliente dadosCliente = new DadosCliente();
        DadosAdministrador dadosAdministrador = new DadosAdministrador();
        LoginController loginController = new LoginController();
        try {
            loginController.iniciarBancoClientes();
            loginController.iniciarBancoAdministradores();
            loginController.iniciarBancoPedidos();
            loginController.iniciarBancoFuncionarios();
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
        Tela_Login tela = new Tela_Login();
    }
}

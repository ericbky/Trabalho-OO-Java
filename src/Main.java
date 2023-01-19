import java.util.*;
import model.*;
import controller.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        UsuarioController testeUsuario = new UsuarioController();

        String email, senha, telefone;

        System.out.println("Digite o Email:");
        email = in.next();
        System.out.println("Digite a Senha:");
        senha = in.next();
        System.out.println("Digite o Telefone:");
        telefone = in.next();

        testeUsuario.SalvarUsuario(email, senha, telefone);
    }
}

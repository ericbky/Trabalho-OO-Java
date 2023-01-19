package controller;
import model.*;

public class UsuarioController {
public static void SalvarUsuario(String Email, String Senha, String Telefone, int OpcaoUsuario){
    Usuario usuario = new Usuario(Email, Senha, Telefone, OpcaoUsuario);

    usuario.dadosUsuario(Email, Senha, Telefone, OpcaoUsuario);

}


}

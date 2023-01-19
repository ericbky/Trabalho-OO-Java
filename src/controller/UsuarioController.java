package controller;
import model.*;

public class UsuarioController {
public static void SalvarUsuario(String Email, String Senha, String Telefone){
    Usuario usuario = new Usuario(Email, Senha, Telefone);

    usuario.salvarUsuario(Email, Senha, Telefone);

}


}

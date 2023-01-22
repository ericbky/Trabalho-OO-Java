package model;

import Sistema.BancoDados;

public class Funcionario extends Usuario {
    private String nome;
    private String cargo;

    public Funcionario(String email, String senha, String telefone) {
        super(email, senha, telefone);
    }

    public Funcionario(String email, String senha, String telefone, String nome, String cargo) {
        super(email, senha, telefone);
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

   /* public boolean salvarFuncionario(String nome, String cargo, String telefone) {
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivoFuncionario.txt");
            PrintWriter pw = new PrintWriter(arquivo);

            pw.print(nome + ";"+cargo+";"+telefone+";");

            System.out.println(nome + ";"+cargo+";"+telefone+";\n");

            pw.close();
            arquivo.close();

        }catch (Exception erroFun){
            System.out.println("Erro ao abrir o arquivo!");
        }

        return  true;
    }*/

    public static void buscarFuncionario() {
        BancoDados bancoDados = new BancoDados();

        bancoDados.DadosPreCadastradosFuncionarios();
    }
}

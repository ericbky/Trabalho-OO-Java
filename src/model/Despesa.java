package model;

public class Despesa {
    private float agua;
    private float energia;
    private float aluguel;
    private float fornecedores;
    private float faturasTelefone;
    private float salarioFuncionarios;
    private float impostos;
    private float despesasTotais;

    public Despesa(float agua, float energia, float aluguel, float fornecedores, float faturasTelefone, float salarioFuncionarios, float impostos, float despesasTotais) {
        this.agua = agua;
        this.energia = energia;
        this.aluguel = aluguel;
        this.fornecedores = fornecedores;
        this.faturasTelefone = faturasTelefone;
        this.salarioFuncionarios = salarioFuncionarios;
        this.impostos = impostos;
        this.despesasTotais = despesasTotais;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    public float getAluguel() {
        return aluguel;
    }

    public void setAluguel(float aluguel) {
        this.aluguel = aluguel;
    }

    public float getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(float fornecedores) {
        this.fornecedores = fornecedores;
    }

    public float getFaturasTelefone() {
        return faturasTelefone;
    }

    public void setFaturasTelefone(float faturasTelefone) {
        this.faturasTelefone = faturasTelefone;
    }

    public float getSalarioFuncionarios() {
        return salarioFuncionarios;
    }

    public void setSalarioFuncionarios(float salarioFuncionarios) {
        this.salarioFuncionarios = salarioFuncionarios;
    }

    public float getImpostos() {
        return impostos;
    }

    public void setImpostos(float impostos) {
        this.impostos = impostos;
    }

    public float getDespesasTotais() {
        return despesasTotais;
    }

    public void setDespesasTotais(float despesasTotais) {
        this.despesasTotais = despesasTotais;
    }
}

package br.com.solutis.exercicio.questao11;

import br.com.solutis.exercicio.questao8.Cargo;

public abstract class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double rendaBasica = 1000.0;
    private Cargo cargo;

    public Funcionario(int codigoFuncional, String nome, Cargo cargo) {
        this.cargo = cargo;
        this.codigoFuncional = codigoFuncional;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public double getRendaTotal() {
        return rendaBasica+ getCargo().getComissao();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nCodigo funcional: " + getCodigoFuncional() +
                "\nCargo: " + getCargo().name() +
                "\nSalario base: " + (getRendaTotal() - getCargo().getComissao()) +
                "\nComissao: " + getCargo().getComissao()+
                "\nSalario + comissao: " + getRendaTotal();

    }
}

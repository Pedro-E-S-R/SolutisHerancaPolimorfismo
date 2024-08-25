package br.com.solutis.exercicio.questao5;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    protected double rendaBasica = 1000.0;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
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

    public double getRendaTotal() {
        return rendaBasica;
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nCodigo funcional: " + getCodigoFuncional() +
                "\nSalario: " + getRendaTotal();
    }
}

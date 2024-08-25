package br.com.solutis.exercicio.questao5;

public class FuncionarioEnsinoBasico extends Funcionario{
    private String escolaBasica;
    public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String escolaBasica) {
        super(nome, codigoFuncional);
        this.escolaBasica = escolaBasica;
    }

    public String getEscolaBasica() {
        return escolaBasica;
    }

    public void setEscolaBasica(String escolaBasica) {
        this.escolaBasica = escolaBasica;
    }
    @Override
    public double getRendaTotal() {
        return rendaBasica*1.1;
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nEscola Basica: " + getEscolaBasica();
    }
}

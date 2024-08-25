package br.com.solutis.exercicio.questao5;

public class FuncionarioGraduado extends FuncionarioEscolaMedia{
    private String universidade;
    public FuncionarioGraduado(String nome, int codigoFuncional,
                               String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escolaBasica, escolaMedia);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
    @Override
    public double getRendaTotal() {
        return rendaBasica*3.3;
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nUniversidade: " + universidade;
    }
}

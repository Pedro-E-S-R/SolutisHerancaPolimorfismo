package br.com.solutis.exercicio.questao9;

import br.com.solutis.exercicio.questao8.Cargo;

public class FuncionarioGraduado extends FuncionarioEscolaMedia {
    private String universidade;
    public FuncionarioGraduado(String nome, int codigoFuncional,
                               Cargo cargo, String escolaBasica,
                               String escolaMedia, String universidade) {
        super(nome, codigoFuncional, cargo, escolaBasica, escolaMedia);
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
        return rendaBasica*3.3 + getCargo().getComissao();
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nUniversidade: " + universidade;
    }
}

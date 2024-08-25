package br.com.solutis.exercicio.questao11;

import br.com.solutis.exercicio.questao8.Cargo;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasica;
    public FuncionarioEnsinoBasico(String nome, int codigoFuncional,
                                   Cargo cargo, String escolaBasica) {
        super(codigoFuncional, nome, cargo);
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
        return rendaBasica*1.1+ getCargo().getComissao();
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nEscola Basica: " + getEscolaBasica();
    }
}

package br.com.solutis.exercicio.questao11;

import br.com.solutis.exercicio.questao8.Cargo;

public class FuncionarioEscolaMedia extends FuncionarioEnsinoBasico {
    private String escolaMedia;
    public FuncionarioEscolaMedia(String nome,
                                  int codigoFuncional,
                                  Cargo cargo,
                                  String escolaBasica,
                                  String escolaMedia) {
        super(nome, codigoFuncional, cargo, escolaBasica);
        this.escolaMedia = escolaMedia;
    }

    public String getEscolaMedia() {
        return escolaMedia;
    }

    public void setEscolaMedia(String escolaMedia) {
        this.escolaMedia = escolaMedia;
    }
    @Override
    public double getRendaTotal() {
        return rendaBasica*1.65+ getCargo().getComissao();
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nEscola Media: " + getEscolaMedia();
    }
}

package br.com.solutis.exercicio.questao5;

public class FuncionarioEscolaMedia extends FuncionarioEnsinoBasico{
    private String escolaMedia;
    public FuncionarioEscolaMedia(String nome,
                                  int codigoFuncional,
                                  String escolaBasica,
                                  String escolaMedia) {
        super(nome, codigoFuncional, escolaBasica);
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
        return rendaBasica*1.65;
    }
    @Override
    public String toString() {
        return super.toString()+
                "\nEscola Media: " + getEscolaMedia();
    }
}

package br.com.solutis.exercicio.questao1;

public class Preguica extends Animal{
    public Preguica(String nome, long idade) {
        super(nome, idade);
    }

    public void subirArvore(){
        System.out.println(this.getClass().getSimpleName()+" esta lentamente subind a arvore");
    }
}

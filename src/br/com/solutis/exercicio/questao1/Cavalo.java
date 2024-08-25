package br.com.solutis.exercicio.questao1;

public class Cavalo extends Animal implements AnimalIn{
    public Cavalo(String nome, long idade) {
        super(nome, idade);
    }
    @Override
    public void correr(){
        System.out.println(this.getClass().getSimpleName()+" esta correndo");
    }
}

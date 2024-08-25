package br.com.solutis.exercicio.questao1;

public abstract class Animal{
    private String nome;
    private long idade;

    public Animal(String nome, long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getIdade() {
        return idade;
    }

    public void setIdade(long idade) {
        this.idade = idade;
    }
    public void emitirSom() {
        System.out.println(this.getClass().getSimpleName()+" esta emitindo som");
    }
}

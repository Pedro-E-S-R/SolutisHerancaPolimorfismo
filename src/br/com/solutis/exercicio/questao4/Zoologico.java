package br.com.solutis.exercicio.questao4;

import br.com.solutis.exercicio.questao1.Animal;
import br.com.solutis.exercicio.questao1.AnimalIn;

public class Zoologico {
    private Animal[] jaula;

    public Zoologico(int tamanho) {
        jaula = new Animal[tamanho];
    }

    public void podeCorrer() {
        for (Animal animal : jaula) {
            animal.emitirSom();
            if (animal instanceof AnimalIn) {
                ((AnimalIn) animal).correr();
            }
        }
    }

    public void setJaula(Animal animal, int i) {
        this.jaula[i] = animal;
    }
}

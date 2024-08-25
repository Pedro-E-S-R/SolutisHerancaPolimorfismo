package br.com.solutis.exercicio.questao4;

import br.com.solutis.exercicio.questao1.Animal;
import br.com.solutis.exercicio.questao1.Cachorro;
import br.com.solutis.exercicio.questao1.Cavalo;
import br.com.solutis.exercicio.questao1.Preguica;

public class TesteZoologico {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico(10);
        zoo.setJaula(new Preguica("José", 5),0);
        zoo.setJaula(new Cachorro("Toto", 12),1);
        zoo.setJaula(new Cavalo("Purps", 15),2);
        zoo.setJaula(new Preguica("Preguinho", 8),3);
        zoo.setJaula(new Cachorro("Rex", 8),4);
        zoo.setJaula(new Cavalo("Sr Alfredo", 8),5);
        zoo.setJaula(new Preguica("Gula", 9),6);
        zoo.setJaula(new Cachorro("Jó", 7),7);
        zoo.setJaula(new Cavalo("Ma", 3),8);
        zoo.setJaula(new Cavalo("Horse", 18),9);

        zoo.podeCorrer();

    }
}

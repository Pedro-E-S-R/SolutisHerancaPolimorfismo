package br.com.solutis.exercicio.questao3;

import br.com.solutis.exercicio.questao1.Animal;
import br.com.solutis.exercicio.questao1.Cachorro;
import br.com.solutis.exercicio.questao1.Cavalo;
import br.com.solutis.exercicio.questao1.Preguica;

public class TesteVeterinario {
    public static void main(String[] args) {
        Animal preguica = new Preguica("José", 5);
        Animal cachorro = new Cachorro("Toto", 12);
        Animal cavalo = new Cavalo("Purps", 15);
        Veterinario v = new Veterinario();

        v.examinar(preguica);
        v.examinar(cachorro);
        v.examinar(cavalo);
    }
}

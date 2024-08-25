package br.com.solutis.exercicio.questao6;

import br.com.solutis.exercicio.questao5.Funcionario;
import br.com.solutis.exercicio.questao5.FuncionarioEnsinoBasico;
import br.com.solutis.exercicio.questao5.FuncionarioEscolaMedia;
import br.com.solutis.exercicio.questao5.FuncionarioGraduado;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Pedro",
                11);
        Funcionario f2 = new FuncionarioEnsinoBasico("Pedro",
                11,"Dom Carlos");
        Funcionario f3 = new FuncionarioEscolaMedia("Pedro",
                11,"Dom Carlos","José Alfredo Neto");
        Funcionario f4 = new FuncionarioGraduado("Pedro",
                11,"Dom Carlos","José Alfredo Neto",
                "Universidade graduada");
        System.out.println(f1.getRendaTotal());
        System.out.println(f2.getRendaTotal());
        System.out.println(f3.getRendaTotal());
        System.out.println(f4.getRendaTotal());
    }
}

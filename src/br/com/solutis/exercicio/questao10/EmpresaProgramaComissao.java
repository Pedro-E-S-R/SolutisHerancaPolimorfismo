package br.com.solutis.exercicio.questao10;

import br.com.solutis.exercicio.questao8.Cargo;
import br.com.solutis.exercicio.questao9.Funcionario;
import br.com.solutis.exercicio.questao9.FuncionarioEnsinoBasico;
import br.com.solutis.exercicio.questao9.FuncionarioEscolaMedia;
import br.com.solutis.exercicio.questao9.FuncionarioGraduado;

public class EmpresaProgramaComissao {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[10];
        f[0] = new FuncionarioEnsinoBasico("FuncionarioBasico",
                11, Cargo.GERENTE,"Dom Carlos");
        f[1] = new FuncionarioEnsinoBasico("FuncionarioBasico",
                11,Cargo.SUPERVISOR,"Dom Carlos");
        f[2] = new FuncionarioEnsinoBasico("FuncionarioBasico",
                11,Cargo.SUPERVISOR,"Dom Carlos");
        f[3] = new FuncionarioEnsinoBasico("FuncionarioBasico",
                11,Cargo.VENDEDOR,"Dom Carlos");
        f[4] =  new FuncionarioEscolaMedia("FuncionarioMedio",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[5] =  new FuncionarioEscolaMedia("FuncionarioMedio",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[6] =  new FuncionarioEscolaMedia("FuncionarioMedio",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[7] =  new FuncionarioEscolaMedia("FuncionarioMedio",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[8] = new FuncionarioGraduado("FuncionarioBasico",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto",
                "Universidade graduada");
        f[9] = new FuncionarioGraduado("FuncionarioBasico",
                11,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto",
                "Universidade graduada");

        double gastoSalario =0;
        for(Funcionario funcionario : f) {
            gastoSalario += funcionario.getRendaTotal();
            System.out.println(funcionario);
            System.out.println("----------------------");
        }
        System.out.println("Gasto total da empresa é de R$"+ gastoSalario);
    }
}

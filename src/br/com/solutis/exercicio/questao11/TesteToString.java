package br.com.solutis.exercicio.questao11;


import br.com.solutis.exercicio.questao8.Cargo;

public class TesteToString {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[10];
        f[0] = new FuncionarioEnsinoBasico("Rafael",
                111, Cargo.GERENTE,"Dom Carlos");
        f[1] = new FuncionarioEnsinoBasico("Joel",
                112,Cargo.SUPERVISOR,"Dom Carlos");
        f[2] = new FuncionarioEnsinoBasico("Marcos",
                113,Cargo.SUPERVISOR,"Dom Carlos");
        f[3] = new FuncionarioEnsinoBasico("Maria",
                114,Cargo.VENDEDOR,"Dom Carlos");
        f[4] =  new FuncionarioEscolaMedia("Nasha",
                115,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[5] =  new FuncionarioEscolaMedia("Ronivaldo",
                116,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[6] =  new FuncionarioEscolaMedia("Cleidesvaldo",
                117,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[7] =  new FuncionarioEscolaMedia("Valdemiro",
                118,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto");
        f[8] = new FuncionarioGraduado("Lydyynnsi",
                119,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto",
                "Universidade graduada");
        f[9] = new FuncionarioGraduado("Joao",
                120,Cargo.VENDEDOR,"Dom Carlos","José Alfredo Neto",
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

package br.com.solutis.exercicio.questao11;


import br.com.solutis.exercicio.questao8.Cargo;

public class TesteToString {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[3];
        f[0] = new FuncionarioEnsinoBasico("Marcos",125, Cargo.VENDEDOR,
                "Escola Basica");
        f[1] = new FuncionarioEscolaMedia("José",125, Cargo.GERENTE,
                "Escola Basica","Escola Media");
        f[2] = new FuncionarioGraduado("José",125, Cargo.SUPERVISOR,
                "Escola Basica","Escola Media","Univercidade Graduada");

        for(Funcionario funcionario : f) {
            System.out.println(funcionario);
            System.out.println("--------------------------");
        }
    }
}

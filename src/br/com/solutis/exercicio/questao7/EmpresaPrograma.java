package br.com.solutis.exercicio.questao7;

import br.com.solutis.exercicio.questao5.Funcionario;
import br.com.solutis.exercicio.questao5.FuncionarioEnsinoBasico;
import br.com.solutis.exercicio.questao5.FuncionarioEscolaMedia;
import br.com.solutis.exercicio.questao5.FuncionarioGraduado;

public class EmpresaPrograma {
    public static void main(String[] args) {
        Funcionario[] f = new Funcionario[10];
        for(int i = 0;i<10;i++){
            if(i<4){
                f[i] = new FuncionarioEnsinoBasico("FuncionarioBasico",
                        11,"Dom Carlos");
            }
            else if(i<8){
                f[i] = new FuncionarioEscolaMedia("FuncionarioMedio",
                        11,"Dom Carlos","José Alfredo Neto");
            }else{
                f[i] =new FuncionarioGraduado("FuncionarioBasico",
                        11,"Dom Carlos","José Alfredo Neto",
                        "Universidade graduada");
            }
        }
        double gastoSalario =0;
        for(Funcionario funcionario : f) {
            gastoSalario += funcionario.getRendaTotal();
            System.out.println(funcionario);
            System.out.println("-------------------");
        }
        System.out.println("Gasto total da empresa é de R$"+ gastoSalario);
    }
}

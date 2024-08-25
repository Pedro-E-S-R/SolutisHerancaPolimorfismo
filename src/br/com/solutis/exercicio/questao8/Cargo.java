package br.com.solutis.exercicio.questao8;

public enum Cargo {
    GERENTE(1500.00),SUPERVISOR(600.00),VENDEDOR(250.00);

    private final double comissao;

    Cargo(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
}

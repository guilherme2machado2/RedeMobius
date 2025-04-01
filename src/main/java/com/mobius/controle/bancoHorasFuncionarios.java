package com.mobius.controle;

import com.mobius.people.Funcionario;

public class bancoHorasFuncionarios extends Funcionario {
    private final Funcionario funcionario;
    private double HORAS_APONTADAS;
    private double HORAS_EXTRAS_APONTADAS;
    private static final double VALOR_HORA_EXTRA = 0;
    private static final int LIMITE_HORAS_EXTRAS_MENSAL = 45;
    private static final int LIMITE_HORAS_EXTRAS_DIARIAS = 3;

    public bancoHorasFuncionarios(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.HORAS_EXTRAS_APONTADAS = 0;
        this.HORAS_APONTADAS = 0;
    }

    public void adicionarHorasExtras(double horas) {
        if (horas <= LIMITE_HORAS_EXTRAS_MENSAL && horas <= LIMITE_HORAS_EXTRAS_DIARIAS) {
            this.HORAS_EXTRAS_APONTADAS += horas;
        } else {
            System.out.println("Limite de horas extras excedido.");
        }
    }

    public double calcularSalarioTotal() {
        double salarioTotal = (funcionario.getSalarioBase() * HORAS_APONTADAS ) + (HORAS_EXTRAS_APONTADAS * VALOR_HORA_EXTRA);
        return salarioTotal;
    }

    public double getHorasExtras() {
        return HORAS_EXTRAS_APONTADAS;
    }
}
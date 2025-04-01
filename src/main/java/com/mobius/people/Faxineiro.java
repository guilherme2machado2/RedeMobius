package com.mobius.people;

public class Faxineiro extends Funcionario{

    @Override
    public void setSALARIO_BASE_HORA(double SALARIO_BASE_HORA) {
        super.setSALARIO_BASE_HORA(SALARIO_BASE_HORA = 12.50);
    }

    @Override
    public void setCargo(String Cargo) {
        super.setCargo(Cargo);
    }

    public double calcularHorasDia(double TEMPO_TOTAL_JORNADA, double HORARIO_ALMOCO, double SALARIO_BASE_HORA) {
        double salarioBaseHora = SALARIO_BASE_HORA;
        double comissaoDia = 0;
        if ( TEMPO_TOTAL_JORNADA == 8 || HORARIO_ALMOCO == 1) {
            comissaoDia = SALARIO_BASE_HORA * TEMPO_TOTAL_JORNADA;
        } else {
            System.out.println("Erro: Seu tempo de jornada não está condizente com estimado por favor, " +
                    "justifique o motivo do atraso ao bater o ponto!");
        }
            return comissaoDia;
    }
}

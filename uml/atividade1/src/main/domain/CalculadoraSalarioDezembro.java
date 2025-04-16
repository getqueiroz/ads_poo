package uml.atividade1.src.main.domain;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraSalarioDezembro extends CalculadoraSalario {
    private final double DECENIO = 10.0;

    @Override
    float calcular(float horasTrabalhadas, Professor professor) {
    
        Double indiceAdicional = calcularAdicional(professor);
        float valorHoraAula = professor.getValorHoraAula().floatValue();
        float salario = horasTrabalhadas * valorHoraAula;
        float salarioFinal =  salario * indiceAdicional.floatValue();

        return salarioFinal;
    }


    @Override
    double calcularAdicional(Professor professor) {
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(professor.getDataContratacao(), dataAtual);
        int anosTrabalhados = periodo.getYears();
        int indiceFormacao = professor.getFormacao().ordinal() + 1;
        Double adicional = (anosTrabalhados / DECENIO) * indiceFormacao;

        if(adicional <= 0.0) { 
            adicional = 1.0;
        }
        
        return adicional;
    }
    
}

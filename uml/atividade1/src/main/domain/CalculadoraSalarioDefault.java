package uml.atividade1.src.main.domain;

public class CalculadoraSalarioDefault extends CalculadoraSalario{

    @Override
    float calcular(float horasTrabalhadas, Professor professor) {
        float valorHoraAula = professor.getValorHoraAula().floatValue();
        float salario = horasTrabalhadas * valorHoraAula;

        return salario + Double.valueOf(calcularAdicional(professor)).floatValue();
    }

    @Override
    double calcularAdicional(Professor professor) {
        return 0.0;
    }
}

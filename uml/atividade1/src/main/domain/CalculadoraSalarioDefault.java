package uml.atividade1.src.main.domain;

public class CalculadoraSalarioDefault extends CalculadoraSalario{

    @Override
    float calcular(float horasTrabalhadas, Professor professor) {
        float valorHoraAula = professor.getValorHoraAula().floatValue();
        float salario = horasTrabalhadas * valorHoraAula;

        return salario;
    }

    @Override
    double calcularAdicional(Professor professor) {
        throw new UnsupportedOperationException("Unimplemented method 'calcularAdicional'");
    }
    
}

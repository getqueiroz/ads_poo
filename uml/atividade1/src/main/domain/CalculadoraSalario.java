package uml.atividade1.src.main.domain;

public abstract class CalculadoraSalario {
    abstract float calcular(float horasTrabalhadas, Professor professor);

    abstract double calcularAdicional(Professor professor);

    float omelete() {
        return 1.0f;
    }
}

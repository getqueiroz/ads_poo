package uml.atividade1;

import java.time.LocalDate;
import java.time.Month;

import uml.atividade1.src.main.domain.CalculadoraSalario;
import uml.atividade1.src.main.domain.CalculadoraSalarioDefault;
import uml.atividade1.src.main.domain.CalculadoraSalarioDezembro;
import uml.atividade1.src.main.domain.Disciplina;
import uml.atividade1.src.main.domain.Professor;
import uml.atividade1.src.main.domain.enums.Area;
import uml.atividade1.src.main.domain.enums.Formacao;
import uml.atividade1.src.main.domain.enums.Sexo;

public class Application {
    public static void main(String[] args) {
        Disciplina novaDisciplina1 = new Disciplina(
            1L, 
            "POO", 
            "Choro, Lágrimas, Sofrimento",
            66
        );

        Disciplina novaDisciplina2 = new Disciplina(
            2L, 
            "Estrutura de Dados II", 
            "Lágrimas, Sofrimento, Choro",
            66
        );

        Professor novoProfessor1 = new Professor(
            1L, 
            "Guylherme Emmanuel", 
            Sexo.MASCULINO, 
            "123.456.789-00",
            LocalDate.parse("1987-12-10"), 
            "guylherme.emmanuel@unorte.edu.br",
            "17-98164461", 
            "Rua Sem Nome, Número 0", 
            Area.TECNOLOGIA,
            Formacao.Mestre,
            LocalDate.parse("2016-03-01"), 
            35.5f
        );
        
        novaDisciplina1.adicionaProfessor(novoProfessor1);
        novaDisciplina2.adicionaProfessor(novoProfessor1);

        CalculadoraSalario cSalario = null;
        LocalDate dataAtual =  LocalDate.of(2025, 11, 1);
        if(dataAtual.getMonth() == Month.DECEMBER) {
            cSalario = new CalculadoraSalarioDezembro();
        } else {
            cSalario = new CalculadoraSalarioDefault();
        }

        Float salario = novoProfessor1.calcularSalario(40, cSalario);
        System.out.println("Salário calculado: R$" + salario);
        
    }

    CalculadoraSalario calc = new CalculadoraSalarioDefault();
}
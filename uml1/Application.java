package uml1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import uml1.src.main.domain.Curso;
import uml1.src.main.domain.Disciplina;
import uml1.src.main.domain.Professor;
import uml1.src.main.domain.enums.Area;
import uml1.src.main.domain.enums.Formato;
import uml1.src.main.domain.enums.Sexo;

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
            "Mestre", 
            LocalDate.parse("2016-03-01"), 
            35.5f
        );

        Professor novoProfessor2 = new Professor(
            1L, 
            "Guylherme Emmanuel", 
            Sexo.MASCULINO, 
            "123.456.789-00",
            LocalDate.parse("1987-12-10"), 
            "guylherme.emmanuel@unorte.edu.br",
            "17-98164461", 
            "Rua Sem Nome, Número 0", 
            Area.TECNOLOGIA,
            "Mestre", 
            LocalDate.parse("2016-03-01"), 
            35.5f
        );

        String a1 = "a";
        String a2 = "a";
        
        if(a1 == a2);
        
        Float c1 = 3f;
        Float c2 = 3f;
        
        if(c1 == c2);

        novaDisciplina1.adicionaProfessor(novoProfessor1);
        novaDisciplina1.adicionaProfessor(novoProfessor1);


        // Curso novoCurso = new Curso(
        //     1L, 
        //     "Análise e Desenvolvimento de Sistemas", 
        //     4, 
        //     Formato.PRESENCIAL, 
        //     "O Curso com o melhor professor de POO", 
        //     2008, 
        //     600.0f, 
        //     Area.TECNOLOGIA
        // );

    }
}
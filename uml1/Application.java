package uml1;

import uml1.src.main.domain.Curso;
import uml1.src.main.domain.enums.Area;

public class Application {
    public static void main(String[] args) {
        Curso ads = new Curso(
            123L, 
            "ADS",
            4,
            Area.TECNOLOGIA
        );
        
        ads.setCargaHoraria(360);
        ads.setDescricao("Curso de Análise e Desenvolvimento de Sistemas");
        ads.setValorMensal(350.99f);
    }
}
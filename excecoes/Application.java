package excecoes;

import java.time.LocalDate;
import java.time.Month;

import excecoes.src.domain.Aluno;
import excecoes.src.exceptions.NullNomeException;

public class Application {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno(
                null, 
                LocalDate.of(1987, Month.DECEMBER, 10),
                null
            );
            
            System.out.println("Nenhuma exceção lançada");
        } catch(NullNomeException e) {
            System.out.println("O nome não pode ser nulo: " + e);
        } catch (IllegalStateException e) {
            System.out.println("O cpf não pode ser nulo: " + e);
        } finally {
            System.out.println("Finally executado...");
        }
    }
}

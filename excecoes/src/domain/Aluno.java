package excecoes.src.domain;

import java.time.LocalDate;
import excecoes.src.exceptions.NullNomeException;

public class Aluno {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    public Aluno(String nome, LocalDate dataNascimento, String cpf) {
        
        if(nome == null) {
            throw new NullNomeException("O atributo nome é obrigatório");
        }

        if(cpf == null) {
            throw new IllegalStateException("Qualquer coisa");
        }

        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

}

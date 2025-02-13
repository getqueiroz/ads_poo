package heranca.src.main;

public class PessoaFisica extends Cliente{
    
    private String cpf;

    public PessoaFisica(Long id, String nome, String cpf) {
        super(id, nome, Cliente.pessoaFisica);    
        this.cpf = cpf;
    
    }
    
    // getter and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

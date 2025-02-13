package heranca.src.main;

public class PessoaFisica extends Cliente{
    
    private Long id;
    private String cpf;


    public PessoaFisica(String nome, String cpf) {
        super(nome, Cliente.pessoaFisica);    
        this.id = super.generateId();
        this.cpf = cpf;
    }
    
    // getter and setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + ", Nome: " + super.getNome() + ", CPF: " + this.cpf;
    }
}

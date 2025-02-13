package heranca.src.main;

public class PessoaJuridica extends Cliente{
    private Long id;
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, Cliente.pessoaJuridica);
        this.id = super.generateId();
        this.cnpj = cnpj;
    }

    //getters and setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + ", Nome: " + super.getNome() + ", CNPJ: " + this.cnpj;
    }
}

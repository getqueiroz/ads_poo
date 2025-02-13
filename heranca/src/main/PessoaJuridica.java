package heranca.src.main;

public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(Long id, String nome, String cnpj) {
        super(id, nome, Cliente.pessoaJuridica);
        this.cnpj = cnpj;
    }

    //getters and setters
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

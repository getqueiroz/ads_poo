package heranca.src.main;

public class Cliente {
    private static Long id = 0L;

    private String nome;
    private String tipo; 

    public static final String pessoaFisica = "PESSOA_FISICA";
    public static final String pessoaJuridica = "PESSOA_JURICA";

    public Cliente(String nome,  String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // public Cliente(Long id, String nome, String tipo, String cpf, String cnpj) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.tipo = tipo;
    //     this.cpf = cpf;
    //     this.cnpj = cnpj;
    // }

    // public Cliente(Long id, String nome, String cpf) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.tipo = pessoaFisica;
    //     this.cpf = cpf;
    // // }

    // public Cliente(Long id, String nome, String cnpj) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.tipo = pessoaJuridica;
    //     this.cnpj = cnpj;
    // }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long generateId() {
        id += 1;
        return id;
    }
}

package heranca.src.main;

public class Cliente {
    private Long id;
    private String nome;
    private String tipo; 

    public static final String pessoaFisica = "PESSOA_FISICA";
    public static final String pessoaJuridica = "PESSOA_JURICA";

    public Cliente(Long id, String nome, String tipo) {
        this.id = id;
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
}

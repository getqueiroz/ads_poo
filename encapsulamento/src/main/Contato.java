package src.main;

public class Contato {
    private String nome;
    private String telefone;
    private String endereco;

    public Contato(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // getters and setters
    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setTelefone(String newTelefone) {
        this.telefone = newTelefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        String enderecoStr = "Nome: " + this.nome + ", Telefone: " + this.telefone;
        if(this.endereco != null) {
            enderecoStr += ", Endereço: " + this.endereco;
        }

        return enderecoStr;
    }
}

package uml1.src.main.domain;

import java.time.LocalDate;
import java.util.List;

import uml1.src.main.domain.enums.Area;
import uml1.src.main.domain.enums.Sexo;

public class Professor {
    private Long codigo;
    private String nome;
    private Sexo sexo;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String endereco;
    private Area area;
    private String formacao;
    private LocalDate dataContratacao;
    private Float valorHoraAula;
    private List<Disciplina> disciplinas;

    public Professor(Long codigo, String nome, Sexo sexo, String cpf, LocalDate dataNascimento, String email,
            String telefone, String endereco, Area area, String formacao, LocalDate dataContratacao,
            Float valorHoraAula) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.area = area;
        this.formacao = formacao;
        this.dataContratacao = dataContratacao;
        this.valorHoraAula = valorHoraAula;
    }

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Float getValorHoraAula() {
        return valorHoraAula;
    }
    public void setValorHoraAula(Float valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Float calcularSalario() {
        return 0f;
    }

    private Float calcularAdicional() {
        return 0f;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Professor other = (Professor) obj;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        return true;
    }
}

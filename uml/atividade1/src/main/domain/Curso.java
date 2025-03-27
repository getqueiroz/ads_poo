package uml1.src.main.domain;

import java.util.List;

import uml1.src.main.domain.enums.Area;
import uml1.src.main.domain.enums.Formato;

public class Curso {
    private Long codigo;
    private String nome;
    private Integer duracao;
    private Formato formato;
    private String descricao;
    private Integer cargaHoraria;
    private Float valorMensal;
    private Area area;
    private List<Disciplina> disciplinas;

    public Curso(Long codigo, String nome, Integer duracao, Formato formato, String descricao, Integer cargaHoraria,
            Float valorMensal, Area area, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.formato = formato;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.valorMensal = valorMensal;
        this.area = area;
        this.disciplinas = disciplinas;
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(Float valorMensal) {
        this.valorMensal = valorMensal;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
}

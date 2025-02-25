package uml1.src.main.domain;

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

    public Curso(Long codigo, String nome, Integer duracao, Area area) {
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.area = area;
    }
    
    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Formato getFormato() {
        return formato;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public Float getValorMensal() {
        return valorMensal;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValorMensal(Float valorMensal) {
        this.valorMensal = valorMensal;
    }
}

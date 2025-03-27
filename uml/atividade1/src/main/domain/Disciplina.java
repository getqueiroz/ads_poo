package uml.atividade1.src.main.domain;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Long codigo;
    private String nome;
    private String ementa;
    private Integer cargaHoraria;
    private List<Professor> professores;
    private List<Curso> cursos;

    Disciplina(){
        
    }

    public Disciplina(Long codigo, String nome, String ementa, Integer cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
        this.professores = new ArrayList<Professor>();
    }

    public boolean adicionaProfessor(Professor professor) {
        int len = this.professores.size();

        for(int i = 0; i < len; i++) {
            if(this.professores.get(i) == professor) {
                return false;
            }
        }
        professores.add(professor);
        return true;
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
    public String getEmenta() {
        return ementa;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
}

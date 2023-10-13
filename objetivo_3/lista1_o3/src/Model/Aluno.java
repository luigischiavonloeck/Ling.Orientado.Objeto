package Model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Long matricula;
    private String nome;
    private String sobrenome;
    private List<Disciplina> disciplinasList = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(Long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplinasList() {
        return disciplinasList;
    }

    public void setDisciplinasList(List<Disciplina> disciplinasList) {
        this.disciplinasList = disciplinasList;
    }



    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", disciplinas=" + disciplinasList +
                '}';
    }
}
